DESCRIPTION = "This package contains generic definitions of geometric shapes and bodies."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "boost shape-msgs octomap assimp libeigen qhull console-bridge random-numbers eigen-stl-containers resource-retriever visualization-msgs"

SRC_URI = "https://github.com/ros-planning/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "112227a462f698a2995ee58a5427e70f"
SRC_URI[sha256sum] = "545b5fac4a6cd705610d5384422a75481250446bd4edd35972e5424bb9386b28"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
