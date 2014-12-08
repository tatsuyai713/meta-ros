DESCRIPTION = "This package contains generic definitions of geometric shapes and bodies."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "boost shape-msgs shape-tools octomap assimp libeigen qhull console-bridge random-numbers eigen-stl-containers resource-retriever"

SRC_URI = "https://github.com/ros-planning/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "cf95ee21245e3bc11a84c42d314f83e4"
SRC_URI[sha256sum] = "e0f8eb1bd5e7e9097606c1556cfd1e7321881ee6c9766a409549b0fa921b613e"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
