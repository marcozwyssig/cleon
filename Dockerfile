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
RUN wget -qO- https://mirror.dogado.de/eclipse/eclipse/downloads/drops4/R-4.30-202312010110/eclipse-SDK-4.30-linux-gtk-aarch64.tar.gz | tar xvz -C ${ECLIPSE_INSTALL_DIR}
RUN /opt/eclipse/eclipse -nosplash \
  -application org.eclipse.equinox.p2.director \
  -repository http://download.eclipse.org/releases/latest \
  -installIU org.eclipse.pde.feature.group \
  -destination ${ECLIPSE_INSTALL_DIR} \
  -profile SDKProfile

RUN /opt/eclipse/eclipse -nosplash \
  -application org.eclipse.equinox.p2.director \
  -repository https://updates.actifsource.com/updates \
  -installIU ch.actifsource \
  -destination ${ECLIPSE_INSTALL_DIR} \
  -profile SDKProfile

# Add the Eclipse installation directory to the PATH
ENV PATH=${ECLIPSE_INSTALL_DIR}/eclipse:${PATH}

# Set the working directory to the Eclipse installation directory
WORKDIR ${ECLIPSE_INSTALL_DIR}/eclipse

