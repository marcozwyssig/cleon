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

# List of installable units
install_units=(
  "org.eclipse.pde.feature.group"
  "org.eclipse.emf.mwe2.runtime"
  "org.eclipse.emf.mwe.core"
  "org.eclipse.ui.browser"
  "org.eclipse.platform.feature.group"
  "org.eclipse.gef"
)

# Install each component
for iu in "${install_units[@]}"; do
  $ECLIPSE_INSTALL_DIR/eclipse -nosplash \
    -application org.eclipse.equinox.p2.director \
    -repository $REPO_URL \
    -installIU $iu \
    -destination $ECLIPSE_INSTALL_DIR \
    -profile SDKProfile
done

echo "Eclipse components installation completed."
