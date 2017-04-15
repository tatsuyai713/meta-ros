SRC_URI = "https://github.com/ros-controls/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "e8d63331fac236e2ba1e8d30f82eaa0c"
SRC_URI[sha256sum] = "6ae40232c21184e7cafda6633df26fa30fd8461f0d018ce77500744126ce8eef"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "ros_controllers"
