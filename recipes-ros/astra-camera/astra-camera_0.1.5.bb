DESCRIPTION = "Drivers for Orbbec Astra Devices."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "git-native camera-info-manager nodelet sensor-msgs roscpp dynamic-reconfigure image-transport message-generation"

SRC_URI = "https://github.com/tfoote/ros_astra_camera/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "f357cd739fec7df7bce9146aaeccb203"
SRC_URI[sha256sum] = "35a938536e02d2b987dd74f2129219c49256d76ba78d862fd5d8a308e363b472"

S = "${WORKDIR}/ros_astra_camera-${PV}"

inherit catkin
