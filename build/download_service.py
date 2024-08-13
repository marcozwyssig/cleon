import os
from config import Config
import requests
from tqdm import tqdm
import tarfile
import zipfile


class DownloadService:
    def __init__(self, config: Config):
        self.config = config

    def download_jdk(self):
        """Download the JDK file to the destination directory."""
        DownloadService.__download_file(self.config.download_url_jdk , self.config.dest_dir, self.config.get_download_file_jdk())

    def extract_jdk(self):
        """Extract the downloaded JDK file."""
        jdk_filename = self.config.get_download_file_jdk()
        DownloadService.__extract_file(os.path.join(self.config.dest_dir, jdk_filename), os.path.join(self.config.dest_dir, "jdk"))

    def download_eclipse(self):
        """Download the Eclipse file to the destination directory."""
        DownloadService.__download_file(self.config.download_url_eclipse, self.config.dest_dir, self.config.get_download_file_eclipse())

    def extract_eclipse(self):
        """Extract the downloaded Eclipse file."""
        eclipse_filename = self.config.get_download_file_eclipse()
        DownloadService.__extract_file(os.path.join(self.config.dest_dir, eclipse_filename), os.path.join(self.config.dest_dir, "eclipse"))

    @staticmethod
    def __download_file(url, dest_dir, filename):
        """Download a file from the specified URL to the destination directory."""
        local_filename = os.path.join(dest_dir, filename)

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
        
    @staticmethod
    def __extract_file(filepath, dest_dir):
        """Extract a tar.gz or zip file to the specified directory."""
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

