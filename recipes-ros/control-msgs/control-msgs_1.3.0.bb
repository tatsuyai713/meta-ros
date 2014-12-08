DESCRIPTION = "control_msgs contains base messages and actions useful for controlling robots. It \
provides representations for controller setpoints and joint and cartesian trajectories."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs trajectory-msgs geometry-msgs actionlib-msgs"

SRC_URI = "https://github.com/ros-controls/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "bfb614ca55aa7b5441abba8232c02b5a"
SRC_URI[sha256sum] = "bad096240b66dea621d47582495e81203fc8fc4397a2645b55fef94aec7df4ed"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin
