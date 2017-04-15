SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "34eb6c289ee93e1f3a67c0865b50e3a4"
SRC_URI[sha256sum] = "816d96927e7aa6aa4972d5b9dfa3a1c71421cd9c15796d1f5f721ef947ee7fc3"

DEPENDS += "cpp-common roscpp-serialization message-generation message-runtime std-msgs"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "common_msgs"
