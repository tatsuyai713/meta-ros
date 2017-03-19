DESCRIPTION = "A ROS node for using libsensors to provide diagnostics information about the sensors on a computer system"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp diagnostic-updater libsensors4-dev"

require linux-peripheral-interfaces.inc
