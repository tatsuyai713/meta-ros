SRC_URI = "https://github.com/ros-perception/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "2831b2795917f715f668208d9e5beca2"
SRC_URI[sha256sum] = "3e7370d401bb29e6d7360eeca92183211385fb5b0a6eebdbc76a5d5c891e4f41"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "image_pipeline"
