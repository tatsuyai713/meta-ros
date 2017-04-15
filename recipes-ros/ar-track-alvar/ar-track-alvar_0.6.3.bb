DESCRIPTION = "This package is a ROS wrapper for Alvar, an open source AR tag tracking library."
SECTION = "devel"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=061abe8dc89f326789675967c8760541"

DEPENDS = "ar-track-alvar-msgs cmake-modules cv-bridge image-transport libtinyxml pcl-ros resource-retriever roscpp tf visualization-msgs"

SRC_URI = "https://github.com/sniekum/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "744fdcbd9d472a9cbf068429c6f8f863"
SRC_URI[sha256sum] = "08d93e7efe2fb7dde4fba07ceb425d7c86da28216a8f49b7b3e31f61b48ffc1f"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
