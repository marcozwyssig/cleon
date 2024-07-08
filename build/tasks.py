# tasks.py
import os
import platform
import requests
from tqdm import tqdm
from invoke import task, Collection
import subprocess


# Specify the version (you can change this version as needed)
VERSION_FILE_IBM_SEMERU = "21.0.3+9_openj9-0.44.0"
VERSION_IBM_SEMERU = f"jdk-{VERSION_FILE_IBM_SEMERU}"

# Determine the operating system and architecture
system = platform.system().lower()
architecture = platform.machine()

# Get the temporary directory from environment variables
TEMP_DIR = os.getenv('TEMP', '/tmp')
INSTALLED_CACHE = os.path.join(TEMP_DIR, "installed_components.txt")

# Define the base URL for the IBM Semeru Open JDK
BASE_URL_IBM_SEMERU = "https://github.com/ibmruntimes/semeru21-binaries/releases/download"

# Define the download URL for Eclipse
BASE_URL_ECLIPSE = "https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/2021-09/R/eclipse-java-2021-09-R-linux-gtk-x86_64.tar.gz"

# Define the repository URLs
REPO_URL = "http://download.eclipse.org/releases/latest"
ACTIFSOURCE_REPO_URL = "https://updates.actifsource.com/updates-enterprise"
ECD_PLUGIN_REPO_URL = "https://ecd-plugin.github.io/update"

# List of installable units and their repositories
install_units = {
    "org.eclipse.pde.feature.group": REPO_URL,
    "org.eclipse.emf.mwe2.runtime": REPO_URL,
    "org.eclipse.emf.mwe.core": REPO_URL,
    "org.eclipse.egit.feature.group": REPO_URL,
    "org.eclipse.ui.browser": REPO_URL,
    "org.eclipse.platform.feature.group": REPO_URL,
    "org.eclipse.draw2d.feature.group": REPO_URL,
    "org.eclipse.gef.feature.group": REPO_URL,
    "org.eclipse.gmf.feature.group": REPO_URL,
    "ch.actifsource.enterprise.feature.group": ACTIFSOURCE_REPO_URL,
    # "org.sf.feeling.decompiler.feature.group": ECD_PLUGIN_REPO_URL,
}

# Map system and architecture to the corresponding download file
download_files_ibm_semeru = {
    ('linux', 'x86_64'): f"ibm-semeru-open-jdk_x64_linux_{VERSION_FILE_IBM_SEMERU.replace('+', '_')}.tar.gz",
    ('darwin', 'x86_64'): f"ibm-semeru-open-jdk_x64_mac_{VERSION_FILE_IBM_SEMERU.replace('+', '_')}.tar.gz",
    ('darwin', 'arm64'): f"ibm-semeru-open-jdk_aarch64_mac_{VERSION_FILE_IBM_SEMERU.replace('+', '_')}.tar.gz",
    ('windows', 'AMD64'): f"ibm-semeru-open-jdk_x64_windows_{VERSION_FILE_IBM_SEMERU.replace('+', '_')}.zip",
    ('windows', 'ARM64'): f"ibm-semeru-open-jdk_x64_windows_{VERSION_FILE_IBM_SEMERU.replace('+', '_')}.zip"
}



key = (system, architecture)
if key not in download_files_ibm_semeru:
    raise RuntimeError(f"Unsupported operating system or architecture: {system} {architecture}")

DOWNLOAD_URL_IBM_SEMERU = f"{BASE_URL_IBM_SEMERU}/{VERSION_IBM_SEMERU}/{download_files_ibm_semeru[key]}"
DEST_DIR = os.getcwd()  # Use the current directory

def download_file_helper(url, dest_dir):
    """Helper function to download a file with a progress bar"""
    print(f"Downloading {url} to {dest_dir}...")    
    local_filename = os.path.join(dest_dir, download_files_ibm_semeru[key])
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

def is_installed(iu):
    """Check if an installable unit is already installed."""
    if os.path.isfile(INSTALLED_CACHE):
        with open(INSTALLED_CACHE, 'r') as f:
            installed_units = f.read().splitlines()
            return iu in installed_units
    return False

