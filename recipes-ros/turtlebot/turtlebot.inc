SRC_URI = "https://github.com/turtlebot/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "f533ac0cac44faf10d3878617e9780d2"
SRC_URI[sha256sum] = "048c913840a6caa7f77a151fa216a5eaf74ff795db3c8af8ca850a2d3e22a798"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "turtlebot"
