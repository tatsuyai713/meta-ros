SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "b66cd72081c1f7af399c085c4dd00d08"
SRC_URI[sha256sum] = "4c141270c9263ba1ceb0d510f9d17bfe229530a277bfe10762e88d25f46efd38"

ROS_PKG_SUBDIR ?= ""
S = "${WORKDIR}/${ROS_SP}/${ROS_PKG_SUBDIR}/${ROS_BPN}"

inherit catkin

ROS_SPN = "ros_comm"
