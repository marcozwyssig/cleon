#!/bin/bash

# Define the Eclipse installation directory
ECLIPSE_INSTALL_DIR="/tmp/eclipse"

# Check if the Eclipse installation directory exists
if [ ! -d "$ECLIPSE_INSTALL_DIR" ]; then
  echo "Error: Eclipse installation directory $ECLIPSE_INSTALL_DIR does not exist."
  exit 1
fi

# Define the repository URL
REPO_URL="http://download.eclipse.org/releases/latest"
ACTIFSOURCE_REPO_URL="https://updates.actifsource.com/updates-enterprise"
ECD_PLUGIN_REPO_URL="https://ecd-plugin.github.io/update"

# List of installable units and their repositories
declare -A install_units=(
  ["org.eclipse.pde.feature.group"]=$REPO_URL
  ["org.eclipse.emf.mwe2.runtime"]=$REPO_URL
  ["org.eclipse.emf.mwe.core"]=$REPO_URL
  ["org.eclipse.egit.feature.group"]=$REPO_URL
  ["org.eclipse.ui.browser"]=$REPO_URL
  ["org.eclipse.platform.feature.group"]=$REPO_URL
  ["org.eclipse.draw2d.feature.group"]=$REPO_URL
  ["org.eclipse.gef.feature.group"]=$REPO_URL
  ["org.eclipse.gmf.feature.group"]=$REPO_URL
  ["ch.actifsource.enterprise.feature.group"]=$ACTIFSOURCE_REPO_URL
  #["org.sf.feeling.decompiler.feature.group"]=$ECD_PLUGIN_REPO_URL
)

# Cache file for installed components
INSTALLED_CACHE="/tmp/installed_components.txt"

# Populate the cache file if it doesn't exist
if [ -f "$INSTALLED_CACHE" ]; then
  rm -f "$INSTALLED_CACHE"
fi

$ECLIPSE_INSTALL_DIR/eclipse -nosplash \
  -application org.eclipse.equinox.p2.director \
  -listInstalledRoots > "$INSTALLED_CACHE"

# Function to check if an installable unit is already installed
is_installed() {
  local iu=$1
  grep -q $iu "$INSTALLED_CACHE"
}

# Install each component if not already installed
for iu in "${!install_units[@]}"; do
  if is_installed $iu; then
    echo "$iu is already installed."
  else
    echo "Installing $iu..."
    $ECLIPSE_INSTALL_DIR/eclipse -nosplash \
      -application org.eclipse.equinox.p2.director \
      -repository ${install_units[$iu]},$REPO_URL,$ACTIFSOURCE_REPO_URL,$ECD_PLUGIN_REPO_URL \
      -installIU $iu \
      -destination $ECLIPSE_INSTALL_DIR \
      -profile SDKProfile
    # Update the cache file after successful installation
    if [ $? -eq 0 ]; then
      echo $iu >> "$INSTALLED_CACHE"
    fi
  fi
done

echo "Eclipse components installation completed."
