SRC_URI = "https://github.com/ros-planning/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "b860620bb709dbd4125500dec0d9fa85"
SRC_URI[sha256sum] = "873dc11ea01431e927ce4eb09b5bcbd06b9d126732b019aa4d870979834ffdfa"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin ros-insane

ROS_SPN = "moveit"
