# tasks.py
import os
import platform
import requests
from tqdm import tqdm
from invoke import task

# Define the base URL
BASE_URL = "https://github.com/ibmruntimes/semeru21-binaries/releases/download"

# Specify the version (you can change this version as needed)
VERSION_FILE = "21.0.3+9_openj9-0.44.0"
VERSION = f"jdk-{VERSION_FILE}"

# Determine the operating system and architecture
system = platform.system().lower()
architecture = platform.machine()

# Map system and architecture to the corresponding download file
download_files = {
    ('linux', 'x86_64'): f"ibm-semeru-open-jdk_x64_linux_{VERSION_FILE.replace('+', '_')}.tar.gz",
    ('darwin', 'x86_64'): f"ibm-semeru-open-jdk_x64_mac_{VERSION_FILE.replace('+', '_')}.tar.gz",
    ('darwin', 'arm64'): f"ibm-semeru-open-jdk_aarch64_mac_{VERSION_FILE.replace('+', '_')}.tar.gz",
    ('windows', 'AMD64'): f"ibm-semeru-open-jdk_x64_windows_{VERSION_FILE.replace('+', '_')}.zip"
}

key = (system, architecture)
if key not in download_files:
    raise RuntimeError(f"Unsupported operating system or architecture: {system} {architecture}")

DOWNLOAD_URL = f"{BASE_URL}/{VERSION}/{download_files[key]}"
DEST_DIR = os.getcwd()  # Use the current directory

@task
def create_dest_dir(ctx):
    os.makedirs(DEST_DIR, exist_ok=True)
    print(f"Destination directory {DEST_DIR} is ready.")

@task(pre=[create_dest_dir])
def download_file(ctx):
    """Download the file to the destination directory"""
    download_file_helper(DOWNLOAD_URL, DEST_DIR)

def download_file_helper(url, dest_dir):
    """Helper function to download a file with a progress bar"""
    print(f"Downloading {url} to {dest_dir}...")    
    local_filename = os.path.join(dest_dir, download_files[key])
    response = requests.get(url, stream=True)
    if response.status_code == 200:
        total_size = int(response.headers.get('content-length', 0))
        with open(local_filename, 'wb') as f, tqdm(
            desc=local_filename,
            total=total_size,
            unit='iB',
            unit_scale=True,
            unit_divisor=1024,
        ) as bar:
            for chunk in response.iter_content(chunk_size=8192):
                size = f.write(chunk)
                bar.update(size)
        print(f"Download completed in {dest_dir} successfully.")
    else:
        print("Error: Download failed.")
        return False
    return True
