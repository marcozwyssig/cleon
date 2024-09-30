import yaml
import platform
import tempfile
import os
import requests
from bs4 import BeautifulSoup
import re
from urllib.parse import urlparse, urlunparse, quote
from typing import Tuple, Dict, List
import logging

# Configure logging
logging.basicConfig(level=logging.INFO)
logger = logging.getLogger(__name__)


class ConfigLoader:
    """Loads configuration from a YAML file."""

    def __init__(self, config_file: str = 'config.yaml'):
        self.config_file = config_file
        self.config = self.load_config()
        self.validate_config()

    def load_config(self) -> dict:
        """Load YAML configuration from a file."""
        try:
            with open(self.config_file, 'r') as file:
                config = yaml.safe_load(file)
            logger.info(f"Configuration loaded from {self.config_file}.")
            return config
        except FileNotFoundError:
            logger.error(f"Configuration file {self.config_file} not found.")
            raise
        except yaml.YAMLError as e:
            logger.error(f"Error parsing YAML file: {e}")
            raise

    def validate_config(self):
        """Validate the presence of required configuration sections and keys."""
        required_sections = ['jdk', 'eclipse', 'ant', 'system']
        for section in required_sections:
            if section not in self.config:
                logger.error(f"Missing required config section: {section}")
                raise ValueError(f"Missing required config section: {section}")

        # Further granular checks can be added here
        logger.info("Configuration validation passed.")


class SystemInfo:
    """Retrieves system-related information."""

    def __init__(self):
        self.system = platform.system().lower()
        self.architecture = platform.machine()
        logger.info(f"System: {self.system}, Architecture: {self.architecture}")


class DirectoryManager:
    """Ensures required directories exist."""

    @staticmethod
    def ensure_dir_exists(directory: str) -> str:
        """Create directory if it does not exist."""
        try:
            os.makedirs(directory, exist_ok=True)
            logger.info(f"Directory ensured: {directory}")
            return directory
        except OSError as e:
            logger.error(f"Failed to create directory {directory}: {e}")
            raise

    def __init__(self, temp_dir: str, dest_dir: str, eclipse_dir: str,
                 jdk_dir: str, ant_dir: str, installed_cache: str):
        self.temp_dir = self.ensure_dir_exists(temp_dir)
        self.dest_dir = self.ensure_dir_exists(dest_dir)
        self.eclipse_dir = self.ensure_dir_exists(eclipse_dir)
        self.jdk_dir = self.ensure_dir_exists(jdk_dir)
        self.ant_dir = self.ensure_dir_exists(ant_dir)
        self.installed_cache = installed_cache
        logger.info("All directories are set up.")


class VersionFetcher:
    """Base class for fetching latest versions."""

    def get_latest_version(self) -> str:
        """Fetch the latest version string."""
        raise NotImplementedError("Must implement get_latest_version method.")


class JDKVersionFetcher(VersionFetcher):
    """Fetches the latest JDK version from GitHub."""

    def __init__(self, api_url: str):
        self.api_url = api_url

    def get_latest_version(self) -> str:
        try:
            response = requests.get(self.api_url)
            response.raise_for_status()
            latest_release = response.json()
            version = latest_release.get('tag_name')
            if not version:
                logger.error("JDK version tag not found in the response.")
                raise RuntimeError("JDK version tag not found in the response.")
            logger.info(f"Latest JDK version fetched: {version}")
            return version
        except requests.RequestException as e:
            logger.error(f"Error fetching JDK version: {e}")
            raise


class AntVersionFetcher(VersionFetcher):
    """Fetches the latest Apache Ant version from the official website."""

    def __init__(self, base_url_ant: str):
        self.base_url_ant = base_url_ant

    def get_latest_version(self) -> str:
        try:
            response = requests.get(self.base_url_ant)
            response.raise_for_status()
            soup = BeautifulSoup(response.text, 'html.parser')
            latest_version_link = soup.find('a', href=re.compile(r'^apache-ant-\d+\.\d+\.\d+-bin\.zip$'))
            if not latest_version_link:
                logger.error("Latest Ant version link not found.")
                raise RuntimeError("Latest Ant version link not found.")
            version = latest_version_link.text.strip()
            logger.info(f"Latest Ant version fetched: {version}")
            return version
        except requests.RequestException as e:
            logger.error(f"Error fetching Ant version: {e}")
            raise


