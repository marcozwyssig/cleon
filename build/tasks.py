import os
import platform
import requests
from tqdm import tqdm
from invoke import task, Collection
import tempfile
import tarfile
import zipfile
import shutil

# Define constants
VERSION_JDK_SHORT = "21.0.3+9"
VERSION_FILE_JDK_SHORT = f"jdk-{VERSION_JDK_SHORT}"
VERSION_FILE_JDK = f"{VERSION_JDK_SHORT}_openj9-0.44.0"
VERSION_JDK = f"jdk-{VERSION_FILE_JDK}"
VERSION_ECLIPSE = "4.32"
VERSION_ECLIPSE_DATE = "202406010610"

BASE_URL_IBM_SEMERU = "https://github.com/ibmruntimes/semeru21-binaries/releases/download"
BASE_URL_ECLIPSE = "https://www.eclipse.org/downloads/download.php?file=/eclipse/downloads/drops4/"

REPO_URL = "http://download.eclipse.org/releases/latest"
ACTIFSOURCE_REPO_URL = "https://updates.actifsource.com/updates-enterprise"
ECD_PLUGIN_REPO_URL = "https://ecd-plugin.github.io/update"

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

# System and architecture
system = platform.system().lower()
architecture = platform.machine()

download_files_jdk = {
    ('linux', 'x86_64'): f"ibm-semeru-open-jdk_x64_linux_{VERSION_FILE_JDK.replace('+', '_')}.tar.gz",
    ('darwin', 'x86_64'): f"ibm-semeru-open-jdk_x64_mac_{VERSION_FILE_JDK.replace('+', '_')}.tar.gz",
    ('darwin', 'arm64'): f"ibm-semeru-open-jdk_aarch64_mac_{VERSION_FILE_JDK.replace('+', '_')}.tar.gz",
    ('windows', 'AMD64'): f"ibm-semeru-open-jdk_x64_windows_{VERSION_FILE_JDK.replace('+', '_')}.zip",
    ('windows', 'ARM64'): f"ibm-semeru-open-jdk_x64_windows_{VERSION_FILE_JDK.replace('+', '_')}.zip"
}

download_files_eclipse = {
    ('linux', 'x86_64'): f"R-{VERSION_ECLIPSE}-{VERSION_ECLIPSE_DATE}/eclipse-platform-{VERSION_ECLIPSE}-linux-gtk-x86_64.tar.gz",
    ('darwin', 'x86_64'): f"R-{VERSION_ECLIPSE}-{VERSION_ECLIPSE_DATE}/eclipse-platform-{VERSION_ECLIPSE}-macosx-cocoa-x86_64.tar.gz",
    ('darwin', 'arm64'): f"R-{VERSION_ECLIPSE}-{VERSION_ECLIPSE_DATE}/eclipse-platform-{VERSION_ECLIPSE}-macosx-cocoa-aarch64.tar.gz",
    ('windows', 'AMD64'): f"R-{VERSION_ECLIPSE}-{VERSION_ECLIPSE_DATE}/eclipse-platform-{VERSION_ECLIPSE}-win32-x86_64.zip",
}

key = (system, architecture)
if key not in download_files_jdk or key not in download_files_eclipse:
    raise RuntimeError(f"Unsupported operating system or architecture: {system} {architecture}")

DOWNLOAD_URL_JDK = f"{BASE_URL_IBM_SEMERU}/{VERSION_JDK}/{download_files_jdk[key]}"
DOWNLOAD_URL_ECLIPSE = f"{BASE_URL_ECLIPSE}{download_files_eclipse[key]}&r=1"

# Directories
TEMP_DIR = os.getenv('TEMP', tempfile.gettempdir())
DEST_DIR = os.path.join(TEMP_DIR, "eclipse")
INSTALLED_CACHE = os.path.join(TEMP_DIR, "installed_components.txt")

def download_file_helper(url, dest_dir, filename):
    """Helper function to download a file with a progress bar"""
    local_filename = os.path.join(dest_dir, filename)
    
    # Check if the file already exists
    if os.path.isfile(local_filename):
        print(f"{filename} already exists, skipping download.")
        return True
    
    print(f"Downloading {url} to {dest_dir}...")
    
    try:
        response = requests.get(url, stream=True, allow_redirects=True)
        response.raise_for_status()
        
        total_size = int(response.headers.get('content-length', 0))
        
        with open(local_filename, 'wb') as f, tqdm(
            desc=filename,
            total=total_size,
            unit='iB',
            unit_scale=True,
            unit_divisor=1024,
        ) as bar:
            for chunk in response.iter_content(chunk_size=8192):
                size = f.write(chunk)
                bar.update(size)
        
        print(f"Download completed in {dest_dir} successfully.")
        return True
    except requests.RequestException as e:
        print(f"Error: Download failed due to {e}")
        return False

def is_installed(iu):
    """Check if an installable unit is already installed."""
    if os.path.isfile(INSTALLED_CACHE):
        with open(INSTALLED_CACHE, 'r') as f:
            installed_units = f.read().splitlines()
            return iu in installed_units
    return False

