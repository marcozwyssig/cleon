#!/bin/bash

# Pull the desired version of the Gradle Docker image if not already available
# Modify the tag as needed for different versions of Gradle or JDK
IMAGE="gradle:latest"

echo "Pulling the Docker image: $IMAGE"
docker pull $IMAGE

# Run the Gradle command in Docker
# "$@" passes through all command line arguments to the gradle command inside the container
echo "Running Gradle command: gradle $@"
docker run --rm -v "$(pwd)":/home/gradle/project -w /home/gradle/project $IMAGE gradle "$@"