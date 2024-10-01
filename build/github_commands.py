from config import *
from github import Github
import docker
import os
from abstract_command import AbstractCommand

class GitHubCommand(AbstractCommand):
    def __init__(self, config: Config):
        super().__init__(config)

    def git_hub(self):
        return Github(self.github_token)
    
    def git_hub_repository(self):
        return self.git_hub.get_repo(self.github_repository)


class GitHubService:
    def __init__(self, dest_dir):
        self.dest_dir = dest_dir

    def upload_zip_file(self, zip_filename, release_tag="latest"):
        """Upload the zip file to GitHub Package Registry."""

        # Initialize GitHub instance
        g = Github(GITHUB_TOKEN)

        # Get repository
        repo = g.get_repo(GITHUB_REPOSITORY)

        # Get release by tag
        try:
            release = repo.get_release(release_tag)
        except Exception as e:
            print(f"Error: Failed to get release information. {e}")
            return False

        # Upload asset
        try:
            with open(zip_filename, 'rb') as file_data:
                release.upload_asset(path=zip_filename, name=os.path.basename(zip_filename), label=os.path.basename(zip_filename), content_type='application/zip')
            print(f"Uploaded {zip_filename} to GitHub successfully.")
            return True
        except Exception as e:
            print(f"Error: Failed to upload asset. {e}")
            return False

    def upload_docker_image(self, image_name):
        """Upload the Docker image to GitHub Packages."""
        client = docker.from_env()
        image = client.images.get(image_name)

        # Tag the image
        repo_name = f"{GITHUB_DOCKER_REGISTRY}/{GITHUB_REPOSITORY}"
        tagged_image = f"{repo_name}:{SYSTEM}-{ARCHITECTURE}"
        image.tag(tagged_image)

        # Log in to GitHub Docker registry
        print(f"Logging in to GitHub Docker registry as {GITHUB_USERNAME}...")
        client.login(username=GITHUB_USERNAME, password=GITHUB_TOKEN, registry=GITHUB_DOCKER_REGISTRY)

        # Push the image
        print(f"Pushing Docker image {tagged_image} to GitHub Packages...")
        push_logs = client.images.push(tagged_image, stream=True, decode=True)
        for log in push_logs:
            if 'status' in log:
                print(log['status'])
            elif 'error' in log:
                print(log['error'])

        print(f"Pushed Docker image {tagged_image} to GitHub Packages successfully.")


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


