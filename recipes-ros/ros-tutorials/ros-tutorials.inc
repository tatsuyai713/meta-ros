SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "4a9b5606ccd7e7b59a30c8cc1f8e40b1"
SRC_URI[sha256sum] = "829bd59b6f60345c688031fbbd80a6f1f1b69d8033ebad2f7f3a5c499081f2b5"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "ros_tutorials"
