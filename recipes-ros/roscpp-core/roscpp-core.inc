SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "b10ee5d004174a027c2ea9bf6ee44a47"
SRC_URI[sha256sum] = "537b630ef6728166cccf3bbd46dce441bff07626ac0e4b48680d3ef20a8edbb6"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "roscpp_core"
