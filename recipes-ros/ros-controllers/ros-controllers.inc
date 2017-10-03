SRC_URI = "https://github.com/ros-controls/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "1cfc1dd16a6b9212f1c8ade8c0df8d3c"
SRC_URI[sha256sum] = "3b9b08203d38146797fc80ef3b9d754f885609e93fc8a7a55720cffcd668f005"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "ros_controllers"
