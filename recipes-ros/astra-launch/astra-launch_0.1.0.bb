DESCRIPTION = "Drivers for Orbbec Astra Devices."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

SRC_URI = "https://github.com/tfoote/ros_astra_launch/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "2bd63c01f909baba3a4b0737ae5e55dd"
SRC_URI[sha256sum] = "c653fa7c0eed41d85afd20dc08cec0474d191ed4afe4d90b7e38ff784b310501"

S = "${WORKDIR}/ros_astra_launch"

inherit catkin

RDEPENDS_${PN} = "rgbd-launch depth-image-proc image-proc nodelet astra-camera tf"
