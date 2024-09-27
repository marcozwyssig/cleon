import yaml
import platform
import tempfile
import os
import requests
from bs4 import BeautifulSoup
import re

class Config:
    def __init__(self, config_file='config.yaml'):
        self.config = self.load_config(config_file)
        self.system = platform.system().lower()
        self.architecture = platform.machine()

        # Load JDK and Eclipse version details
        self.latest_jdk_version = self.get_latest_jdk_version()
        self.latest_eclipse_version, self.latest_eclipse_date = self.get_latest_eclipse_version_and_date()
        self.latest_ant_version = self.get_latest_ant_version()

        # Configure URLs and file names
        self.version_jdk_short = (self.latest_jdk_version.split("_")[0]).replace('jdk-', '')
        self.version_jdk_docker = self.version_jdk_short.replace('+', '_')
        self.version_file_jdk_short = f"jdk-{self.version_jdk_short}"
        self.version_file_jdk = f"{self.version_jdk_short}_" + self.latest_jdk_version.split("_")[1]
        self.version_jdk = f"jdk-{self.version_file_jdk}"

        self.download_url_jdk = self.get_download_url_jdk()
        self.download_url_eclipse = self.get_download_url_eclipse()
        self.download_url_ant = self.get_download_url_ant()

        self.temp_dir = Config.ensure_dir_exists(os.getenv('TEMP', self.config['system']['temp_dir'] or tempfile.gettempdir()))
        self.dest_dir = Config.ensure_dir_exists(os.path.join(self.temp_dir, self.config['system']['dest_dir']))
        self.eclipse_dir = Config.ensure_dir_exists(os.path.join(self.dest_dir, self.config['system']['eclipse_dir']))
        self.jdk_dir = Config.ensure_dir_exists(os.path.join(self.dest_dir, self.config['system']['jdk_dir']))
        self.ant_dir = Config.ensure_dir_exists(os.path.join(self.dest_dir, self.config['system']['ant_dir']))
        self.installed_cache = os.path.join(self.dest_dir, self.config['system']['installed_cache'])

    def load_config(self, yaml_file) -> dict:
        with open(yaml_file, 'r') as file:
            config = yaml.safe_load(file)
        return config

    @staticmethod
    def ensure_dir_exists(directory):
        if not os.path.exists(directory):
            os.makedirs(directory)
        return directory

    def get_latest_jdk_version(self) -> str:
        url = "https://api.github.com/repos/ibmruntimes/semeru21-binaries/releases/latest"
        response = requests.get(url)
        response.raise_for_status()
        latest_release = response.json()
        return latest_release['tag_name']
    
    def get_latest_ant_version(self) -> str:
        url = base_url_ant = self.config['ant']['base_url_ant']
        response = requests.get(url)
        response.raise_for_status()
        soup = BeautifulSoup(response.text, 'html.parser')
        latest_version_link = soup.find('a', href=re.compile(r'^apache-ant-\d+\.\d+\.\d+-bin\.zip$'))
        latest_version = latest_version_link.string.strip()
        return latest_version

    def get_latest_eclipse_version_and_date(self) -> tuple:
        url = "https://download.eclipse.org/eclipse/downloads/"
        response = requests.get(url)
        response.raise_for_status()
        soup = BeautifulSoup(response.text, 'html.parser')
        latest_version_link = soup.find('a', title='Latest Release')
        latest_version = latest_version_link.string.strip()

        # Extract the date in the format YYYYMMDDHHMM
        date_text = latest_version_link['href']
        match = re.search(r'(\d{4})(\d{2})(\d{2})(\d{2})(\d{2})', date_text)
        if match:
            version_date = f"{match.group(1)}{match.group(2)}{match.group(3)}{match.group(4)}{match.group(5)}"
        else:
            raise RuntimeError("Unable to extract version date")

        return latest_version, version_date

    def get_download_url_jdk(self)  -> str:
        key = self.__key()
        base_url_ibm_semeru = self.config['jdk']['base_url_ibm_semeru']

        download_files_jdk = {
            ('linux', 'x86_64'): f"ibm-semeru-open-jdk_x64_linux_{self.version_file_jdk.replace('+', '_')}.tar.gz",
            ('linux', 'aarch64'): f"ibm-semeru-open-jdk_aarch64_linux_{self.version_file_jdk.replace('+', '_')}.tar.gz",
            ('darwin', 'x86_64'): f"ibm-semeru-open-jdk_x64_mac_{self.version_file_jdk.replace('+', '_')}.tar.gz",
            ('darwin', 'arm64'): f"ibm-semeru-open-jdk_aarch64_mac_{self.version_file_jdk.replace('+', '_')}.tar.gz",
            ('windows', 'AMD64'): f"ibm-semeru-open-jdk_x64_windows_{self.version_file_jdk.replace('+', '_')}.zip",
            ('windows', 'ARM64'): f"ibm-semeru-open-jdk_x64_windows_{self.version_file_jdk.replace('+', '_')}.zip"
        }

        if key not in download_files_jdk:
            raise RuntimeError(f"Unsupported operating system or architecture: {self.system} {self.architecture}")

        return f"{base_url_ibm_semeru}/{self.version_jdk}/{download_files_jdk[key]}"

    def get_download_url_eclipse(self) -> str:
        key = self.__key()
        base_url_eclipse = self.config['eclipse']['base_url_eclipse']

        download_files_eclipse = {
            ('linux', 'x86_64'): f"R-{self.latest_eclipse_version}-{self.latest_eclipse_date}/eclipse-platform-{self.latest_eclipse_version}-linux-gtk-x86_64.tar.gz",
            ('linux', 'aarch64'): f"R-{self.latest_eclipse_version}-{self.latest_eclipse_date}/eclipse-platform-{self.latest_eclipse_version}-linux-gtk-aarch64.tar.gz",
            ('darwin', 'x86_64'): f"R-{self.latest_eclipse_version}-{self.latest_eclipse_date}/eclipse-platform-{self.latest_eclipse_version}-macosx-cocoa-x86_64.tar.gz",
            ('darwin', 'arm64'): f"R-{self.latest_eclipse_version}-{self.latest_eclipse_date}/eclipse-platform-{self.latest_eclipse_version}-macosx-cocoa-aarch64.tar.gz",
            ('windows', 'AMD64'): f"R-{self.latest_eclipse_version}-{self.latest_eclipse_date}/eclipse-platform-{self.latest_eclipse_version}-win32-x86_64.zip",
        }

        if key not in download_files_eclipse:
            raise RuntimeError(f"Unsupported operating system or architecture: {self.system} {self.architecture}")

        return f"{base_url_eclipse}{download_files_eclipse[key]}&r=1"

    def get_download_url_ant(self) -> str:
        base_url_ant = self.config['ant']['base_url_ant']
        return f"{base_url_ant}/{self.latest_ant_version}"

    def get_download_file_jdk(self) -> str:
        return self.download_url_jdk.split('/')[-1]
    
    def get_download_file_ant(self) -> str:
        return self.download_url_ant.split('/')[-1]    

    def get_download_file_eclipse(self) -> str:
        file = self.download_url_eclipse.split('/')[-1]
        return file.split('&')[0]

    def __key(self) -> str:

        return (self.system, self.architecture)

    def get_eclipse_install_units(self, with_optional: bool) -> dict:
        install_units = self.config['eclipse']['install_units']
        install_units_items = install_units.copy()
        for key, value in install_units_items.items():
            optional = value.get('optional', False)
            if not with_optional and optional:
                print(f"Skipping optional install unit: {key}")
                install_units.pop(key)
        return install_units

    def get_eclipse_url(self, with_optional: bool) -> str:
        # Extract the base URL and install unit URLs
        urls = set()
        eclipse_data = self.config.get("eclipse", {})
        base_url_eclipse = eclipse_data.get("base_url_eclipse")
        install_units = self.get_eclipse_install_units(with_optional)

        # Add base URL to the set if present
        if base_url_eclipse:
            urls.add(base_url_eclipse)

        # Add all unique URLs from install units
        for url in install_units.values():
            repo_url = url.get('url')
            username = url.get('username')
            password = url.get('password')
            if username and password:
                from urllib.parse import urlparse, urlunparse, quote
                password = password
                parsed_url = urlparse(repo_url)
                auth_part = f"{quote(username)}:{quote(password)}"
                # Append credentials after the path
                path_with_auth = f"{auth_part}@{parsed_url.netloc}"
                repo_url = urlunparse((
                    parsed_url.scheme,
                    path_with_auth,
                    parsed_url.path,
                    parsed_url.params,
                    parsed_url.query,
                    parsed_url.fragment
                ))

            urls.add(repo_url)

        # Convert set to a list and sort
        return sorted(urls)  # Sort the URLs
    
    def get_eclipse_url_string(self, with_optional: bool) -> str:
        return ",".join(self.get_eclipse_url(with_optional))