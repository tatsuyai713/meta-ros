SRC_URI = "https://github.com/ros-planning/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "a252c5fc8900a18f896be3d8d6d4ba05"
SRC_URI[sha256sum] = "584a6549735e6907e77ce07a95483a7635a845affc69775069b77acd599fe43b"

S = "${WORKDIR}/git/${ROS_BPN}"

inherit catkin ros-insane

ROS_SPN = "moveit"
