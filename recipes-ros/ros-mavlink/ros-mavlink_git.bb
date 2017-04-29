DESCRIPTION = "MAVLink message marshaling library"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=54ad3cbe91bebcf6b1823970ff1fb97f"

SRC_URI = "git://github.com/mavlink/mavlink-gbp-release.git;branch=release/kinetic/mavlink"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

DEPENDS = "python3-setuptools-native python3-future-native"

inherit catkin

SRC_URI += "\
  file://0001-do-not-require-python2.patch \
  file://0001-provide-path-to-find-mavgen_c.patch \
"