def extract_file(filepath, dest_dir):
    """Extract a tar.gz or zip file"""
    # Check if the extraction directory already exists
    if os.path.isdir(dest_dir) and os.listdir(dest_dir):
        print(f"{dest_dir} already contains extracted content, skipping extraction.")
        return True
    
    print(f"Extracting {filepath} to {dest_dir}...")
    try:
        if filepath.endswith(".tar.gz"):
            with tarfile.open(filepath, "r:gz") as tar:
                tar.extractall(path=dest_dir)
        elif filepath.endswith(".zip"):
            with zipfile.ZipFile(filepath, "r") as zip_ref:
                zip_ref.extractall(dest_dir)
        print(f"Extraction completed successfully.")
        return True
    except (tarfile.TarError, zipfile.BadZipFile) as e:
        print(f"Error: Extraction failed due to {e}")
        return False

@task
def create_dest_dir(c):
    os.makedirs(DEST_DIR, exist_ok=True)
    print(f"Destination directory {DEST_DIR} is ready.")

@task(pre=[create_dest_dir])
def download_jdk(c):
    """Download the file to the destination directory"""
    download_file_helper(DOWNLOAD_URL_JDK, DEST_DIR, download_files_jdk[key])

@task(pre=[download_jdk])
def extract_jdk(c):
    """Extract the downloaded Eclipse file"""
    extract_jdk = download_files_jdk[key].split('/')[-1]
    extract_file(os.path.join(DEST_DIR, extract_jdk), os.path.join(DEST_DIR, "jdk"))

@task(pre=[create_dest_dir])
def download_eclipse(c):
    """Download the file to the destination directory"""
    download_file_helper(DOWNLOAD_URL_ECLIPSE, DEST_DIR, download_files_eclipse[key].split('/')[-1])

@task(pre=[download_eclipse])
def extract_eclipse(c):
    """Extract the downloaded Eclipse file"""
    eclipse_filename = download_files_eclipse[key].split('/')[-1]
    extract_file(os.path.join(DEST_DIR, eclipse_filename), os.path.join(DEST_DIR, "eclipse"))

@task(pre=[extract_jdk, extract_eclipse])
def move_jdk_to_eclipse(c):
    """Move the extracted IBM Semeru JDK into the Eclipse folder and rename it to jdk"""
    extracted_jdk_path = os.path.join(DEST_DIR, "jdk", VERSION_FILE_JDK_SHORT)
    eclipse_dirname = [name for name in os.listdir(os.path.join(DEST_DIR, "eclipse")) if name.startswith("eclipse")][0]
    eclipse_path = os.path.join(os.path.join(DEST_DIR, "eclipse"), eclipse_dirname)
    
    if not os.path.isdir(extracted_jdk_path):
        print(f"Error: Extracted JDK path {extracted_jdk_path} does not exist.")
        return False

    jdk_dest_path = os.path.join(eclipse_path, "jdk")
    # Check if the extraction directory already exists
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

@task(pre=[move_jdk_to_eclipse])
def update_eclipse_ini(c):
    global ECLIPSE_EXEC_DIR
    ECLIPSE_EXEC_DIR = os.path.join(os.path.join(DEST_DIR, "eclipse", "eclipse"))
    eclipse_ini = os.path.join(ECLIPSE_EXEC_DIR, "eclipse.ini")

    with open(eclipse_ini, 'r') as file:
        lines = file.readlines()

    vm_lines = [
        '-vm\n',
        'jdk/bin/java\n',
        '-vmargs'
    ]
    # vmargs_lines = [
    #     '-vmargs\n',
    #     '-Xms512m\n',
    #     '-Xmx16g\n',
    #     '-XX:+UseG1GC\n',
    #     '-XX:+UseStringDeduplication\n',
    #     '-XX:MaxPermSize=256m\n',
    #     '-Dosgi.requiredJavaVersion=17\n',
    #     '-Dosgi.dataAreaRequiresExplicitInit=true\n',
    #     '-Dorg.eclipse.swt.graphics.Resource.reportNonDisposed=true\n',
    #     '--add-modules=ALL-SYSTEM\n',
    #     '-Dorg.slf4j.simpleLogger.defaultLogLevel=off\n',
    #     '-Djava.security.manager=allow\n'
    # ]

    new_lines = []
    vm_inserted = False
    vmargs_inserted = False

    for line in lines:
        if line.strip() == '-vm':
            vm_inserted = True
        elif line.strip() == '-vmargs':
            vmargs_inserted = True
        elif vm_inserted and not vmargs_inserted:
            continue
        else:
            new_lines.append(line)

    new_lines += vm_lines

    with open(eclipse_ini, 'w') as file:
        file.writelines(new_lines)

    print("eclipse.ini file updated successfully.")

@task(pre=[update_eclipse_ini])
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

@task(pre=[populate_cache])
def install_eclipse_components(c):
    """Install each component if not already installed."""   
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
                f"-destination {ECLIPSE_EXEC_DIR} "
                f"-profile SDKProfile",
                warn=True
            )
            if result.ok:
                with open(INSTALLED_CACHE, 'a') as f:
                    f.write(f"{iu}\n")
    
    print("Eclipse components installation completed.")

