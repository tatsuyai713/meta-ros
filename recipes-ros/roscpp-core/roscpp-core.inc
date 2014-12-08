SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "3b4a5224e884e729a49e797630952d46"
SRC_URI[sha256sum] = "6a14d05acc9a05173f5798f9e381ec0b858875b92ba2fa624d2435bf188eedc7"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "roscpp_core"
