DESCRIPTION = "Drivers for the Asus Xtion and Primesense Devices."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-info-manager nodelet sensor-msgs roscpp dynamic-reconfigure image-transport message-generation"

SRC_URI = "https://github.com/ros-drivers/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "8a699af99b71146755eaa5805ccb586c"
SRC_URI[sha256sum] = "29e0875b9a22fb9e0908f1b59acc496de1ecebef09a0c0ba7a3b7a7b328882aa"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
