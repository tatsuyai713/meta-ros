SRC_URI = "https://github.com/ros-planning/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "debbc9299dca694f0b949913b056d504"
SRC_URI[sha256sum] = "387a0d8d23d14dd8afba27524d7462b1860a8efd52c01c989123feefd7fc8019"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "navigation"
