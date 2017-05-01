SRC_URI = "https://github.com/ros-controls/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "374cb5b64ec4e38d575e1e5f78d2facc"
SRC_URI[sha256sum] = "b8612650b19907baa5dcfcdd4a88782a1b0287793c6f3781b11e3318a15b23e8"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "ros_controllers"
