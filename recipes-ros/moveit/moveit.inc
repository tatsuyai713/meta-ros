SRC_URI = "https://github.com/ros-planning/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "1a4a5b0fc6c747eb69fea7075ba6c9d0"
SRC_URI[sha256sum] = "c85fdc09453b27aab2bc41205a36123f6a1be84bf7eef5ed79a0b9b88dce009d"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin ros-insane

ROS_SPN = "moveit"
