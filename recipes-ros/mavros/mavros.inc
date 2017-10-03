SRC_URI = "https://github.com/mavlink/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "df3198f7c1a1fcf4f6f0eb2bea4cd450"
SRC_URI[sha256sum] = "a1757a0f1153d2587d87b50e482b3d1ef6e33bfeda046d43e104a1ef795908ad"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "mavros"
