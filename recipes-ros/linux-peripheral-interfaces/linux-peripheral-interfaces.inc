SRC_URI = "https://github.com/ros-drivers/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "978e9da151e23904a75ae45d6494eb25"
SRC_URI[sha256sum] = "90393c788367cb9bed266d2207d7788280fd84244be00c5e17459a691394deb2"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "linux_peripheral_interfaces"
