from config import *
from github import Github
import docker
import os

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


    def create_or_update_workflow_file(github_token, repo_name, branch, commit_message, file_path, file_content):
        # Initialize GitHub instance
        g = Github(github_token)
        repo = g.get_repo(repo_name)

        # Check if the file already exists
        try:
            contents = repo.get_contents(file_path, ref=branch)
            repo.update_file(contents.path, commit_message, file_content, contents.sha, branch=branch)
            print(f"Updated {file_path} in {repo_name} on branch {branch}.")
        except:
            repo.create_file(file_path, commit_message, file_content, branch=branch)
            print(f"Created {file_path} in {repo_name} on branch {branch}.")
