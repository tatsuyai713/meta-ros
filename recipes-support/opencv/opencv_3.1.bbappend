PACKAGECONFIG = "eigen jpeg png tiff gstreamer samples tbb \
                   ${@bb.utils.contains("DISTRO_FEATURES", "x11", "gtk", "", d)} \
                   ${@bb.utils.contains("LICENSE_FLAGS_WHITELIST", "commercial", "libav", "", d)}"

PNBLACKLIST[opencv] = ""
