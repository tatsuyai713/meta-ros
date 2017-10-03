SRC_URI = "https://github.com/sniekum/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "6cb875b80d51f9a26eb05db7f9779011"
SRC_URI[sha256sum] = "395408a3dc9c3db2b5c200b8722a13a60898c861633b99e6e250186adffd1370"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "ar_track_alvar"
