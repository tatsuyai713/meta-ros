SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "3d574e3c007ab3b1da354cee8215d2ff"
SRC_URI[sha256sum] = "d28c8ce2d91e9fedc643d43a349b1e2b64a39efddf8e9bf72b2496fd6a06d0f6"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "collada_urdf"
