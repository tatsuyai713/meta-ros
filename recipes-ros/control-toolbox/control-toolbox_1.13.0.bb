DESCRIPTION = "The control toolbox contains modules that are useful across all controllers."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rosconsole tf roscpp angles message-generation dynamic-reconfigure libtinyxml \
    realtime-tools message-filters"

SRC_URI = "https://github.com/ros-controls/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "99f631fd1d06403d780ae706cf5cae05"
SRC_URI[sha256sum] = "25dd346f639f048d0ce03ae27caa38966a612d9cc83a46e0aa3698cd3bbd4750"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
