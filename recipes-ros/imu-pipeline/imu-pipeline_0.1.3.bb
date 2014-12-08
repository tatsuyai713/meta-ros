DESCRIPTION = "IMU Pipeline includes tools for processing and pre-processing IMU messages for easier use by later subscribers."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp sensor-msgs geometry-msgs nav-msgs tf"

SRC_URI = "https://github.com/ros-perception/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "a56887dd6ac37e80236eab5fa6e18300"
SRC_URI[sha256sum] = "32e29a1c10bf3d4b0b9afeae7c3de662b1a5aff771b95cacbb5127be295bcf69"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