class EclipseVersionFetcher(VersionFetcher):
    """Fetches the latest Eclipse version and release date."""

    def __init__(self, download_url: str):
        self.download_url = download_url

    def get_latest_version_and_date(self) -> Tuple[str, str]:
        try:
            response = requests.get(self.download_url)
            response.raise_for_status()
            soup = BeautifulSoup(response.text, 'html.parser')
            latest_version_link = soup.find('a', title='Latest Release')
            if not latest_version_link:
                logger.error("Latest Eclipse version link not found.")
                raise RuntimeError("Latest Eclipse version link not found.")
            latest_version = latest_version_link.text.strip()

            # Extract the date in the format YYYYMMDDHHMM
            date_text = latest_version_link.get('href', '')
            match = re.search(r'(\d{4})(\d{2})(\d{2})(\d{2})(\d{2})', date_text)
            if match:
                version_date = ''.join(match.groups())
                logger.info(f"Latest Eclipse version and date fetched: {latest_version}, {version_date}")
                return latest_version, version_date
            else:
                logger.error("Unable to extract Eclipse version date.")
                raise RuntimeError("Unable to extract Eclipse version date.")
        except requests.RequestException as e:
            logger.error(f"Error fetching Eclipse version: {e}")
            raise


class URLBuilder:
    """Constructs download URLs based on system and version information."""

    def __init__(self, config: dict, system_info: SystemInfo, versions: dict):
        self.config = config
        self.system_info = system_info
        self.versions = versions

    def get_key(self) -> Tuple[str, str]:
        """Returns a tuple of system and architecture."""
        return (self.system_info.system, self.system_info.architecture)

    def get_jdk_download_url(self) -> str:
        """Constructs the JDK download URL."""
        key = self.get_key()
        base_url = self.config['jdk']['base_url_ibm_semeru']
        latest_jdk_version = self.versions['jdk']

        # Process version strings
        version_jdk_short = latest_jdk_version.split("_")[0].replace('jdk-', '')
        version_jdk_docker = version_jdk_short.replace('+', '_')
        version_file_jdk_short = f"jdk-{version_jdk_short}"
        version_file_jdk = f"{version_jdk_short}_" + latest_jdk_version.split("_")[1]
        version_jdk = f"jdk-{version_file_jdk}"

        # Store processed versions if needed elsewhere
        self.versions['jdk_short'] = version_jdk_short
        self.versions['jdk_docker'] = version_jdk_docker
        self.versions['jdk_file_short'] = version_file_jdk_short
        self.versions['jdk_file'] = version_file_jdk
        self.versions['jdk_full'] = version_jdk

        download_files_jdk = {
            ('linux', 'x86_64'): f"ibm-semeru-open-jdk_x64_linux_{version_file_jdk.replace('+', '_')}.tar.gz",
            ('linux', 'aarch64'): f"ibm-semeru-open-jdk_aarch64_linux_{version_file_jdk.replace('+', '_')}.tar.gz",
            ('darwin', 'x86_64'): f"ibm-semeru-open-jdk_x64_mac_{version_file_jdk.replace('+', '_')}.tar.gz",
            ('darwin', 'arm64'): f"ibm-semeru-open-jdk_aarch64_mac_{version_file_jdk.replace('+', '_')}.tar.gz",
            ('windows', 'AMD64'): f"ibm-semeru-open-jdk_x64_windows_{version_file_jdk.replace('+', '_')}.zip",
            ('windows', 'ARM64'): f"ibm-semeru-open-jdk_x64_windows_{version_file_jdk.replace('+', '_')}.zip"
        }

        if key not in download_files_jdk:
            logger.error(f"Unsupported OS or architecture: {self.system_info.system} {self.system_info.architecture}")
            raise RuntimeError(f"Unsupported OS or architecture: {self.system_info.system} {self.system_info.architecture}")

        download_url = f"{base_url}/{version_jdk}/{download_files_jdk[key]}"
        logger.info(f"JDK download URL constructed: {download_url}")
        return download_url

    def get_eclipse_download_urls(self) -> List[str]:
        """Constructs a list of Eclipse download URLs using the primary base URL and mirrors."""
        key = self.get_key()
        base_url = self.config['eclipse']['base_url_eclipse']
        mirrors = self.config['eclipse']['mirrors']
        latest_version = self.versions['eclipse']['version']
        latest_date = self.versions['eclipse']['date']

        download_files_eclipse = {
            ('linux', 'x86_64'): f"R-{latest_version}-{latest_date}/eclipse-platform-{latest_version}-linux-gtk-x86_64.tar.gz",
            ('linux', 'aarch64'): f"R-{latest_version}-{latest_date}/eclipse-platform-{latest_version}-linux-gtk-aarch64.tar.gz",
            ('darwin', 'x86_64'): f"R-{latest_version}-{latest_date}/eclipse-platform-{latest_version}-macosx-cocoa-x86_64.tar.gz",
            ('darwin', 'arm64'): f"R-{latest_version}-{latest_date}/eclipse-platform-{latest_version}-macosx-cocoa-aarch64.tar.gz",
            ('windows', 'AMD64'): f"R-{latest_version}-{latest_date}/eclipse-platform-{latest_version}-win32-x86_64.zip",
        }

        if key not in download_files_eclipse:
            error_msg = f"Unsupported OS or architecture: {self.system_info.system} {self.system_info.architecture}"
            logger.error(error_msg)
            raise RuntimeError(error_msg)

        download_path = download_files_eclipse[key]

        # Construct the primary download URL with the query parameter
        primary_url = f"{base_url}{download_path}&r=1"

        # Construct mirror download URLs (assuming mirrors don't require the query parameter)
        mirror_urls = [f"{mirror}{download_path}" for mirror in mirrors]

        # Combine all URLs into a single list
        download_urls = [primary_url] + mirror_urls

        logger.info(f"Eclipse download URLs constructed: {download_urls}")
        return download_urls


    def get_ant_download_url(self) -> str:
        """Constructs the Ant download URL."""
        base_url = self.config['ant']['base_url_ant']
        ant_version = self.versions['ant']
        download_url = f"{base_url}/{ant_version}"
        logger.info(f"Ant download URL constructed: {download_url}")
        return download_url


