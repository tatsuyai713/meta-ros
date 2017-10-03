SRC_URI = "https://github.com/mavlink/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c571577b355f0b7203fed3857c552604"
SRC_URI[sha256sum] = "53af1f58b9b5961310b48a765ff435f7ea706cd4c0deb5fb1e1f5cc1166a6ace"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "mavros"
