SRC_URI = "https://github.com/sniekum/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "3e4db3af43daa1c3fbe166d68f2abc62"
SRC_URI[sha256sum] = "66978186dacec3bbfd758af293f475505b3e5589d6c10b8528a5c17cea6523b1"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "ar_track_alvar"
