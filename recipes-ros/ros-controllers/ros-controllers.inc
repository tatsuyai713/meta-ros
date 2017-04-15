SRC_URI = "https://github.com/ros-controls/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "d1aedf24c23b565b9e50112d0a4af371"
SRC_URI[sha256sum] = "020f85899305a555f20c859ab4f65733f813ec76a0e7420eb562cf39445be377"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "ros_controllers"
