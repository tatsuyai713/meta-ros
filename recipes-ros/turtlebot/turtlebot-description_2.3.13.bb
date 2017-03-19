DESCRIPTION = "turtlebot_description provides a complete 3D model of the TurtleBot for simulation and visualization."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "urdf xacro"

require turtlebot.inc

RDEPENDS_${PN} = "kobuki-description create-description"
