#!/bin/bash

BBLAYERS=$WORKSPACE/meta-ros-src/meta-ros-bblayers.conf

mkdir -p $WORKSPACE/meta-ros-src
ln -s $WORKSPACE/meta-ros-src/openembedded-core/build/downloads meta-ros-downloads
ln -s $WORKSPACE/meta-ros-src/openembedded-core/build/sstate-cache meta-ros-sstate
ln -s $WORKSPACE/meta-ros-src/openembedded-core/build/tmp-glibc meta-ros-build

git clone https://github.com/bmwcarit/meta-ros.git $WORKSPACE/meta-ros-src/meta-ros
git clone http://git.openembedded.org/openembedded-core -b fido $WORKSPACE/meta-ros-src/openembedded-core
git clone http://git.openembedded.org/meta-openembedded -b fido $WORKSPACE/meta-ros-src/meta-openembedded
git clone http://git.openembedded.org/bitbake/ -b 1.26 $WORKSPACE/meta-ros-src/openembedded-core/bitbake

echo 'BBLAYERS += "/data/src/openembedded-core/meta"' >> $BBLAYERS
echo 'BBLAYERS += "/data/src/meta-openembedded/meta-oe"' >> $BBLAYERS
echo 'BBLAYERS += "/data/src/meta-openembedded/meta-python"' >> $BBLAYERS
echo 'BBLAYERS += "/data/src/meta-ros"' >> $BBLAYERS

# Create subversion servers file to make svn use the given http proxy
SUBVERSION_SERVERS=$WORKSPACE/meta-ros-src/subversion_servers
echo "For testing SVN setup: $http_proxy"
python $WORKSPACE/meta-ros-src/meta-ros/ci/prepare-svn-proxy-settings.py $SUBVERSION_SERVERS

DOCKER_IMAGE=$DOCKER_REGISTRY/bmwcarit/yocto-build:latest

docker pull $DOCKER_IMAGE

docker run \
    -e MACHINE=qemux86 \
    -e http_proxy \
    -e https_proxy \
    -v $WORKSPACE/meta-ros-src:/data/src \
    -v $BBLAYERS:/data/custom-layers.conf \
    -v ~/.ssh:/home/hsp-dev/.ssh \
    -v $SUBVERSION_SERVERS:/home/hsp-dev/.subversion/servers \
    -v /var/run/icecc:/var/run/icecc \
    -v /var/cache/icecream:/var/cache/icecream \
    -e DEV_UID=$(id -u) \
    -e DEV_GID=$GROUPS \
    --sig-proxy \
    --rm=true \
    $DOCKER_IMAGE \
           'cd /data/src/openembedded-core && \
           source ./oe-init-build-env && \
           cat /data/custom-layers.conf >> /data/src/openembedded-core/build/conf/bblayers.conf && \
           echo -e "INHERIT += \"rm_work\"" >> /data/src/openembedded-core/build/conf/local.conf && \
           echo -e "FETCHCMD_wget = \"/usr/bin/env wget -t 2 -T 360 -nv --passive-ftp --no-check-certificate\"" >> /data/src/openembedded-core/build/conf/local.conf && \
           bitbake core-image-ros-roscore'
