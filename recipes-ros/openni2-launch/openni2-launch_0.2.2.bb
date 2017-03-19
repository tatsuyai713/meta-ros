DESCRIPTION = "Launch files to start the openni2_camera drivers using rgbd_launch."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rgbd-launch depth-image-proc image-proc nodelet openni2-camera tf"

SRC_URI = "https://github.com/ros-drivers/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "566b4a51d0d11522d7528ca437c42b0f"
SRC_URI[sha256sum] = "3e124b474c0c0da419366fa21a101874cc7e4c83b352a2da5a21e1967c68555f"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
