SRC_URI = "https://github.com/ros-controls/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "4f3fd8cbd9fd9f64c8ac592b1dbe79e4"
SRC_URI[sha256sum] = "78e8f70ce55d4698ee7ffa8d570d07c9a3cbd8cbad1f7cecfda546a2695bf060"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "ros_control"
