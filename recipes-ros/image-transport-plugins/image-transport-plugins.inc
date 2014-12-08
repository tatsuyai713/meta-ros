SRC_URI = "https://github.com/ros-perception/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "6964c938ad6cb9c495fa086c28b4fee8"
SRC_URI[sha256sum] = "66300046c8136e0c789280a4774b6ffbad3d272f56e3491670bdc1d4ead6f1ad"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "image_transport_plugins"
