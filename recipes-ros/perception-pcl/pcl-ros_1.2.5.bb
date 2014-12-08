DESCRIPTION = "PCL (Point Cloud Library) ROS interface stack"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "dynamic-reconfigure nodelet nodelet-topic-tools message-filters tf rosbag pcl pcl-conversions"

SRC_URI = "https://github.com/ros-perception/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "574f48560b002fd9ccdeeb3e78611b9b"
SRC_URI[sha256sum] = "839052281aa9f46aea1c595a47d93a3125de1dbaaa9a92109e969c5ea0022538"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "perception_pcl"
