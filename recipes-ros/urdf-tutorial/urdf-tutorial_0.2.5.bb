DESCRIPTION = "This package contains a number of URDF tutorials."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "urdf"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "2ea186e30b865fb6c6e535add7bd445e"
SRC_URI[sha256sum] = "c90e7ca21bb51e851f1609c853103f39711da18f79c9915cd4d5fc3f100031c2"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
