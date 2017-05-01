SRC_URI = "https://github.com/yujinrobot/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "9fcda1a87939708f822b92976e2ed620"
SRC_URI[sha256sum] = "436c038dcd3c3d741bccbac2b25e936e15b6a686f3f21cfbe44dd88981aa6c4d"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "kobuki"
