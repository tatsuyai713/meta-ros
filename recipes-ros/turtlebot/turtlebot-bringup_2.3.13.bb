DESCRIPTION = "turtlebot_bringup provides roslaunch scripts for starting the TurtleBot base functionality."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "urdf xacro"

require turtlebot.inc

RDEPENDS_${PN} = "realsense-camera astra-launch zeroconf-avahi yocs-cmd-vel-mux \
  kobuki-capabilities kobuki-node kobuki-bumper2pc kobuki-safety-controller \
  create-node turtlebot-capabilities turtlebot-description robot-state-publisher \
  robot-pose-ekf diagnostic-aggregator openni2-launch freenect-launch laptop-battery-monitor \
  rocon-app-manager rocon-bubble-icons depthimage-to-laserscan"
