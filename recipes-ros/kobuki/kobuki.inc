SRC_URI = "https://github.com/yujinrobot/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "d7022002cb1a8c878b2ce7928ed61c45"
SRC_URI[sha256sum] = "02955d3bded38bb346bb478b2f8cde2ce1c502b41fda46a4b7bfcfe1e0d1bc11"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "kobuki"
