DESCRIPTION = "Capabilities for the TurtleBot"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

require turtlebot.inc

RDEPENDS_${PN} = "capabilities std-capabilities"
