SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "aa605ac77658972323f373a47fbe43da"
SRC_URI[sha256sum] = "b0cd9ff305ab57a964354262902fda6f2c1be6efc22bbbb729e753cee7308868"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "kdl_parser"
