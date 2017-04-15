SRC_URI = "https://github.com/RobotWebTools/rosbridge_suite/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "87e5d3b5e160aa8e2912e73583482b59"
SRC_URI[sha256sum] = "f9786de015276d6d58c023ad6a6a24acb6291796f8f61151adc6b585bd43d961"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "rosbridge_suite"
