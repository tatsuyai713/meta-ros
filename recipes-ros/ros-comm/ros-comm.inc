SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "a3c30dd8676c3be3f21824865ad6ebf6"
SRC_URI[sha256sum] = "41becc728408168725dd30cdbc83a96e0f036a105387760f76e46a4bb0ce739c"

ROS_PKG_SUBDIR ?= ""
S = "${WORKDIR}/${ROS_SP}/${ROS_PKG_SUBDIR}/${ROS_BPN}"

inherit catkin

ROS_SPN = "ros_comm"
