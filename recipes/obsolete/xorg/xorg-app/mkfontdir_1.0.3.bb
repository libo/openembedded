require xorg-app-common.inc
DESCRIPTION = "a program to create an index of X font files in a directory"
RDEPENDS_${PN} += "mkfontscale"
PE = "1"
PR = "${INC_PR}.1"

SRC_URI[archive.md5sum] = "4d0f89a23f77e22f1671a77bf0898955"
SRC_URI[archive.sha256sum] = "2a786e03611a53c7f6263db446c0c9ef76e94bcf930b0b5867cc6a9c19653074"

BBCLASSEXTEND = "native"
