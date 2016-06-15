#!/bin/bash

# Increase this number any time the modifications of the bblayers.conf
# or local.conf gets changed.
CONF_VERSION="$CONF_VERSION.1"


APPEND_TO_LOCAL_CONF()
{
    echo -e $1 >> $LOCALCONF_PATH
}

APPEND_TO_BBLAYERS()
{
    echo -e $1 >> $BBLAYERS_PATH
}

BASE_PATH=`pwd`
POKY_PATH=/data/poky
TEMPLATE_PATH=/data/conf/templates

CONF_VERSION_STRING="# CI_CONF_VERSION = "

BBLAYERS_PATH="conf/bblayers.conf"
LOCALCONF_PATH="conf/local.conf"

# get the build dir
BUILD_DIR=$1
if [ -z "$BUILD_DIR" ]
then
    BUILD_DIR=$BASE_PATH/build
fi

echo "Using build dir \"$BUILD_DIR\""

export TEMPLATECONF=$TEMPLATE_PATH
source $POKY_PATH/oe-init-build-env

# check current local.conf version
CURRENT_CONF_VERSION=`grep "$CONF_VERSION_STRING" $LOCALCONF_PATH | awk '{print $4}'`
if [ -n "$CURRENT_CONF_VERSION" ]
then
    # local.conf is already configured
    if [ "$CURRENT_CONF_VERSION" = "$CONF_VERSION" ]
    then
        echo "Already configured, skipping modification of bblayers.conf and local.conf"
        return 1
    else
        echo "WARNING: Already configured but in wrong version! Please adapt manually or consider a clean build!"
        return 1
    fi
fi

# set download dir if necessary

if [ -z "$CITIX_DOWNLOAD_DIR" ]
then
    # fall back using git config
    CITIX_DOWNLOAD_DIR=`git config yocto.downloads`
fi

if [ -n "$CITIX_DOWNLOAD_DIR" ]
then
    sed -i "s:^#*DL_DIR.*:DL_DIR ?= \"$CITIX_DOWNLOAD_DIR\":g" $LOCALCONF_PATH
fi

set sstate dir if necessary
if [ -n "$CITIX_SSTATE_DIR" ]
then
    sed -i "s:^#*SSTATE_DIR.*:SSTATE_DIR ?= \"$CITIX_SSTATE_DIR\":g" $LOCALCONF_PATH
fi

#sed -i 's:DISTRO ?= "gpt":DISTRO ?= "citix":g' $LOCALCONF_PATH

# link site.conf if not done yet
if [ ! -e conf/site.conf ]
then
    ln -s "/data/conf/car-it-site.conf" "${BUILDDIR}/conf/site.conf"
fi


# determine load factor for parallel make
LOAD_FACTOR=$[`grep -c ^processor /proc/cpuinfo`+1]

# get number of threads
BB_NUMBER_THREADS=`git config yocto.threads`
if [ -z "$BB_NUMBER_THREADS" ]
then
	BB_NUMBER_THREADS=16
fi

# changes to local.conf
APPEND_TO_LOCAL_CONF
APPEND_TO_LOCAL_CONF "$CONF_VERSION_STRING$CONF_VERSION"
APPEND_TO_LOCAL_CONF "BB_NUMBER_THREADS = \"$BB_NUMBER_THREADS\""
APPEND_TO_LOCAL_CONF "PARALLEL_MAKE = \"-j $LOAD_FACTOR \""
APPEND_TO_LOCAL_CONF "BBMASK = \"$BBMASK\""
APPEND_TO_LOCAL_CONF "INHERIT += \"rm_work\""
APPEND_TO_LOCAL_CONF
APPEND_TO_LOCAL_CONF "# set deploy dir outside tmp"
APPEND_TO_LOCAL_CONF "# this is useful when building on a tmpfs"
APPEND_TO_LOCAL_CONF "DEPLOY_DIR = \"\${TOPDIR}/deploy\""

APPEND_TO_LOCAL_CONF "LICENSE_FLAGS_WHITELIST = \"commercial_gst-plugins-ugly \\"
APPEND_TO_LOCAL_CONF "                           commercial_libmad\""
APPEND_TO_LOCAL_CONF ""

