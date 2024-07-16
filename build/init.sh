#!/bin/bash

# Define the virtual environment directory
VENV_DIR="myenv"

# Create the virtual environment if it doesn't exist
if [ ! -d "$VENV_DIR" ]; then
  python3 -m venv "$VENV_DIR"
fi

# Activate the virtual environment
source "$VENV_DIR/bin/activate"

# Install required packages
pip3 install --upgrade pip
pip3 install -r requirements.txt

# Keep the virtual environment activated (for demonstration purposes, otherwise you can deactivate)
exec $SHELL