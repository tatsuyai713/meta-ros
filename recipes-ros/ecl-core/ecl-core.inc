SRC_URI = "https://github.com/stonier/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "773d8b9753ed68f0e534ad5ec23a2fda"
SRC_URI[sha256sum] = "8aa7c1dbc36d56e8386dcc486e36a3e430a7be58d0518dbd06a37ed113bd705e"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "ecl_core"
