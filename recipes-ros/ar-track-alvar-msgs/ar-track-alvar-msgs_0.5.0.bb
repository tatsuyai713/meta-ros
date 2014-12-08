DESCRIPTION = "This package is a ROS wrapper for Alvar, an open source AR tag tracking library."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation geometry-msgs std-msgs"

SRC_URI = "https://github.com/sniekum/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "4f0a852089283abcd98881cfc29d970e"
SRC_URI[sha256sum] = "40fc6261bef2a216192ec67d75ee89c62015b038ea68339b1c43c77e72bb72cb"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
