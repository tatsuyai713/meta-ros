SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "769f9791758da2d5f57efc7ec8bf4634"
SRC_URI[sha256sum] = "dd8a6dec56e06bcc84582da4163efe22dcc4bf6badd6011ebb209db342c495a1"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "robot_model"
