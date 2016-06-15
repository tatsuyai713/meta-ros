BASE_DIR=/data/src
BUILD_DIR=/data/build
CONFIG_DIR=$BUILD_DIR/conf
RESULTS_DIR=$BUILD_DIR/deploy
RESULTS_SDK_DIR=$RESULTS_DIR/sdk
RESULTS_IMG_DIR=$RESULTS_DIR/images
CITIX_SHARED_CACHE=$BUILD_DIR

export JAVA_HOME="/usr/lib/jvm/java-7-openjdk-amd64"
export JDK_HOME=$JAVA_HOME

export CITIX_DOWNLOAD_DIR="/data/downloads"
export CITIX_SSTATE_DIR="/data/sstate"

MACHINE=${MACHINE:=qemux86}
BOOTSTRAP_SCRIPT=bootstrap-$MACHINE.sh

echo "#"
echo "# MACHINE = ${MACHINE}"
echo "# BOOTSTRAP_SCRIPT = ${BOOTSTRAP_SCRIPT}"
echo "#"

ulimit -u 4096

POKY_INIT_SCRIPT=/data/poky/oe-init-build-env

if [ -f "$POKY_INIT_SCRIPT" ] ; then
    source ${BASE_DIR}/../${BOOTSTRAP_SCRIPT} $BUILD_DIR
fi

