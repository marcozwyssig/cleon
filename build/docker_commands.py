import os
import docker
import logging
from abstract_command import AbstractCommand
from config import Config

# Set up logging
logging.basicConfig(level=logging.INFO)
logger = logging.getLogger(__name__)

IMAGE_NAME = "eclipse_image"

class BuildDockerImageCommand(AbstractCommand):
    def __init__(self, config: Config):
        super().__init__(config)

    def get_docker_file_content(self):
        zip_filename = os.path.basename(self.zip_file_name())

        return f"""
        FROM ibm-semeru-runtimes:open-{self.config.version_jdk_docker}-jdk

        # Install utilities
        RUN apt-get update && apt-get -y install apt-utils tar gzip wget unzip

        COPY {zip_filename} /opt/
        RUN unzip /opt/{zip_filename} -d /opt && rm /opt/{zip_filename}

        # Add the Eclipse installation directory to the PATH
        ENV PATH=/opt/eclipse:$PATH

        # Set the working directory to the Eclipse installation directory
        WORKDIR /opt/eclipse
        """

    def create_docker_file(self, dockerfile_content: str) -> str:
        dockerfile_path = os.path.join(self.config.directory_manager.dest_dir, "Dockerfile")
        try:
            with open(dockerfile_path, 'w') as dockerfile:
                dockerfile.write(dockerfile_content)
            logger.info(f"Dockerfile created at {dockerfile_path}")
        except IOError as e:
            logger.error(f"Failed to create Dockerfile: {e}")
            raise
        return dockerfile_path

    def execute(self):
        client = docker.from_env()
        dockerfile_content = self.get_docker_file_content()
        dockerfile_path = self.create_docker_file(dockerfile_content)

        try:
            client.images.build(path=self.config.directory_manager.dest_dir, dockerfile=dockerfile_path, tag=IMAGE_NAME, quiet=False)
            logger.info(f"Docker image {IMAGE_NAME} created.")
        except docker.errors.BuildError as e:
            logger.error(f"Failed to build Docker image: {e}")
            raise

class CreateDockerContainerCommand(AbstractCommand):
    def execute(self):
        client = docker.from_env()
        try:
            container = client.containers.get(IMAGE_NAME)
            logger.info(f"Stopping existing container {IMAGE_NAME}...")
            container.stop()
            logger.info(f"Removing existing container {IMAGE_NAME}...")
            container.remove()
        except docker.errors.NotFound:
            logger.info(f"No existing container named {IMAGE_NAME} found. Creating a new one.")

        try:
            container = client.containers.run(IMAGE_NAME, name=IMAGE_NAME, detach=True, tty=True)
            logger.info(f"Docker container {IMAGE_NAME} created and running.")
            logger.info(f"To start an interactive bash session, run:\n\ndocker exec -it {IMAGE_NAME} /bin/bash")
        except docker.errors.ContainerError as e:
            logger.error(f"Failed to create Docker container: {e}")
            raise

class UploadDockerImageCommand(AbstractCommand):
    def execute(self):
        client = docker.from_env()
        try:
            image = client.images.get(IMAGE_NAME)
        except docker.errors.ImageNotFound as e:
            logger.error(f"Docker image {IMAGE_NAME} not found: {e}")
            raise

        repo_name = f'{self.config.config["GITHUB_DOCKER_REGISTRY"]}/{self.config.config["GITHUB_REPOSITORY"]}'
        tagged_image = f"{repo_name}:{self.config.system}-{self.config.architecture}"

        try:
            image.tag(tagged_image)
            logger.info(f"Image tagged as {tagged_image}")

            logger.info(f'Logging in to GitHub Docker registry as {self.config.config["github_username"]}...')
            client.login(username=self.config.config["github_username"], password=self.config.config["github_token"], registry=self.config.config["GITHUB_DOCKER_REGISTRY"])

            logger.info(f"Pushing Docker image {tagged_image} to GitHub Packages...")
            push_logs = client.images.push(tagged_image, stream=True, decode=True)
            for log in push_logs:
                if 'status' in log:
                    logger.info(log['status'])
                elif 'error' in log:
                    logger.error(log['error'])
                    raise docker.errors.APIError(log['error'])
        except docker.errors.APIError as e:
            logger.error(f"Failed to upload Docker image: {e}")
            raise
