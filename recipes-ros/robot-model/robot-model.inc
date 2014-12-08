SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "76f969b9978e36a8fc9a21ff2228d901"
SRC_URI[sha256sum] = "763ce65cebbf2db0a30eacae5d1b6e84234da70352417f97ba49d96a8bb86c26"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "robot_model"
