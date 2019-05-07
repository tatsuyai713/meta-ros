DESCRIPTION = "FCL is a library for performing three types of proximity queries on a pair of geometric models composed of triangles and octrees."
HOMEPAGE = "https://github.com/flexible-collision-library/fcl"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5823baab4b8de52197d0fb775e8fd4b7"

# Octomap dependency not included as it is optional.
DEPENDS = "boost libccd octomap"

SRC_URI = "https://github.com/flexible-collision-library/fcl/archive/${PV}.tar.gz \
           file://0001-Add-configure-option-FCL_NO_DEFAULT_RPATH-203.patch \
          "
# \
#           file://0001-Add-configure-option-NO_DEFAULT_RPATH.patch \
#          "

SRC_URI[md5sum] = "09530a72b24f26bb79da8a2d85c738f8"
SRC_URI[sha256sum] = "8e6c19720e77024c1fbff5a912d81e8f28004208864607447bc90a31f18fb41a"

S = "${WORKDIR}/fcl-${PV}"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://LICENSE;subdir=fcl-${PV}"

EXTRA_OECMAKE += "-DCMAKE_BUILD_TYPE=Release -DFCL_NO_DEFAULT_RPATH=OFF"
FILES_${PN} += "${libdir}/libfcl.so"
FILES_${PN} += "/usr/lib/cmake/fcl"

# Need to override this, otherwise libfcl.so is included in dev packageW.
FILES_${PN}-dev = "${includedir} ${libdir}/pkgconfig"
FILES_${PN}-dev += "${libdir}/libfcl.so"

inherit pkgconfig cmake
