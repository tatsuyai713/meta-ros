SRC_URI = "https://github.com/ros-planning/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "fe6eb96a5590e5ac86ea45bb73812454"
SRC_URI[sha256sum] = "068d47ad964abd14477611ab3065c166c878fd005318970592b8a3e9e964578f"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin ros-insane

ROS_SPN = "moveit"
