import os
import shutil
from config import *
from utils import is_installed
import requests

class InstallationManager:
    def __init__(self, dest_dir):
        self.dest_dir = dest_dir
        self.eclipse_exec_dir = os.path.join(dest_dir, "eclipse", "eclipse")

    def move_jdk_to_eclipse(self):
        """Move the extracted JDK into the Eclipse folder and rename it."""
        extracted_jdk_path = os.path.join(self.dest_dir, "jdk", VERSION_FILE_JDK_SHORT)
        eclipse_dirname = [name for name in os.listdir(os.path.join(self.dest_dir, "eclipse")) if name.startswith("eclipse")][0]
        eclipse_path = os.path.join(os.path.join(self.dest_dir, "eclipse"), eclipse_dirname)
        
        if not os.path.isdir(extracted_jdk_path):
            print(f"Error: Extracted JDK path {extracted_jdk_path} does not exist.")
            return False

        jdk_dest_path = os.path.join(eclipse_path, "jdk")
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

    def update_eclipse_ini(self):
        """Update the eclipse.ini file to include the JDK path."""
        eclipse_ini = os.path.join(self.eclipse_exec_dir, "eclipse.ini")
        vm_path = 'jdk/bin/java'

        with open(eclipse_ini, 'r') as file:
            lines = file.readlines()

        # Check if the -vm argument is already present
        vm_arg_present = False
        for line in lines:
            if line.strip() == '-vm':
                vm_arg_present = True
                break

        # If -vm is not present, insert it before -vmargs
        if not vm_arg_present:
            new_lines = []
            vm_inserted = False
            for line in lines:
                if not vm_inserted and line.strip() == '-vmargs':
                    new_lines.append('-vm\n')
                    new_lines.append(f'{vm_path}\n')
                    vm_inserted = True
                new_lines.append(line)

            # Write the updated contents back to the eclipse.ini file
            with open(eclipse_ini, 'w') as file:
                file.writelines(new_lines)

        print("eclipse.ini file updated successfully.")

    def populate_cache(self, c):
        """Populate the cache file with installed components."""
        if os.path.isfile(INSTALLED_CACHE):
            os.remove(INSTALLED_CACHE)
        
        result = c.run(
            f"{self.eclipse_exec_dir}/eclipse -nosplash -application org.eclipse.equinox.p2.director -listInstalledRoots",
            hide=True,
            warn=True
        )        
            
        with open(INSTALLED_CACHE, 'w') as f:
            f.write(result.stdout)


    def is_installed(iu, installed_cache):
        """Check if an installable unit is already installed."""
        if os.path.isfile(installed_cache):
            with open(installed_cache, 'r') as f:
                installed_units = f.read().splitlines()
                return iu in installed_units
        return False

    def install_eclipse_components(self, c):
        """Install each component if not already installed."""   
        for iu, repo_url in INSTALL_UNITS.items():
            if is_installed(iu, INSTALLED_CACHE):
                print(f"{iu} is already installed.")
            else:
                print(f"Installing {iu}...")
                result = c.run(
                    f"{self.eclipse_exec_dir}/eclipse -nosplash "
                    f"-application org.eclipse.equinox.p2.director "
                    f"-repository {repo_url},{REPO_URL},{ACTIFSOURCE_REPO_URL},{ECD_PLUGIN_REPO_URL} "
                    f"-installIU {iu} "
                    f"-destination {self.eclipse_exec_dir} "
                    f"-profile SDKProfile"
                )
                if result == 0:
                    with open(INSTALLED_CACHE, 'a') as f:
                        f.write(f"{iu}\n")
        
        print("Eclipse components installation completed.")

    def package_eclipse(self):
        """Package the Eclipse directory into a zip file."""
        eclipse_dir = os.path.join(self.dest_dir, "eclipse")
        zip_filename = os.path.join(self.dest_dir, f"eclipse_{SYSTEM}_{ARCHITECTURE}.zip")

        if os.path.isfile(zip_filename):
            print(f"{zip_filename} already exists, skipping packaging.")
            return True

        print(f"Packing {eclipse_dir} into {zip_filename}...")
        
        try:
            shutil.make_archive(zip_filename.replace('.zip', ''), 'zip', eclipse_dir)
            print(f"Packaged Eclipse into {zip_filename} successfully.")
            return True
        except shutil.Error as e:
            print(f"Error: Packaging failed due to {e}")
            return False

    def upload_to_github(self, zip_filename, release_tag="latest"):
        """Upload the zip file to GitHub Package Registry."""
        headers = {
            "Authorization": f"token {GITHUB_TOKEN}",
            "Content-Type": "application/zip"
        }

        # Get release ID
        response = requests.get(
            f"{GITHUB_API_URL}/repos/{GITHUB_REPOSITORY}/releases/tags/{release_tag}",
            headers=headers
        )
        if response.status_code != 200:
            print(f"Error: Failed to get release information. {response.json()}")
            return False

        release_id = response.json()["id"]

        # Upload asset
        upload_url = f"{GITHUB_API_URL}/repos/{GITHUB_REPOSITORY}/releases/{release_id}/assets"
        params = {"name": os.path.basename(zip_filename)}
        with open(zip_filename, 'rb') as file_data:
            response = requests.post(upload_url, headers=headers, params=params, data=file_data)
        
        if response.status_code == 201:
            print(f"Uploaded {zip_filename} to GitHub successfully.")
            return True
        else:
            print(f"Error: Failed to upload asset. {response.json()}")
            return False