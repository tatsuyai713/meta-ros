#!/bin/sh

SCRIPT_FILE=${BASH_SOURCE[0]}
if [ `echo $SHELL | grep zsh` ]
then
	SCRIPT_FILE=$0
fi

SCRIPT_PATH="$(cd "$( dirname "$SCRIPT_FILE")" && pwd)"
echo $SCRIPT_PATH

# BBMASK must be there before base is sourced
BBMASK=""

# Increase this number any time the modifications of the
# bblayers.conf or local.conf gets changed.
CONF_VERSION="1"

# source the base script
if ! . $SCRIPT_PATH/bootstrap-base.sh $@
then
    return
fi

# set machine in bblayers
sed -i "s:^MACHINE.*:MACHINE ?= \"qemux86\":g" $BBLAYERS_PATH

