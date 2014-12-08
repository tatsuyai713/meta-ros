SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "46df56c33a35805e8680d41fc275be5e"
SRC_URI[sha256sum] = "1e98b5222f3c9573c6244bb5049039dd1bc35e4e948d82f7682a7b1a212f03d8"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "ros_comm_msgs"
