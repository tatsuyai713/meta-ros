SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "1b16dc9722c1cca8b540a22d03217a47"
SRC_URI[sha256sum] = "240293ceefd149585182380a9278127dc62983355fc28fecdc3f5bdda8c1521d"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "geometry_experimental"
