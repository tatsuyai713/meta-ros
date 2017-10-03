SRC_URI = "https://github.com/ros-controls/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "e58713dcdf2e0b1911bd9c0bc79bb9ed"
SRC_URI[sha256sum] = "6a3c4194178c6aeacfa39f1c8c334a177b15dffc8efa51b4fba88df4b5bdbf6c"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "ros_control"
