from invoke import task
from pathlib import Path
from config import Config
from download_commands import *
from eclipse_commands import *
from docker_commands import *

config = Config()
dest_dir = Path(config.dest_dir)

def log_message(message):
    print(f"--> {message}")

def ensure_directory_exists(directory):
    if not directory.exists():
        log_message(f"Creating directory {directory}...")
        directory.mkdir(parents=True, exist_ok=True)
        log_message(f"Directory {directory} is ready.")
    else:
        log_message(f"Directory {directory} already exists.")

@task
def clean_dest_dir(c):
    if dest_dir.exists():
        log_message(f"Cleaning up destination directory {dest_dir}...")
        # Recursively remove the directory and all its contents
        shutil.rmtree(dest_dir)
        log_message(f"Cleaned up {dest_dir}.")
    else:
        log_message(f"Destination directory {dest_dir} does not exist.")
@task
def create_dest_dir(c):
    ensure_directory_exists(dest_dir)

# Download tasks
@task(pre=[create_dest_dir])
def download_and_extract_jdk(c):
    log_message("Downloading and extracting JDK...")
    DownloadJdkCommand(config).execute()

@task(pre=[create_dest_dir])
def download_and_extract_eclipse(c):
    log_message("Downloading and extracting Eclipse...")
    DownloadEclipseCommand(config).execute()

@task(pre=[create_dest_dir])
def download_and_extract_ant(c):
    log_message("Downloading and extracting Ant...")
    DownloadAntCommand(config).execute()

# Installation tasks
@task(pre=[download_and_extract_jdk, download_and_extract_eclipse])
def move_jdk_to_eclipse(c):
    log_message("Moving JDK to Eclipse...")
    MoveJdkToEclipseCommand(config).execute()

@task(pre=[move_jdk_to_eclipse])
def update_eclipse_ini(c):
    log_message("Updating eclipse.ini...")
    UpdateEclipseIniCommand(config).execute()

@task(pre=[update_eclipse_ini])
def install_eclipse_components(c):
    log_message("Installing Eclipse components...")
    InstallEclipseComponentsCommand(config, c).execute()

@task(pre=[install_eclipse_components])
def package_eclipse(c):
    log_message("Packaging Eclipse...")
    PackageEclipseCommand(config).execute()

# # Upload task
# @task(pre=[package_eclipse])
# def upload_to_github(c):
#     log_message("Uploading to GitHub...")
#     UploadToGithubCommand(config).execute()

# Docker tasks
@task(pre=[package_eclipse])
def create_docker_image(c):
    log_message("Creating Docker image...")
    BuildDockerImageCommand(config).execute()

@task(pre=[create_docker_image])
def run_docker_container(c):
    log_message("Running Docker container...")
    CreateDockerContainerCommand(config).execute()

# Docker image upload task
@task(pre=[create_docker_image])
def upload_docker_image(c):
    log_message("Uploading Docker image...")
    UploadDockerImageCommand(config).execute()
