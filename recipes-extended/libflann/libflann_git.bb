DESCRIPTION = "a library for performing fast approximate nearest neighbor searches in high dimensional spaces"
AUTHOR = "Marius Muja and David G. Lowe"
HOMEPAGE = "http://www.cs.ubc.ca/~mariusm/index.php/FLANN/FLANN"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING;md5=395adad2339bd9ce5fef13d564a9681c"

SRC_URI = "git://github.com/mariusmuja/flann.git"
SRCREV = "7e58d18ee21e7fe33918c06ff4dee1515fd110d7"

S = "${WORKDIR}/git"

inherit cmake
