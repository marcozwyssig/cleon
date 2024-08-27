import os
import shutil
import logging
from config import *
from abstract_command import AbstractCommand

# Setup logging
logging.basicConfig(level=logging.INFO, format='%(asctime)s - %(levelname)s - %(message)s')

class MoveJdkToEclipseCommand(AbstractCommand):
    def execute(self):
        extracted_jdk_path = os.path.join(self.config.dest_dir, self.config.jdk_dir, self.config.version_file_jdk_short)
        eclipse_dir = self.__find_eclipse_directory()

        if not os.path.isdir(extracted_jdk_path):
            logging.error(f"Extracted JDK path {extracted_jdk_path} does not exist.")
            return False

        jdk_dest_path = os.path.join(eclipse_dir, "jdk")
        if os.path.isdir(jdk_dest_path) and os.listdir(jdk_dest_path):
            logging.info(f"{jdk_dest_path} already contains JDK, skipping move.")
            return True

        return self.__move_directory(extracted_jdk_path, jdk_dest_path, "JDK")

    def __find_eclipse_directory(self):
        eclipse_root = os.path.join(self.config.dest_dir, self.config.eclipse_dir)
        eclipse_dirs = [name for name in os.listdir(eclipse_root) if name.startswith("eclipse")]
        if not eclipse_dirs:
            raise FileNotFoundError("No Eclipse directory found.")
        return os.path.join(eclipse_root, eclipse_dirs[0])

    def __move_directory(self, src, dest, name):
        try:
            shutil.move(src, dest)
            logging.info(f"Moved {name} to {dest} successfully.")
            return True
        except shutil.Error as e:
            logging.error(f"Moving {name} failed due to {e}")
            return False

class RemoveUnnecessaryDirectoriesFilesCommand(AbstractCommand):
    def execute(self):
        self.__remove_directory("org.eclipse.equinox.app")
        self.__remove_files(".log")

    def __remove_directory(self, directory):
        dir_path = os.path.join(self.config.dest_dir, self.config.eclipse_dir, "eclipse", "configuration", directory)
        if os.path.exists(dir_path):
            shutil.rmtree(dir_path)
            logging.info(f"Removed directory {dir_path}.")

    def __remove_files(self, file_extension):
        config_dir = os.path.join(self.config.dest_dir, self.config.eclipse_dir, "eclipse", "configuration")
        files_to_remove = [f for f in os.listdir(config_dir) if f.endswith(file_extension)]
        for file in files_to_remove:
            os.remove(os.path.join(config_dir, file))
            logging.info(f"Removed file {file}.")

class UpdateEclipseIniCommand(AbstractCommand):
    def execute(self):
        eclipse_ini = os.path.join(self.config.dest_dir, self.config.eclipse_dir, "eclipse", "eclipse.ini")
        vm_path = 'jdk/bin/java'

        with open(eclipse_ini, 'r') as file:
            lines = file.readlines()

        if '-vm' not in [line.strip() for line in lines]:
            self.__update_eclipse_ini(lines, eclipse_ini, vm_path)
            logging.info("eclipse.ini file updated successfully.")

    def __update_eclipse_ini(self, lines, ini_path, vm_path):
        new_lines = []
        vm_inserted = False
        for line in lines:
            new_lines.append(line)
            if not vm_inserted and line.strip() == '-vmargs':
                new_lines.insert(-1, f'-vm\n{vm_path}\n')
                vm_inserted = True

        with open(ini_path, 'w') as file:
            file.writelines(new_lines)

class InstallEclipseComponentsCommand(AbstractCommand):
    def __init__(self, config, c):
        super().__init__(config)
        self.c = c

    def execute(self):
        self.__populate_cache()
        
        for iu in self.config.config['eclipse']['install_units']:
            if self.is_installed(iu):
                logging.info(f"{iu} is already installed.")
            else:
                self.__install_component(iu)
        
        logging.info("Eclipse components installation completed.")

    def is_installed(self, iu):
        if os.path.isfile(self.config.installed_cache):
            with open(self.config.installed_cache, 'r') as f:
                installed_units = f.read().splitlines()
                return any(iu == item.split('/')[0] for item in installed_units)
        return False        

    def __populate_cache(self):
        if os.path.isfile(self.config.installed_cache):
            os.remove(self.config.installed_cache)

        eclipse_exec_dir = os.path.join(self.config.dest_dir, self.config.eclipse_dir, "eclipse")
        result = self.c.run(
            f"{eclipse_exec_dir}/eclipse -nosplash -application org.eclipse.equinox.p2.director -listInstalledRoots",
            hide=True,
            warn=True
        )

        with open(self.config.installed_cache, 'w') as f:
            f.write(result.stdout)

    def __install_component(self, iu):
        eclipse_exec_dir = os.path.join(self.config.dest_dir, self.config.eclipse_dir, "eclipse")
        logging.info(f"Installing {iu}...")
        result = self.c.run(
            f"{eclipse_exec_dir}/eclipse -nosplash "
            f"-application org.eclipse.equinox.p2.director "
            f"-repository {self.config.get_eclipse_url_string()} "
            f"-installIU {iu} "
            f"-destination {eclipse_exec_dir} "
            f"-profile SDKProfile "
        )
        if result == 0:
            with open(self.config.installed_cache, 'a') as f:
                f.write(f"{iu}\n")

class PackageEclipseCommand(AbstractCommand):
    def execute(self):
        eclipse_dir = os.path.join(self.config.dest_dir, self.config.eclipse_dir)
        zip_filename = self.zip_file_name()

        if os.path.isfile(zip_filename):
            logging.info(f"{zip_filename} already exists, skipping packaging.")
            return True

        self.__remove_unnecessary_files()
        logging.info(f"Packing {eclipse_dir} into {zip_filename}...")

        return self.__create_zip_archive(eclipse_dir, zip_filename)

    def zip_file_name(self):
        return os.path.join(self.config.dest_dir, f"eclipse_{self.config.system}_{self.config.architecture}_{self.config.latest_eclipse_version}_{self.config.version_jdk}.zip")

    def __remove_unnecessary_files(self):
        remove_unnecessary_cmd = RemoveUnnecessaryDirectoriesFilesCommand(self.config)
        remove_unnecessary_cmd.execute()

    def __create_zip_archive(self, src_dir, zip_filename):
        try:
            shutil.make_archive(zip_filename.replace('.zip', ''), 'zip', src_dir)
            logging.info(f"Packaged Eclipse into {zip_filename} successfully.")
            return True
        except shutil.Error as e:
            logging.error(f"Error: Packaging failed due to {e}")
            return False
