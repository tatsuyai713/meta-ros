SRC_URI = "https://github.com/yujinrobot/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "ba0f219da77781b65570d2345dadc967"
SRC_URI[sha256sum] = "c07c19ca610d720f6b85b36a89506de19aec93a3da0a6b3e5f92e3361b2406b6"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "kobuki_core"
