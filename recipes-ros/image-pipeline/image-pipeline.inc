SRC_URI = "https://github.com/ros-perception/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "0a5ebd5b9e16a0b45f3d9fad15136fb2"
SRC_URI[sha256sum] = "4d67b5bb6d181d789760081f2cff74e133b0460d9c05b8b5b3f0a207a3dacff7"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "image_pipeline"
