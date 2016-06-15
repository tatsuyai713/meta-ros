FROM ubuntu:14.04
MAINTAINER Lukas Bulwahn (lukas.bulwahn@bmw-carit.de)

RUN apt-get update -y \
	&& apt-get install -y \
		build-essential \
		chrpath \
		diffstat \
		dos2unix \
		gawk \
		gcc-multilib \
		git-core \
		icecc \
		iptables \
		lib32stdc++6 \
		lib32z1 \
		libgcc1 \
		libsdl1.2-dev \
		lzop \
		pbzip2 \
		pigz \
		qemu-system \
		qemu-utils \
		socat \
		sudo \
		texinfo \
		unzip \
		vim \
		wget \
		zlibc \
	&& apt-get clean \
	&& ln -s /usr/bin/pigz /usr/local/bin/gzip \
	&& ln -s /usr/bin/pigz /usr/local/bin/gunzip \
	&& ln -s /usr/bin/pigz /usr/local/bin/gzcat \
	&& ln -s /usr/bin/pigz /usr/local/bin/zcat

# Yocto related mounts
VOLUME /data/src
VOLUME /data/build
VOLUME /data/sstate
VOLUME /data/downloads

# Icecream mounts
VOLUME /var/run/icecc
VOLUME /var/cache/icecream/

# Some build scripts
COPY build-env.sh /data/build-env.sh
COPY boot.sh /data/boot.sh
COPY bootstrap* /data/

# Template config
COPY conf /data/conf

# gosu is needed to run as different user
RUN wget -q -O /usr/local/bin/gosu https://dl.bmw-carit.de/mirror/gosu && chmod +x /usr/local/bin/gosu

# prepare skel dir for new user
COPY gitconfig /etc/skel/.gitconfig
RUN echo "source /data/build-env.sh" > /etc/skel/.bashrc \
	&& chmod +x /etc/skel/.bashrc

# Add en_US.UTF-8 locale to image
RUN locale-gen en_US.UTF-8 && update-locale LANG=en_US.UTF-8
ENV LANG en_US.UTF-8

# The entrypoint is needed to run as different user with UID given at container startup
ENTRYPOINT ["/data/boot.sh"]
