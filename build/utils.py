import os
import requests
from tqdm import tqdm
import tarfile
import zipfile

def download_file(url, dest_dir, filename):
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


def extract_file(filepath, dest_dir):
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

