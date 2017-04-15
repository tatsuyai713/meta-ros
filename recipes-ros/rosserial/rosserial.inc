SRC_URI = "https://github.com/ros-drivers/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c75ce886e36765d6c128c1123ff82efb"
SRC_URI[sha256sum] = "1eef7642859485d01d9665c17d7aded1c5d7c6320b884e4aba5d2d686c15029f"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "rosserial"
