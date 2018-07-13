SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "2781c5e30801e64331b2beef80791485"
SRC_URI[sha256sum] = "d0b914b9a69de0dde770bfd9d2efc2b4bec3d7ab8f047478e2be380a0bd510f5"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "geometry2"
