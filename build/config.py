import platform

# Configuration constants
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
    ('darwin', 'x86_64'): f"ibm-semeru-open-jdk_x64_mac_{VERSION_FILE_JDK.replace('+', '_')}.tar.gz",
    ('darwin', 'arm64'): f"ibm-semeru-open-jdk_aarch64_mac_{VERSION_FILE_JDK.replace('+', '_')}.tar.gz",
    ('windows', 'AMD64'): f"ibm-semeru-open-jdk_x64_windows_{VERSION_FILE_JDK.replace('+', '_')}.zip",
    ('windows', 'ARM64'): f"ibm-semeru-open-jdk_x64_windows_{VERSION_FILE_JDK.replace('+', '_')}.zip"
}

DOWNLOAD_FILES_ECLIPSE = {
    ('linux', 'x86_64'): f"R-{VERSION_ECLIPSE}-{VERSION_ECLIPSE_DATE}/eclipse-platform-{VERSION_ECLIPSE}-linux-gtk-x86_64.tar.gz",
    ('darwin', 'x86_64'): f"R-{VERSION_ECLIPSE}-{VERSION_ECLIPSE_DATE}/eclipse-platform-{VERSION_ECLIPSE}-macosx-cocoa-x86_64.tar.gz",
    ('darwin', 'arm64'): f"R-{VERSION_ECLIPSE}-{VERSION_ECLIPSE_DATE}/eclipse-platform-{VERSION_ECLIPSE}-macosx-cocoa-aarch64.tar.gz",
    ('windows', 'AMD64'): f"R-{VERSION_ECLIPSE}-{VERSION_ECLIPSE_DATE}/eclipse-platform-{VERSION_ECLIPSE}-win32-x86_64.zip",
}

KEY = (SYSTEM, ARCHITECTURE)
if KEY not in DOWNLOAD_FILES_JDK or KEY not in DOWNLOAD_FILES_ECLIPSE:
    raise RuntimeError(f"Unsupported operating system or architecture: {SYSTEM} {ARCHITECTURE}")

DOWNLOAD_URL_JDK = f"{BASE_URL_IBM_SEMERU}/{VERSION_JDK}/{DOWNLOAD_FILES_JDK[KEY]}"
DOWNLOAD_URL_ECLIPSE = f"{BASE_URL_ECLIPSE}{DOWNLOAD_FILES_ECLIPSE[KEY]}&r=1"

# Directories
import tempfile
import os

TEMP_DIR = os.getenv('TEMP', tempfile.gettempdir())
DEST_DIR = os.path.join(TEMP_DIR, "eclipse")
INSTALLED_CACHE = os.path.join(TEMP_DIR, "installed_components.txt")

# GitHub configuration
GITHUB_REPOSITORY = "your-github-username/your-repository-name"
GITHUB_TOKEN = os.getenv("GITHUB_TOKEN")  # Store your GitHub token in an environment variable for security
GITHUB_API_URL = "https://api.github.com"
