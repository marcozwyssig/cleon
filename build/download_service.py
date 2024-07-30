import os
from config import DEST_DIR, DOWNLOAD_URL_JDK, DOWNLOAD_URL_ECLIPSE, DOWNLOAD_FILES_JDK, DOWNLOAD_FILES_ECLIPSE, KEY
from utils import download_file, extract_file

class DownloadService:
    def __init__(self, dest_dir):
        self.dest_dir = dest_dir

    def download_jdk(self):
        """Download the JDK file to the destination directory."""
        download_file(DOWNLOAD_URL_JDK, self.dest_dir, DOWNLOAD_FILES_JDK[KEY])

    def extract_jdk(self):
        """Extract the downloaded JDK file."""
        jdk_filename = DOWNLOAD_FILES_JDK[KEY].split('/')[-1]
        extract_file(os.path.join(self.dest_dir, jdk_filename), os.path.join(self.dest_dir, "jdk"))

    def download_eclipse(self):
        """Download the Eclipse file to the destination directory."""
        download_file(DOWNLOAD_URL_ECLIPSE, self.dest_dir, DOWNLOAD_FILES_ECLIPSE[KEY].split('/')[-1])

    def extract_eclipse(self):
        """Extract the downloaded Eclipse file."""
        eclipse_filename = DOWNLOAD_FILES_ECLIPSE[KEY].split('/')[-1]
        extract_file(os.path.join(self.dest_dir, eclipse_filename), os.path.join(self.dest_dir, "eclipse"))
