DESCRIPTION = "This package contains a set of tools that can be used from \
a hard realtime thread, without breaking the realtime behavior. The tools \
currently only provides the realtime publisher, which makes it possible \
to publish messages to a ROS topic from a realtime thread."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp rospy"

SRC_URI = "https://github.com/ros-controls/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "7c014cda5ad7a434d18163f191f29062"
SRC_URI[sha256sum] = "4ece80d5eebb218222f4a923cb0b39a361f80f7459fe7b55eafda56b883e7ff4"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
