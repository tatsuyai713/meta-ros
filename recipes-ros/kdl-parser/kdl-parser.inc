SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "6f7347c1532c81976298bd45019171be"
SRC_URI[sha256sum] = "05645f537a0a1f78b8517b974ff5c17464fa90ea0ff6ca2228e61d6db581b2ad"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "kdl_parser"
