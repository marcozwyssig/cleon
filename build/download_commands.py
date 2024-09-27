import os
import logging
import requests
import time

from tqdm import tqdm
import tarfile
import zipfile
from config import Config
from abstract_command import AbstractCommand

logging.basicConfig(level=logging.INFO, format='%(asctime)s - %(levelname)s - %(message)s')

class AbstractDownloadCommand(AbstractCommand):
    def __init__(self, config: Config):
        super().__init__(config)

    def execute(self):
        if self.download():
            self.extract()

    def download(self) -> bool:
        raise NotImplementedError("The download method must be implemented by a subclass.")

    def extract(self) -> bool:
        raise NotImplementedError("The extract method must be implemented by a subclass.")
    
    @staticmethod
    def _download_file(url: str, dest_dir: str, filename: str) -> bool:
        local_filename = os.path.join(dest_dir, filename)
        max_retries = 10
        retry_delay = 15  # seconds

        if os.path.isfile(local_filename):
            logging.info(f"{filename} already exists, skipping download.")
            return True

        logging.info(f"Downloading {url} to {dest_dir}...")

        for attempt in range(1, max_retries + 1):
            try:
                headers = {'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64)'}
                response = requests.get(url, stream=True, allow_redirects=True, headers=headers)

                if response.status_code == 403:
                    logging.warning(f"Attempt {attempt}: Access forbidden when accessing {url}. Retrying in {retry_delay} seconds...")
                    if attempt == max_retries:
                        logging.error(f"Failed to download {url} after {max_retries} attempts due to 403 Forbidden.")
                        return False
                    time.sleep(retry_delay)
                    continue
                elif response.status_code == 404:
                    logging.error(f"Resource not found at {url}. The server returned a 404 status code.")
                    return False
                else:
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
                        if chunk:  # filter out keep-alive new chunks
                            size = f.write(chunk)
                            bar.update(size)

                logging.info(f"Download completed successfully and saved to {dest_dir}.")
                return True

            except requests.HTTPError as e:
                logging.error(f"HTTP error occurred on attempt {attempt}: {e}")
                if attempt == max_retries:
                    logging.error(f"Failed to download {url} after {max_retries} attempts due to HTTP errors.")
                    return False
                logging.info(f"Retrying in {retry_delay} seconds...")
                time.sleep(retry_delay)
            except requests.RequestException as e:
                logging.error(f"Request exception on attempt {attempt}: {e}")
                if attempt == max_retries:
                    logging.error(f"Failed to download {url} after {max_retries} attempts due to request exceptions.")
                    return False
                logging.info(f"Retrying in {retry_delay} seconds...")
                time.sleep(retry_delay)
            except Exception as e:
                logging.error(f"An unexpected error occurred on attempt {attempt}: {e}")
                if attempt == max_retries:
                    logging.error(f"Failed to download {url} after {max_retries} attempts due to unexpected errors.")
                    return False
                logging.info(f"Retrying in {retry_delay} seconds...")
                time.sleep(retry_delay)

        # If all retries fail
        logging.error(f"All {max_retries} attempts to download {url} have failed.")
        return False

    @staticmethod
    def _extract_file(filepath: str, dest_dir: str) -> bool:
        """Extract a tar.gz or zip file to the specified directory."""
        if os.path.isdir(dest_dir) and os.listdir(dest_dir):
            logging.info(f"{dest_dir} already contains extracted content, skipping extraction.")
            return True
        
        logging.info(f"Extracting {filepath} to {dest_dir}...")
        try:
            if filepath.endswith(".tar.gz"):
                with tarfile.open(filepath, "r:gz") as tar:
                    tar.extractall(path=dest_dir)
            elif filepath.endswith(".zip"):
                with zipfile.ZipFile(filepath, "r") as zip_ref:
                    zip_ref.extractall(dest_dir)
            else:
                logging.error(f"Unsupported file format for extraction: {filepath}")
                return False
            logging.info(f"Extraction completed successfully.")
            return True
        except (tarfile.TarError, zipfile.BadZipFile) as e:
            logging.error(f"Extraction failed due to: {e}")
            return False

    
class DownloadJdkCommand(AbstractDownloadCommand):
    def __init__(self, config: Config):
        super().__init__(config)

    def download(self) -> bool:
        """Download the JDK file to the destination directory."""
        return self._download_file(self.config.download_url_jdk, self.config.directory_manager.dest_dir, self.config.download_file_jdk)

    def extract(self) -> bool:
        """Extract the downloaded JDK file."""
        jdk_filename = self.config.download_file_jdk
        return self._extract_file(os.path.join(self.config.directory_manager.dest_dir, jdk_filename), os.path.join(self.config.directory_manager.dest_dir, self.config.directory_manager.jdk_dir))

class DownloadEclipseCommand(AbstractDownloadCommand):
    def __init__(self, config: Config):
        super().__init__(config)

    def download(self) -> bool:
        """Download the Eclipse file to the destination directory."""
        return self._download_file(self.config.download_url_eclipse, self.config.directory_manager.dest_dir, self.config.download_file_eclipse)

    def extract(self) -> bool:
        """Extract the downloaded Eclipse file."""
        eclipse_filename = self.config.download_file_eclipse
        return self._extract_file(os.path.join(self.config.directory_manager.dest_dir, eclipse_filename), os.path.join(self.config.directory_manager.dest_dir, self.config.directory_manager.eclipse_dir))
    

class DownloadAntCommand(AbstractDownloadCommand):
    def __init__(self, config: Config):
        super().__init__(config)

    def download(self) -> bool:
        return self._download_file(self.config.download_url_ant, self.config.directory_manager.dest_dir, self.config.download_file_ant)

    def extract(self) -> bool:
        """Extract the downloaded Ant file."""
        ant_filename = self.config.download_file_ant
        return self._extract_file(os.path.join(self.config.directory_manager.dest_dir, ant_filename), os.path.join(self.config.directory_manager.dest_dir, self.config.directory_manager.ant_dir))
