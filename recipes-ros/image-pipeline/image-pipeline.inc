SRC_URI = "https://github.com/ros-perception/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "af3628ca8adaa73be854775c10ebe8a1"
SRC_URI[sha256sum] = "b69307689c7fb4e62464254fc24ede26c85087b51519f0b43a33e995dabe1a53"

SRC_URI += "file://0001-address-gcc6-build-error.patch;patchdir=.."
SRC_URI += "file://0002-explicitly-cast-to-std-vector-double-to-make-gcc6-ha.patch;patchdir=.."

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "image_pipeline"
