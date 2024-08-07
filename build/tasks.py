from invoke import task, Collection
import os
from config import DEST_DIR
from download_service import DownloadService
from eclipse_service import EclipseService

@task
def clean_dest_dir(c):
    print(f"--> Cleaning up destination directory {DEST_DIR}...")
    os.system(f"rm -rf {DEST_DIR}")
    print(f"Cleaned up {DEST_DIR}.")

# Ensure the destination directory exists
@task
def create_dest_dir(c):
    print(f"--> Creating destination directory {DEST_DIR}...")
    os.makedirs(DEST_DIR, exist_ok=True)
    print(f"Destination directory {DEST_DIR} is ready.")

# Download tasks
@task(pre=[create_dest_dir])
def download_jdk(c):
    print("--> Downloading JDK...")
    manager = DownloadService(DEST_DIR)
    manager.download_jdk()

@task(pre=[download_jdk])
def extract_jdk(c):
    print("--> Extracting JDK...")
    manager = DownloadService(DEST_DIR)
    manager.extract_jdk()

@task(pre=[create_dest_dir])
def download_eclipse(c):
    print("--> Downloading Eclipse...")
    manager = DownloadService(DEST_DIR)
    manager.download_eclipse()

@task(pre=[download_eclipse])
def extract_eclipse(c):
    print("--> Extracting Eclipse...")
    manager = DownloadService(DEST_DIR)
    manager.extract_eclipse()

# Installation tasks
@task(pre=[extract_jdk, extract_eclipse])
def move_jdk_to_eclipse(c):
    print("--> Moving JDK to Eclipse...")
    manager = EclipseService(DEST_DIR)
    manager.move_jdk_to_eclipse()

@task(pre=[move_jdk_to_eclipse])
def update_eclipse_ini(c):
    print("--> Updating eclipse.ini...")
    manager = EclipseService(DEST_DIR)
    manager.update_eclipse_ini()

@task(pre=[update_eclipse_ini])
def install_eclipse_components(c):
    print("--> Installing Eclipse components...")
    manager = EclipseService(DEST_DIR)
    manager.install_eclipse_components(c)

@task(pre=[install_eclipse_components])
def package_eclipse(c):
    print("--> Packaging Eclipse...")
    manager = EclipseService(DEST_DIR)
    manager.package_eclipse()

# Upload task
@task(pre=[package_eclipse])
def upload_to_github(c):
    print("--> Uploading to GitHub...")
    manager = EclipseService(DEST_DIR)
    manager.upload_to_github()

# Docker tasks
@task(pre=[package_eclipse])
def create_docker_image(c):
    print("--> Creating Docker image...")
    manager = EclipseService(DEST_DIR)
    dockerfile_path = manager.create_dockerfile()
    manager.build_docker_image(dockerfile_path, "eclipse_image")

@task(pre=[create_docker_image])
def run_docker_container(c):
    print("--> Running Docker container...")
    manager = EclipseService(DEST_DIR)
    manager.create_docker_container("eclipse_image", "eclipse_container")

# Docker image upload task
@task(pre=[create_docker_image])
def upload_docker_image(c):
    print("--> Uploading Docker image...")
    manager = EclipseService(DEST_DIR)
    manager.upload_docker_image("eclipse_image")