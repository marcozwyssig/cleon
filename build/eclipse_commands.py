import os
import shutil
import logging
import zipfile

from config import *
from abstract_command import AbstractCommand
from config import Config

# Setup logging
logging.basicConfig(level=logging.INFO, format='%(asctime)s - %(levelname)s - %(message)s')

class EclipseCommand(AbstractCommand):
    def __init__(self, config: Config):
        super().__init__(config)

    def is_macos(self):
        return self.config.system == "darwin"

    def eclipse_directory(self):
        """
        Returns the Eclipse installation directory, accounting for the platform.
        """
        return self._eclipse_path(mac_subdirectory="Contents/Eclipse", non_mac_subdirectory="")

    def eclipse_execution_directory(self):
        """
        Returns the directory containing the Eclipse executable, depending on the platform.
        """
        return self._eclipse_path(mac_subdirectory="Contents/MacOS", non_mac_subdirectory="")

    def eclipse_package_directory(self):
        """
        Returns the root package directory where Eclipse is installed.
        """
        if self.is_macos:
            return os.path.dirname(self._eclipse_root_directory())
        else:
            return self._eclipse_root_directory()

    def zip_file_name(self):
        return os.path.join(self.config.dest_dir, f"eclipse_{self.config.system}_{self.config.architecture}_{self.config.latest_eclipse_version}_{self.config.version_jdk}.zip")

    def _eclipse_path(self, mac_subdirectory: str, non_mac_subdirectory: str):
        """
        Returns the full path to the Eclipse directory based on the platform and subdirectory.
        """
        eclipse_root = self._eclipse_root_directory()
        subdirectory = mac_subdirectory if self.is_macos() else non_mac_subdirectory
        eclipse_path = os.path.join(eclipse_root, subdirectory)

        if not os.path.exists(eclipse_path):
            raise FileNotFoundError(f"Eclipse path not found: {eclipse_path}")

        return eclipse_path

    def _eclipse_root_directory(self):
        """
        Finds the root directory where Eclipse is installed.
        """
        eclipse_root = os.path.join(self.config.dest_dir, self.config.eclipse_dir)
        
        if self.is_macos():
            # macOS: look for 'Eclipse.app'
            eclipse_dirs = [name for name in os.listdir(eclipse_root) if name.startswith("Eclipse.app")]
        else:
            # Non-macOS: look for 'eclipse'
            eclipse_dirs = [name for name in os.listdir(eclipse_root) if name.startswith("eclipse")]

        if not eclipse_dirs:
            raise FileNotFoundError(f"No Eclipse directory found for {'macOS' if self.is_macos() else 'non-macOS'}.")

        return os.path.join(eclipse_root, eclipse_dirs[0])
    

class MoveJdkToEclipseCommand(EclipseCommand):
    def execute(self):
        extracted_jdk_path = os.path.join(self.config.dest_dir, self.config.jdk_dir, self.config.version_file_jdk_short)
        eclipse_dir = self.eclipse_directory()

        if not os.path.isdir(extracted_jdk_path):
            logging.error(f"Extracted JDK path {extracted_jdk_path} does not exist.")
            return False

        jdk_dest_path = os.path.join(eclipse_dir, "jdk")
        if os.path.isdir(jdk_dest_path) and os.listdir(jdk_dest_path):
            logging.info(f"{jdk_dest_path} already contains JDK, skipping move.")
            return True

        return self.__move_directory(extracted_jdk_path, jdk_dest_path, "JDK")

    def __move_directory(self, src, dest, name):
        try:
            shutil.move(src, dest)
            logging.info(f"Moved {name} to {dest} successfully.")
            return True
        except shutil.Error as e:
            logging.error(f"Moving {name} failed due to {e}")
            return False

class RemoveUnnecessaryDirectoriesFilesCommand(EclipseCommand):
    def execute(self):
        self.__remove_directory("org.eclipse.equinox.app")
        self.__remove_files(".log")

    def __remove_directory(self, directory):
        dir_path = os.path.join(self.eclipse_directory(), "configuration", directory)
        if os.path.exists(dir_path):
            shutil.rmtree(dir_path)
            logging.info(f"Removed directory {dir_path}.")

    def __remove_files(self, file_extension):
        config_dir = os.path.join(self.eclipse_directory(), "configuration")
        files_to_remove = [f for f in os.listdir(config_dir) if f.endswith(file_extension)]
        for file in files_to_remove:
            os.remove(os.path.join(config_dir, file))
            logging.info(f"Removed file {file}.")

