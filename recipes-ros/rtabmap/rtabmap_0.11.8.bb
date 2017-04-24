DESCRIPTION = "RTAB-Map's standalone library. RTAB-Map is a RGB-D SLAM approach with real-time constraints."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "pcl sqlite3 zlib libfreenect cv-bridge octomap"

SRC_URI = "https://github.com/introlab/rtabmap/archive/${PV}.tar.gz;downloadfilename=rtabmap-${PV}.tar.gz"
SRC_URI[md5sum] = "9e554cd1a9647ef7afa1b72ced106f59"
SRC_URI[sha256sum] = "6b137b96c8243f72c0feccda4999a82bcf1d16283de1e8b57ebbeec861fdb636"

inherit cmake

EXTRA_OECMAKE += "-DWITH_QT=OFF"

CXXFLAGS_append = " -Wno-deprecated-declarations "
