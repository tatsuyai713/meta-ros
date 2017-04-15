DESCRIPTION = "ROS Package Tool"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost cmake-modules ${PYTHON_PN}-rospkg-native libtinyxml"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "d18cda087d64eaad3b878dd87991fffa"
SRC_URI[sha256sum] = "443e3f3cfa84c9a7b436cc10cc998a50ab8792d7939974575e077e9b718aa849"

inherit catkin

RDEPENDS_${PN} = "${PYTHON_PN}-rosdep ${PYTHON_PN}-subprocess"