class UpdateEclipseIniCommand(EclipseCommand):
    REQUIRED_VM_OPTIONS = {
        'macos': '../Eclipse/jdk/Contents/Home/lib/libjli.dylib',
        'default': 'jdk/bin/java'
    }

    REQUIRED_JVM_OPTIONS = {
        '-Xmx16g',
        '-Xms256m',
        '-XX:+UseG1GC',
        '-XX:+UseStringDeduplication'
    }

    def execute(self):
        eclipse_ini = os.path.join(self.eclipse_directory(), "eclipse.ini")

        # Read the eclipse.ini file and preserve the newlines
        with open(eclipse_ini, 'r') as file:
            lines = file.readlines()

        # Check if '-vm' exists in the file
        if not any(line.strip() == '-vm' for line in lines):
            self.__update_eclipse_ini(lines, eclipse_ini)
            logging.info("eclipse.ini file updated successfully.")
        else:
            logging.info("'-vm' option already exists in eclipse.ini.")

    def __update_eclipse_ini(self, lines, ini_path):
        """
        Updates the eclipse.ini file with the '-vm' entry and the required JVM options.
        Inserts the '-vm' just before the '-vmargs' section and JVM options after '-vmargs'.
        """
        new_lines = []
        vm_inserted = False
        vmargs_found = False

        # Get the correct VM path based on the OS
        vm_path = self.REQUIRED_VM_OPTIONS['macos'] if self.is_macos() else self.REQUIRED_VM_OPTIONS['default']

        for line in lines:
            # Insert '-vm' and the path just before '-vmargs'
            if not vm_inserted and line.strip() == '-vmargs':
                new_lines.append('-vm\n')
                new_lines.append(f'{vm_path}\n')
                vm_inserted = True

            new_lines.append(line)
            
            # Detect if '-vmargs' is reached, so we can append JVM options
            if line.strip() == '-vmargs':
                vmargs_found = True

        # Add the JVM options if '-vmargs' exists
        if vmargs_found:
            for option in self.REQUIRED_JVM_OPTIONS:
                if not any(option in line for line in lines):  # Avoid duplicates
                    new_lines.append(f'{option}\n')

        # Write the updated lines back to the eclipse.ini file, preserving newlines
        with open(ini_path, 'w') as file:
            file.writelines(new_lines)

        logging.info("Added '-vm' and required JVM options successfully.")

class InstallEclipseComponentsCommand(EclipseCommand):
    def __init__(self, config, c):
        super().__init__(config)
        self.c = c

    def __ensure_eclipse_user_home(self):
        home_dir = os.path.expanduser("~")
        eclipse_dir = os.path.join(home_dir, '.eclipse')
        current_dir = os.getcwd()  # Use current directory for the zip file
        zip_file_name = '.eclipse.zip'

        if not os.path.exists(eclipse_dir):
            zip_file = os.path.join(current_dir, zip_file_name)
            if not os.path.exists(zip_file):
                raise FileNotFoundError(f"Zip file '{zip_file}' not found in the current directory.")
            try:
                with zipfile.ZipFile(zip_file, 'r') as zip_ref:
                    zip_ref.extractall(home_dir)
                print(f"Extracted '{zip_file}' to '{home_dir}'.")
            except zipfile.BadZipFile:
                print(f"The file '{zip_file}' is not a valid zip file.")
            except Exception as e:
                print(f"An error occurred while extracting '{zip_file}': {e}")
        else:
            print(f"The directory '{eclipse_dir}' already exists.")

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
        eclipse_exec_dir = os.path.join(self.eclipse_execution_directory())
        result = self.c.run(
            f"{eclipse_exec_dir}/eclipse -nosplash -application org.eclipse.equinox.p2.director -listInstalledRoots",
            hide=True,
            warn=True
        )

        with open(self.config.installed_cache, 'w') as f:
            f.write(result.stdout)

    def __install_component(self, iu):
        eclipse_exec_dir = self.eclipse_execution_directory()
        eclipse_dir = self.eclipse_directory();
        logging.info(f"Installing {iu}...")
        result = self.c.run(
            f"{eclipse_exec_dir}/eclipse -nosplash "
            f"-application org.eclipse.equinox.p2.director "
            f"-repository {self.config.get_eclipse_url_string()} "
            f"-installIU {iu} "
            f"-destination {eclipse_dir} "
            f"-profile SDKProfile "
        )
        if result == 0:
            with open(self.config.installed_cache, 'a') as f:
                f.write(f"{iu}\n")

class PackageEclipseCommand(EclipseCommand):
    def execute(self):
        eclipse_dir = self.eclipse_package_directory()
        zip_filename = self.zip_file_name()

        if os.path.isfile(zip_filename):
            logging.info(f"{zip_filename} already exists, skipping packaging.")
            return True

        self.__remove_unnecessary_files()
        logging.info(f"Packing {eclipse_dir} into {zip_filename}...")

        return self.__create_zip_archive(eclipse_dir, zip_filename)

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

class InstallEclipseCommand(EclipseCommand):
    def __init__(self, config, install_directory: str):
        super().__init__(config)
        self.install_directory = install_directory

    def execute(self):
        zip_filename = self.zip_file_name()

        if not os.path.exists(self.install_directory):
            print(f"Creating {self.install_directory}...")
            os.makedirs(self.install_directory)
        else:
            print(f"{self.install_directory} already exists.")
            shutil.rmtree(self.install_directory)
            print(f"Deleted {self.install_directory}.")
            os.makedirs(self.install_directory)
            print(f"Created {self.install_directory}.")

        full_zip_filename = os.path.join(self.install_directory, zip_filename)        
        try:
            print(f"Extracting {zip_filename} to {self.install_directory}...")
            shutil.unpack_archive(full_zip_filename, self.install_directory)
            print(f"Extracted {zip_filename} to {self.install_directory} successfully.")
            return True
        except shutil.Error as e:
            logging.error(f"Error: Extracting failed due to {e}")
            return False
