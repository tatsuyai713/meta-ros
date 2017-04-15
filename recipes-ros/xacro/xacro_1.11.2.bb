DESCRIPTION = "Xacro is an XML macro language."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslint"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "1f488621f0a8309056d8ae2bd68a5b4d"
SRC_URI[sha256sum] = "ab4548dc944b6545802c6aacbb53ddbba451bb48dd6cea93d23e46ebabc8ba07"

inherit catkin
