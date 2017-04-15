SRC_URI = "https://github.com/ros-controls/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "3bf5d9f3cbb9919af66236fe285c7a37"
SRC_URI[sha256sum] = "4830b64f00eaf2a7af8b386edf17570a7ce6f71e92c63473fdd1dafa3c98b735"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "ros_control"
