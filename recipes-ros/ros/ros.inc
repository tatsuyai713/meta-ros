SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "5f1ba8ec673f0ea8fd4969d50ae6049a"
SRC_URI[sha256sum] = "892703a33dc3e703cf504e5f3c772e55ccbba5d78f4b5eab75f33cea3614b48a"

ROS_PKG_SUBDIR ?= ""
S = "${WORKDIR}/${ROS_SP}/${ROS_PKG_SUBDIR}/${ROS_BPN}"

inherit catkin

ROS_SPN = "ros"
