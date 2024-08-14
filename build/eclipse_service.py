import os
import shutil
from config import *
import requests
import docker

class EclipseService:
    def __init__(self, config : Config):
        self.config = config
        self.eclipse_exec_dir = os.path.join(self.config.dest_dir, "eclipse", "eclipse")

    def move_jdk_to_eclipse(self):
        """Move the extracted JDK into the Eclipse folder and rename it."""
        extracted_jdk_path = os.path.join(self.config.dest_dir, "jdk", self.config.version_file_jdk_short)
        eclipse_dirname = [name for name in os.listdir(os.path.join(self.config.dest_dir, "eclipse")) if name.startswith("eclipse")][0]
        eclipse_path = os.path.join(os.path.join(self.config.dest_dir, "eclipse"), eclipse_dirname)

        if not os.path.isdir(extracted_jdk_path):
            print(f"Error: Extracted JDK path {extracted_jdk_path} does not exist.")
            return False

        jdk_dest_path = os.path.join(eclipse_path, "jdk")
        if os.path.isdir(jdk_dest_path) and os.listdir(jdk_dest_path):
            print(f"{jdk_dest_path} already contains jdk, skipping moving.")
            return True

        try:
            shutil.move(extracted_jdk_path, jdk_dest_path)
            print(f"Moved JDK to {jdk_dest_path} successfully.")
            return True
        except shutil.Error as e:
            print(f"Error: Moving JDK failed due to {e}")
            return False

    def __remove_unnecessary_directories_files(self):
        self.__remove_directory("org.eclipse.equinox.app")
        self.__remove_files(".log")
    
    def __remove_directory(self, directory):
        dir = os.path.join(self.eclipse_exec_dir, "configuration", directory)
        if os.path.exists(dir):
            shutil.rmtree(dir)

    def __remove_files(self, files):
        cfgDir = os.path.join(self.eclipse_exec_dir, "configuration")
        files_to_remove = [f for f in os.listdir(cfgDir) if f.endswith(files)]
        for file in files_to_remove:
            os.remove(os.path.join(cfgDir, file))


    def update_eclipse_ini(self):
        """Update the eclipse.ini file to include the JDK path."""
        eclipse_ini = os.path.join(self.eclipse_exec_dir, "eclipse.ini")
        vm_path = 'jdk/bin/java'

        with open(eclipse_ini, 'r') as file:
            lines = file.readlines()

        # Check if the -vm argument is already present
        vm_arg_present = False
        for line in lines:
            if line.strip() == '-vm':
                vm_arg_present = True
                break

        # If -vm is not present, insert it before -vmargs
        if not vm_arg_present:
            new_lines = []
            vm_inserted = False
            for line in lines:
                if not vm_inserted and line.strip() == '-vmargs':
                    new_lines.append('-vm\n')
                    new_lines.append(f'{vm_path}\n')
                    vm_inserted = True
                new_lines.append(line)

            # Write the updated contents back to the eclipse.ini file
            with open(eclipse_ini, 'w') as file:
                file.writelines(new_lines)

        print("eclipse.ini file updated successfully.")

    def populate_cache(self, c):
        """Populate the cache file with installed components."""
        if os.path.isfile(self.config.installed_cache):
            os.remove(self.config.installed_cache)

        result = c.run(
            f"{self.eclipse_exec_dir}/eclipse -nosplash -application org.eclipse.equinox.p2.director -listInstalledRoots",
            hide=True,
            warn=True
        )

        with open(self.config.installed_cache, 'w') as f:
            f.write(result.stdout)


    def is_installed(self, iu, installed_cache):
        """Check if an installable unit is already installed."""
        if os.path.isfile(installed_cache):
            with open(installed_cache, 'r') as f:
                installed_units = f.read().splitlines()
                return any(iu == item.split('/')[0] for item in installed_units)
        return False

    def install_eclipse_components(self, c):
        """Install each component if not already installed."""
        self.populate_cache(c)
        for iu in self.config.config['eclipse']['install_units']:
            if self.is_installed(iu, self.config.installed_cache):
                print(f"{iu} is already installed.")
            else:
                print(f"Installing {iu}...")
                result = c.run(
                    f"{self.eclipse_exec_dir}/eclipse -nosplash "
                    f"-application org.eclipse.equinox.p2.director "
                    f"-repository {self.config.get_eclipse_url_string()} "
                    f"-installIU {iu} "
                    f"-destination {self.eclipse_exec_dir} "
                    f"-profile SDKProfile "
                )
                if result == 0:
                    with open(self.config.installed_cache, 'a') as f:
                        f.write(f"{iu}\n")

        print("Eclipse components installation completed.")

    def package_eclipse(self):
        """Package the Eclipse directory into a zip file."""
        eclipse_dir = os.path.join(self.config.dest_dir, "eclipse")
        zip_filename = self.zip_file_name()

        if os.path.isfile(zip_filename):
            print(f"{zip_filename} already exists, skipping packaging.")
            return True

        self.__remove_unnecessary_directories_files()

        print(f"Packing {eclipse_dir} into {zip_filename}...")

        try:
            shutil.make_archive(zip_filename.replace('.zip', ''), 'zip', eclipse_dir)
            print(f"Packaged Eclipse into {zip_filename} successfully.")
            return True
        except shutil.Error as e:
            print(f"Error: Packaging failed due to {e}")
            return False

    def zip_file_name(self):
        zip_filename = os.path.join(self.config.dest_dir, f"eclipse_{self.config.system}_{self.config.architecture}_{self.config.latest_eclipse_version}_{self.config.version_jdk}.zip")
        return zip_filename

    def create_dockerfile(self):
        zip_filename = self.zip_file_name()

        dockerfile_content = f"""
        FROM ibm-semeru-runtimes:open-{self.config.version_jdk_docker}-jdk

        # Install utilites
        RUN apt-get update && apt-get -y install apt-utils && apt-get -y install tar && apt-get -y install gzip && apt-get -y install wget && apt-get -y install unzip;

        COPY {os.path.basename(zip_filename)} /opt/
        RUN unzip /opt/{os.path.basename(zip_filename)} -d /opt && rm /opt/{os.path.basename(zip_filename)}

        # Add the Eclipse installation directory to the PATH
        ENV PATH=/opt/eclipse:$PATH

        # Set the working directory to the Eclipse installation directory
        WORKDIR /opt/eclipse
        """

        dockerfile_path = os.path.join(self.config.dest_dir, "Dockerfile")
        with open(dockerfile_path, 'w') as dockerfile:
            dockerfile.write(dockerfile_content)

        return dockerfile_path

    def build_docker_image(self, dockerfile_path, image_name):
        client = docker.from_env()
        client.images.build(path=self.config.dest_dir, dockerfile=dockerfile_path, tag=image_name, quiet=False)
        print(f"Docker image {image_name} created.")

    def create_docker_container(self, c, image_name, container_name):
        client = docker.from_env()
        # Stop and remove the existing container if it exists
        try:
            container = client.containers.get(container_name)
            print(f"Stopping existing container {container_name}...")
            container.stop()
            print(f"Removing existing container {container_name}...")
            container.remove()
        except docker.errors.NotFound:
            pass

        container = client.containers.run(image_name, name=container_name, detach=True, tty=True)
        print(f"Docker container {container_name} created and running.")

        # Start an interactive bash session
        print(f"To start an interactive bash session, run:\n\ndocker exec -it {container_name} /bin/bash")

    def upload_docker_image(self, image_name):
        """Upload the Docker image to GitHub Packages."""
        client = docker.from_env()
        image = client.images.get(image_name)

        # Tag the image
        repo_name = f'{self.config.config["GITHUB_DOCKER_REGISTRY"]}/{self.config.config["GITHUB_REPOSITORY"]}'
        tagged_image = f"{repo_name}:{self.config.system}-{self.config.architecture}"
        image.tag(tagged_image)

        # Log in to GitHub Docker registry
        print(f'Logging in to GitHub Docker registry as {self.config.config["github_username"]}...')
        client.login(username=self.config.config["github_username"], password=self.config.config["github_token"], registry=self.config.config["GITHUB_DOCKER_REGISTRY"])

        # Push the image
        print(f"Pushing Docker image {tagged_image} to GitHub Packages...")
        push_logs = client.images.push(tagged_image, stream=True, decode=True)
        for log in push_logs:
            if 'status' in log:
                print(log['status'])
            elif 'error' in log:
                print(log['error'])
