DESCRIPTION = "Contains transforms (e.g. differential drive inverse kinematics) for the various types of mobile robot platforms."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-build ecl-license ecl-errors ecl-geometry ecl-math ecl-formatters ecl-linear-algebra"

SRC_URI = "https://github.com/stonier/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "d65557c2143010e25c009d09c16c9dc8"
SRC_URI[sha256sum] = "624943550b0b82206706597af370c0588a9846edececae93dea10432c67954b8"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "ecl_navigation"
