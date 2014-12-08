SRC_URI = "https://github.com/ros-controls/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "e7ff7700561d1af2855a5b18eabbeec2"
SRC_URI[sha256sum] = "a39fe02d45b83ddeeb98f04bbce00af4194706e6f1ec95a660def55b10ccbba6"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "ros_controllers"
