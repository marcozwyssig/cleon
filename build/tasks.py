from invoke import task
import os
from config import Config
from download_commands import *
from eclipse_service import EclipseService

config = Config()

@task
def clean_dest_dir(c):
    print(f"--> Cleaning up destination directory {config.dest_dir}...")
    os.system(f"rm -rf {config.dest_dir}")
    print(f"Cleaned up {config.dest_dir}.")

# Ensure the destination directory exists
@task
def create_dest_dir(c):
    print(f"--> Creating destination directory {config.dest_dir}...")
    os.makedirs(config.dest_dir, exist_ok=True)
    print(f"Destination directory {config.dest_dir} is ready.")

# Download tasks
@task(pre=[create_dest_dir])
def download_and_extract_jdk(c):
    print("--> Downloading and extract JDK...")
    command = DownloadJdkCommand(config)
    command.execute()

@task(pre=[create_dest_dir])
def download_and_extract_eclipse(c):
    print("--> Downloading and extract Eclipse...")
    manager = DownloadEclipseCommand(config)
    manager.execute()

# Installation tasks
@task(pre=[download_and_extract_jdk, download_and_extract_eclipse])
def move_jdk_to_eclipse(c):
    print("--> Moving JDK to Eclipse...")
    manager = EclipseService(config)
    manager.move_jdk_to_eclipse()

@task(pre=[move_jdk_to_eclipse])
def update_eclipse_ini(c):
    print("--> Updating eclipse.ini...")
    manager = EclipseService(config)
    manager.update_eclipse_ini()

@task(pre=[update_eclipse_ini])
def install_eclipse_components(c):
    print("--> Installing Eclipse components...")
    manager = EclipseService(config)
    manager.install_eclipse_components(c)

@task(pre=[install_eclipse_components])
def package_eclipse(c):
    print("--> Packaging Eclipse...")
    manager = EclipseService(config)
    manager.package_eclipse()

# Upload task
@task(pre=[package_eclipse])
def upload_to_github(c):
    print("--> Uploading to GitHub...")
    manager = EclipseService(config)
    manager.upload_to_github()

# Docker tasks
@task(pre=[package_eclipse])
def create_docker_image(c):
    print("--> Creating Docker image...")
    manager = EclipseService(config)
    dockerfile_path = manager.create_dockerfile()
    manager.build_docker_image(dockerfile_path, "eclipse_image")

@task(pre=[create_docker_image])
def run_docker_container(c):
    print("--> Running Docker container...")
    manager = EclipseService(config)
    manager.create_docker_container("eclipse_image", "eclipse_container")

# Docker image upload task
@task(pre=[create_docker_image])
def upload_docker_image(c):
    print("--> Uploading Docker image...")
    manager = EclipseService(config)
    manager.upload_docker_image("eclipse_image")