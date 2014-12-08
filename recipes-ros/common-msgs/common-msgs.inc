SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "08057817eb93188c6914529152165e80"
SRC_URI[sha256sum] = "305d69f8eae1a84031e8d7cacce6de9ed7d837cd3bf3395b46710d58dab8abe8"

DEPENDS += "cpp-common roscpp-serialization message-generation message-runtime std-msgs"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "common_msgs"
