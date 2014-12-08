DESCRIPTION = "Provides conversions from PCL data types and ROS message types"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "pcl-msgs pcl roscpp"

SRC_URI = "https://github.com/ros-perception/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c79cf2f3263494696b9d135d961679c8"
SRC_URI[sha256sum] = "71877151be2980a04a909fad503fbc8a31344bac9962672bbfbb6c042593714e"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
