DESCRIPTION = "Python ROS message and service generators."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "genmsg"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "7c4f19a9f007e4df15685c779e835971"
SRC_URI[sha256sum] = "35e5cd2032f52a1f77190df5c31c02134dc460bfeda3f28b5a860a95309342b9"

inherit catkin

RDEPENDS_${PN} = "${PYTHON_PN}-math genmsg ${PYTHON_PN}-shell"
RDEPENDS_${PN}_class-native = ""
