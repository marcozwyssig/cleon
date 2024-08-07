import platform
import tempfile
import os
import requests
from bs4 import BeautifulSoup
import re

# Configuration constants
def get_latest_jdk_version():
    url = "https://api.github.com/repos/ibmruntimes/semeru21-binaries/releases/latest"
    response = requests.get(url)
    response.raise_for_status()
    latest_release = response.json()
    latest_version = latest_release['tag_name']
    return latest_version

def get_latest_eclipse_version_and_date():
    url = "https://download.eclipse.org/eclipse/downloads/"
    response = requests.get(url)
    response.raise_for_status()
    soup = BeautifulSoup(response.text, 'html.parser')
    latest_version_link = soup.find('a', title='Latest Release')
    latest_version = latest_version_link.string.strip()

    # Extract the latest version number and find the corresponding date
    date_text = latest_version_link['href']
    
    # Extract the date in the format YYYYMMDDHHMM
    match = re.search(r'(\d{4})(\d{2})(\d{2})(\d{2})(\d{2})', date_text)
    if match:
        version_date = f"{match.group(1)}{match.group(2)}{match.group(3)}{match.group(4)}{match.group(5)}"
    else:
        raise RuntimeError("Unable to extract version date")
    
    return latest_version, version_date

LATEST_JDK_VERSION = get_latest_jdk_version()

VERSION_JDK_SHORT = (LATEST_JDK_VERSION.split("_")[0]).replace('jdk-', '')
VERSION_JDK_DOCKER = VERSION_JDK_SHORT.replace('+', '_')
VERSION_FILE_JDK_SHORT = f"jdk-{VERSION_JDK_SHORT}"
VERSION_FILE_JDK = f"{VERSION_JDK_SHORT}_" + LATEST_JDK_VERSION.split("_")[1]
VERSION_JDK = f"jdk-{VERSION_FILE_JDK}"

VERSION_ECLIPSE, VERSION_ECLIPSE_DATE = get_latest_eclipse_version_and_date()

BASE_URL_IBM_SEMERU = "https://github.com/ibmruntimes/semeru21-binaries/releases/download"
BASE_URL_ECLIPSE = "https://www.eclipse.org/downloads/download.php?file=/eclipse/downloads/drops4/"

REPO_URL = "http://download.eclipse.org/releases/latest"
ACTIFSOURCE_REPO_URL = "https://updates.actifsource.com/updates-enterprise"
ECD_PLUGIN_REPO_URL = "https://ecd-plugin.github.io/update"

INSTALL_UNITS = {
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
}

# System and architecture
SYSTEM = platform.system().lower()
ARCHITECTURE = platform.machine()

DOWNLOAD_FILES_JDK = {
    ('linux', 'x86_64'): f"ibm-semeru-open-jdk_x64_linux_{VERSION_FILE_JDK.replace('+', '_')}.tar.gz",
    ('linux', 'aarch64'): f"ibm-semeru-open-jdk_aarch64_linux_{VERSION_FILE_JDK.replace('+', '_')}.tar.gz",    
    ('darwin', 'x86_64'): f"ibm-semeru-open-jdk_x64_mac_{VERSION_FILE_JDK.replace('+', '_')}.tar.gz",
    ('darwin', 'arm64'): f"ibm-semeru-open-jdk_aarch64_mac_{VERSION_FILE_JDK.replace('+', '_')}.tar.gz",
    ('windows', 'AMD64'): f"ibm-semeru-open-jdk_x64_windows_{VERSION_FILE_JDK.replace('+', '_')}.zip",
    ('windows', 'ARM64'): f"ibm-semeru-open-jdk_x64_windows_{VERSION_FILE_JDK.replace('+', '_')}.zip"
}

DOWNLOAD_FILES_ECLIPSE = {
    ('linux', 'x86_64'): f"R-{VERSION_ECLIPSE}-{VERSION_ECLIPSE_DATE}/eclipse-platform-{VERSION_ECLIPSE}-linux-gtk-x86_64.tar.gz",
    ('linux', 'aarch64'): f"R-{VERSION_ECLIPSE}-{VERSION_ECLIPSE_DATE}/eclipse-platform-{VERSION_ECLIPSE}-linux-gtk-aarch64.tar.gz",
    ('darwin', 'x86_64'): f"R-{VERSION_ECLIPSE}-{VERSION_ECLIPSE_DATE}/eclipse-platform-{VERSION_ECLIPSE}-macosx-cocoa-x86_64.tar.gz",
    ('darwin', 'arm64'): f"R-{VERSION_ECLIPSE}-{VERSION_ECLIPSE_DATE}/eclipse-platform-{VERSION_ECLIPSE}-macosx-cocoa-aarch64.tar.gz",
    ('windows', 'AMD64'): f"R-{VERSION_ECLIPSE}-{VERSION_ECLIPSE_DATE}/eclipse-platform-{VERSION_ECLIPSE}-win32-x86_64.zip",
}

KEY = (SYSTEM, ARCHITECTURE)
if KEY not in DOWNLOAD_FILES_JDK or KEY not in DOWNLOAD_FILES_ECLIPSE:
    raise RuntimeError(f"Unsupported operating system or architecture: {SYSTEM} {ARCHITECTURE}")

DOWNLOAD_URL_JDK = f"{BASE_URL_IBM_SEMERU}/{VERSION_JDK}/{DOWNLOAD_FILES_JDK[KEY]}"
DOWNLOAD_URL_ECLIPSE = f"{BASE_URL_ECLIPSE}{DOWNLOAD_FILES_ECLIPSE[KEY]}&r=1"

TEMP_DIR = os.getenv('TEMP', tempfile.gettempdir())
DEST_DIR = os.path.join(TEMP_DIR, "eclipse")
INSTALLED_CACHE = os.path.join(TEMP_DIR, "installed_components.txt")

# GitHub configuration
GITHUB_REPOSITORY = "marcozwyssig/cleon"
GITHUB_USERNAME = os.getenv("GITHUB_USERNAME")
GITHUB_TOKEN = os.getenv("GITHUB_TOKEN")  # Store your GitHub token in an environment variable for security
GITHUB_API_URL = "https://api.github.com"
GITHUB_DOCKER_REGISTRY = "ghcr.io"
