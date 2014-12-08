DESCRIPTION = "This package is a ROS wrapper for Alvar, an open source AR tag tracking library."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=f62de161dc7a8f859a0502707b17209e"

DEPENDS = "ar-track-alvar-msgs cmake-modules cv-bridge image-transport libtinyxml pcl-ros resource-retriever roscpp tf visualization-msgs"

SRC_URI = "https://github.com/sniekum/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c451797333c5f4f2fd48751bcf0cbd35"
SRC_URI[sha256sum] = "ef419427d7b7344b88d98a886cc8ae09863040b7741ad832e8b35455193a0393"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin
