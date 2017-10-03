DESCRIPTION = "This package contains a set of tools that can be used from \
a hard realtime thread, without breaking the realtime behavior. The tools \
currently only provides the realtime publisher, which makes it possible \
to publish messages to a ROS topic from a realtime thread."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp rospy"

SRC_URI = "https://github.com/ros-controls/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "254794f6b4828d6647eb1e47cacedde3"
SRC_URI[sha256sum] = "ecc9a0734a6ac91df530ae461335ec67a7504918413fc4a9e1cfb70770b6b351"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
