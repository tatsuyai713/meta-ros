DESCRIPTION = "This package contains a class for converting from a 2D laser scan as defined by \
sensor_msgs/LaserScan into a point cloud as defined by sensor_msgs/PointCloud \
or sensor_msgs/PointCloud2."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles boost libeigen sensor-msgs roscpp tf"

SRC_URI = "https://github.com/ros-perception/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "5f027885e1721df441d7a08e8e77b114"
SRC_URI[sha256sum] = "ad00f2eac4314dcf94a3e2a77914c7097a822a5a04d776b4a69998535575370e"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
