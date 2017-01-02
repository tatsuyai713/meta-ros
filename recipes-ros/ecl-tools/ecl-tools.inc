SRC_URI = "https://github.com/stonier/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "bf3ea6895dc6d1a6d783d7662ba25191"
SRC_URI[sha256sum] = "c06ad89bba440030114953f989c2693e9fcccc6382d554d74574a6c2398c3cbd"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "ecl_tools"
