SRC_URI = "https://github.com/RobotWebTools/rosbridge_suite/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "ce06bf2a7aec83ff1bdc17a561122b57"
SRC_URI[sha256sum] = "306410362f48d0ba2f3e1f79115818175a1dead2efed1938191cb535ee49aa0c"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "rosbridge_suite"
