#!/bin/bash

# Define the download URL
DOWNLOAD_URL="https://github.com/ibmruntimes/semeru21-binaries/releases/download/jdk-21.0.3%2B9_openj9-0.44.0/ibm-semeru-open-jdk_x64_linux_21.0.3_9_openj9-0.44.0.tar.gz"

# Define the destination directory
DEST_DIR="/opt/semeru"

# Create the destination directory if it doesn't exist
if [ ! -d "$DEST_DIR" ]; then
  mkdir -p "$DEST_DIR"
fi

# Change to the destination directory
cd "$DEST_DIR"

# Download the file
wget "$DOWNLOAD_URL"

# Check if the download was successful
if [ $? -eq 0 ]; then
  echo "Download completed in $DEST_DIR successfully."
else
  echo "Error: Download failed."
  exit 1
fi
