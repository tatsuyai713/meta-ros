DESCRIPTION = "Xacro is an XML macro language."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslint"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "e5198dc634ffed22b56774dc42e1e5ae"
SRC_URI[sha256sum] = "42ab8ca7d15566664a3b2df4185cf119366ee4f96e19ae48d0e79362790f35a6"

inherit catkin
