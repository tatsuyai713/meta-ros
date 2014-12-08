SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "9cabcbb6fcacc7caed3e1868536fdeaa"
SRC_URI[sha256sum] = "692726054e0d05fbbe9095893e2b29f2ecafaaa3517ac0d8c8cd0621d0b28b1a"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "geometry"
