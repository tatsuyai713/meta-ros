SRC_URI = "https://github.com/ros-controls/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "40b93a87f67cc4bb2369aec192056685"
SRC_URI[sha256sum] = "08bef43e6312986fb4de433f5b7c3e96d5456b2c082433fef180634c4d3c0254"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "ros_control"
