DESCRIPTION = "Provides teleoperation using joysticks or keyboard."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp geometry-msgs joy"

require turtlebot.inc

RDEPENDS_${PN} = "kobuki-safety-controller yocs-velocity-smoother turtlebot-bringup"
