DESCRIPTION = "This package retrieves data from url-format files such as \
http://, ftp://, package:// file://, etc., and loads the data into memory."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "curl rosconsole roslib"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "eea17a2142d9c404ec1e485a72ce5218"
SRC_URI[sha256sum] = "f5d74cc075c8535d3f2e2b9fedd3915d8abcf42a58171b2a27f2ddf4151bd652"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin

RDEPENDS_${PN} = "${PYTHON_PN}-rospkg"
