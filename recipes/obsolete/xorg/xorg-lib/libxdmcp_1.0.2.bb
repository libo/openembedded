require xorg-lib-common.inc
DESCRIPTION = "X Display Manager Control Protocol library"
DEPENDS += "xproto"
PE = "1"
PR = "${INC_PR}.0"

SRC_URI[archive.md5sum] = "10facf2bc7cbd5e5c1a698b8a210a582"
SRC_URI[archive.sha256sum] = "f3e50c1847599145c22784a2f15818821960652ee91d21d905817fb7c10f96a8"

BBCLASSEXTEND = "native nativesdk"

XORG_PN = "libXdmcp"
