DESCRIPTION = "The OctoMap library implements a 3D occupancy grid mapping approach, providing data structures and mapping algorithms in C++."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=9b0e1f01a68f441eeaf7b5e18812d3c8"

SRC_URI = "https://github.com/OctoMap/${BPN}/archive/v${PV}.tar.gz;downloadfilename=${BP}.tar.gz \
           file://0001-Improve-the-generation-of-config.cmake-and-version.c.patch \
           "
SRC_URI[md5sum] = "9d1ead73e678fa2f51a70a933b0bf017"
SRC_URI[sha256sum] = "0019dfc4b32d63c1392aa264aed2253c1e0c2fb09216f8e2cc269bbfb8bb49b5"

S = "${WORKDIR}/${BP}/${BPN}"

EXTRA_OECMAKE += "\
    -DCMAKE_SKIP_RPATH=ON \
"

inherit cmake