class DownloadManager:
    """Handles operations related to download URLs."""

    @staticmethod
    def get_filename_from_url(url: str) -> str:
        """Extracts the filename from a URL."""
        filename = os.path.basename(url.split('?')[0])
        logger.info(f"Extracted filename from URL {url}: {filename}")
        return filename

    @staticmethod
    def get_filename_from_url_eclipse(urls: List[str]) -> str:
        """Extracts the filename from a list of Eclipse URLs."""
        if not urls:
            return ""
        url = urls[0] # Primary URL
        file = url.split('/')[-1]
        return file.split('&')[0]

class EclipseURLProcessor:
    """Processes Eclipse repository URLs, including authentication."""

    def __init__(self, config: dict, with_optional: bool):
        self.config = config
        self.with_optional = with_optional
        self.install_units = self.config['eclipse']['install_units'].copy()

        if not self.with_optional:
            optional_keys = [k for k, v in self.install_units.items() if v.get('optional', False)]
            for key in optional_keys:
                logger.info(f"Skipping optional install unit: {key}")
                self.install_units.pop(key)

        self.url = self.__make_eclipse_urls()

    def __make_eclipse_urls(self) -> List[str]:
        """Generates a list of Eclipse repository URLs."""
        urls = set()

        install_units = self.install_units
        for unit in install_units.values():
            repo_url = unit.get('url')
            username = unit.get('username')
            password = unit.get('password')
            if repo_url:
                if username and password:
                    parsed_url = urlparse(repo_url)
                    auth = f"{quote(username)}:{quote(password)}"
                    netloc = f"{auth}@{parsed_url.netloc}"
                    repo_url = urlunparse((
                        parsed_url.scheme,
                        netloc,
                        parsed_url.path,
                        parsed_url.params,
                        parsed_url.query,
                        parsed_url.fragment
                    ))
                    logger.info(f"Added authenticated Eclipse URL: {repo_url}")
                else:
                    logger.info(f"Added Eclipse URL: {repo_url}")
                urls.add(repo_url)

        return sorted(urls)

    def get_eclipse_install_units(self) -> Dict[str, dict]:
        """Retrieves Eclipse install units, optionally excluding optional units."""
        return self.install_units

    def get_eclipse_urls(self) -> List[str]:
        """Returns a list of Eclipse repository URLs."""
        return self.url

    def get_eclipse_url_string(self) -> str:
        """Returns a comma-separated string of Eclipse repository URLs."""
        urls = self.get_eclipse_urls()
        url_string = ",".join(urls)
        logger.info(f"Eclipse URL string: {url_string}")
        return url_string

