FROM ibm-semeru-runtimes:open-21.0.1_12-jdk-jammy

#Install utilites
RUN apt-get update && \
    apt-get -y install apt-utils && \
    apt-get -y install tar && \
    apt-get -y install gzip && \
    apt-get -y install wget;

# Set environment variables for Eclipse version and installation directory
ENV ECLIPSE_VERSION=4.30
ENV ECLIPSE_INSTALL_DIR=/opt

# Download and install Eclipse
#RUN wget -qO- "https://download.eclipse.org/eclipse/downloads/drops4/R-4.30-202312010110/download.php?dropFile=eclipse-SDK-4.30-linux-gtk-x86_64.tar.gz"

# Set the working directory to the Eclipse installation directory
#WORKDIR ${ECLIPSE_INSTALL_DIR}/eclipse

