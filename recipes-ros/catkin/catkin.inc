DESCRIPTION = "Low-level build system macros and infrastructure for ROS"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake ${PYTHON_PN}-empy-native ${PYTHON_PN}-catkin-pkg-native"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "9fa68200ba615face09994c7842b8b4b"
SRC_URI[sha256sum] = "48ae4695b7424e3da896ae5794b013b635ca8fb8f122b77033bbb548d0e29ab5"

SRC_URI += "\
    file://0001-CATKIN_WORKSPACES-Don-t-require-.catkin-file.patch \
    file://0002-use-python-provided-by-environment-instead-of-the-ge.patch \
    file://0003-avoid-using-host-s-paths-when-cross-compiling.patch \
    file://0004-relocate-dependency-s-headers-to-current-sysroot.patch \
    ${@'file://0005-python.cmake-look-for-python3-first.patch' if d.getVar('PYTHON_PN', True) == 'python3' else ''} \
    "

inherit catkin

FILES_${PN}-dev += "\
    ${ros_datadir}/eigen/cmake \
    ${ros_datadir}/ros/cmake \
    ${ros_datadir}/.catkin \
    ${ros_prefix}/.catkin \
    ${ros_prefix}/.rosinstall \
    ${ros_prefix}/_setup_util.py \
    ${ros_prefix}/env.sh \
    ${ros_prefix}/setup.* \
    "

