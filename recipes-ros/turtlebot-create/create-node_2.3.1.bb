DESCRIPTION = "iRobot Create ROS driver node"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "create-driver diagnostic-msgs dynamic-reconfigure geometry-msgs message-generation nav-msgs rospy tf"

require turtlebot-create.inc

RDEPENDS_${PN} = "python-orocos-kdl"
