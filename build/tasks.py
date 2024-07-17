from invoke import task, Collection
import os
from config import DEST_DIR, SYSTEM, ARCHITECTURE
from download_manager import DownloadManager
from installation_manager import InstallationManager

# Ensure the destination directory exists
@task
def create_dest_dir(c):
    os.makedirs(DEST_DIR, exist_ok=True)
    print(f"Destination directory {DEST_DIR} is ready.")

# Download tasks
@task(pre=[create_dest_dir])
def download_jdk(c):
    manager = DownloadManager(DEST_DIR)
    manager.download_jdk()

@task(pre=[download_jdk])
def extract_jdk(c):
    manager = DownloadManager(DEST_DIR)
    manager.extract_jdk()

@task(pre=[create_dest_dir])
def download_eclipse(c):
    manager = DownloadManager(DEST_DIR)
    manager.download_eclipse()

@task(pre=[download_eclipse])
def extract_eclipse(c):
    manager = DownloadManager(DEST_DIR)
    manager.extract_eclipse()

# Installation tasks
@task(pre=[extract_jdk, extract_eclipse])
def move_jdk_to_eclipse(c):
    manager = InstallationManager(DEST_DIR)
    manager.move_jdk_to_eclipse()

@task(pre=[move_jdk_to_eclipse])
def update_eclipse_ini(c):
    manager = InstallationManager(DEST_DIR)
    manager.update_eclipse_ini()

@task(pre=[update_eclipse_ini])
def install_eclipse_components(c):
    manager = InstallationManager(DEST_DIR)
    manager.install_eclipse_components(c)

@task(pre=[install_eclipse_components])
def package_eclipse(c):
    manager = InstallationManager(DEST_DIR)
    manager.package_eclipse()

# Upload task
@task(pre=[package_eclipse])
def upload_to_github(c):
    manager = InstallationManager(DEST_DIR)
    manager.upload_to_github()