class Config:
    """Main configuration class that integrates all components."""

    def __init__(self, config_file: str = 'config.yaml'):
        # Load configuration
        config_loader = ConfigLoader(config_file)
        self.config = config_loader.config

        # Retrieve system information
        system_info = SystemInfo()
        self.system_info = system_info

        # Initialize version fetchers
        jdk_fetcher = JDKVersionFetcher(self.config['jdk']['api_url'])
        ant_fetcher = AntVersionFetcher(self.config['ant']['base_url_ant'])
        eclipse_fetcher = EclipseVersionFetcher(self.config['eclipse']['api_url'])

        # Fetch latest versions
        versions = {
            'jdk': jdk_fetcher.get_latest_version(),
            'ant': ant_fetcher.get_latest_version(),
            'eclipse': {}
        }
        eclipse_version, eclipse_date = eclipse_fetcher.get_latest_version_and_date()
        versions['eclipse']['version'] = eclipse_version
        versions['eclipse']['date'] = eclipse_date
        self.versions = versions

        # Build download URLs
        url_builder = URLBuilder(self.config, self.system_info, self.versions)
        self.download_url_jdk = url_builder.get_jdk_download_url()
        self.download_url_eclipse = url_builder.get_eclipse_download_urls()
        self.download_url_ant = url_builder.get_ant_download_url()

        # Extract download filenames
        download_manager = DownloadManager()
        self.download_file_jdk = download_manager.get_filename_from_url(self.download_url_jdk)
        self.download_file_eclipse = download_manager.get_filename_from_url_eclipse(self.download_url_eclipse)
        self.download_file_ant = download_manager.get_filename_from_url(self.download_url_ant)

        # Setup directories
        temp_dir = os.getenv('TEMP', self.config['system']['temp_dir'] or tempfile.gettempdir())
        dest_dir = os.path.join(temp_dir, self.config['system']['dest_dir'])
        eclipse_dir = os.path.join(dest_dir, self.config['system']['eclipse_dir'])
        jdk_dir = os.path.join(dest_dir, self.config['system']['jdk_dir'])
        ant_dir = os.path.join(dest_dir, self.config['system']['ant_dir'])
        installed_cache = os.path.join(dest_dir, self.config['system']['installed_cache'])

        directory_manager = DirectoryManager(
            temp_dir=temp_dir,
            dest_dir=dest_dir,
            eclipse_dir=eclipse_dir,
            jdk_dir=jdk_dir,
            ant_dir=ant_dir,
            installed_cache=installed_cache
        )
        self.directory_manager = directory_manager

        logger.info("Configuration setup completed.")

    def get_eclipse_url_processor(self, with_optional: bool) -> EclipseURLProcessor:
        return EclipseURLProcessor(self.config, with_optional)