@task
def create_dest_dir(c):
    os.makedirs(DEST_DIR, exist_ok=True)
    print(f"Destination directory {DEST_DIR} is ready.")

@task(pre=[create_dest_dir])
def download_file_ibm_semeru(c):
    """Download the file to the destination directory"""
    download_file_helper(DOWNLOAD_URL_IBM_SEMERU, DEST_DIR)

@task
def check_install_dir(c, eclipse_install_dir=None):
    """Check if the Eclipse installation directory exists."""
    global ECLIPSE_EXEC_DIR
    ECLIPSE_EXEC_DIR = eclipse_install_dir or os.getcwd()
    
    if not os.path.isdir(ECLIPSE_EXEC_DIR):
        print(f"Error: Eclipse installation directory {ECLIPSE_EXEC_DIR} does not exist.")
        exit(1)

@task
def populate_cache(c):
    """Populate the cache file with installed components."""
    if os.path.isfile(INSTALLED_CACHE):
        os.remove(INSTALLED_CACHE)
    
    result = c.run(
        f"{ECLIPSE_EXEC_DIR}/eclipse -nosplash -application org.eclipse.equinox.p2.director -listInstalledRoots",
        hide=True,
        warn=True
    )
    with open(INSTALLED_CACHE, 'w') as f:
        f.write(result.stdout)

@task(pre=[check_install_dir, populate_cache])
def install_eclipse_components(c, eclipse_exec_dir=None, eclipse_install_dir=None):
    """Install each component if not already installed."""
    global ECLIPSE_EXEC_DIR
    ECLIPSE_EXEC_DIR = eclipse_exec_dir or os.getcwd()

    ECLIPSE_INSTALL_DIR = eclipse_install_dir or ECLIPSE_EXEC_DIR
    
    for iu, repo_url in install_units.items():
        if is_installed(iu):
            print(f"{iu} is already installed.")
        else:
            print(f"Installing {iu}...")
            result = c.run(
                f"{ECLIPSE_EXEC_DIR}/eclipse -nosplash "
                f"-application org.eclipse.equinox.p2.director "
                f"-repository {repo_url},{REPO_URL},{ACTIFSOURCE_REPO_URL},{ECD_PLUGIN_REPO_URL} "
                f"-installIU {iu} "
                f"-destination {ECLIPSE_INSTALL_DIR} "
                f"-profile SDKProfile",
                warn=True
            )
            if result.ok:
                with open(INSTALLED_CACHE, 'a') as f:
                    f.write(f"{iu}\n")
    
    print("Eclipse components installation completed.")

@task
def update_eclipse_ini(c, eclipse_install_dir=None):
    global ECLIPSE_EXEC_DIR
    ECLIPSE_EXEC_DIR = eclipse_install_dir or os.getcwd()
    eclipse_ini = os.path.join(ECLIPSE_EXEC_DIR, "eclipse.ini")

    # Read the existing contents of the file
    with open(eclipse_ini, 'r') as file:
        lines = file.readlines()

    # Define the additional lines to be added
    vm_lines = [
        '-vm\n',
        'jdk/bin/java\n',
    ]
    vmargs_lines = [
        '-vmargs\n',
        '-Xms512m\n',
        '-Xmx16g\n',
        '-XX:+UseG1GC\n',
        '-XX:+UseStringDeduplication\n',
        '-XX:MaxPermSize=256m\n'
    ]

    # Initialize new content with original content
    new_lines = []

    # Trackers for insertion points
    vm_inserted = False
    vmargs_inserted = False

    for line in lines:
        if line.strip() == '-vm':
            # Skip old -vm and its argument
            vm_inserted = True
        elif line.strip() == '-vmargs':
            # Skip old -vmargs and its arguments
            vmargs_inserted = True
        elif vm_inserted and not vmargs_inserted:
            # Skip until we find -vmargs
            continue
        else:
            new_lines.append(line)

    # Add new -vm and -vmargs sections
    new_lines += vm_lines
    new_lines += vmargs_lines

    # Write the updated contents back to the file
    with open(eclipse_ini, 'w') as file:
        file.writelines(new_lines)

    print("eclipse.ini file updated successfully.")

