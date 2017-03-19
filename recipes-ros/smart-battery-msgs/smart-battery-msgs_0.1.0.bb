DESCRIPTION = "Smart Battery Messages"
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "std-msgs message-generation"

SRC_URI = "https://github.com/ros-drivers/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "e4708835f36e4066f7bb5cd59ee42081"
SRC_URI[sha256sum] = "f280a574b8b53e4b43c19da634932c82633c4f4dee23694626d807b5587f6788"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
