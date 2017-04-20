SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "5deada7f4b6715cc58f02d08c57f97bf"
SRC_URI[sha256sum] = "e1c92e638fa48abbea88d26727e4f9985ba3a1e2fe7b04dd042500aeb7e9a973"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "collada_urdf"
