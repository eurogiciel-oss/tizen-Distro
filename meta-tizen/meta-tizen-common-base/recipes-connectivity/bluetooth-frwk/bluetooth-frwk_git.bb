require bluetooth-frwk.inc

PRIORITY = "10"

LIC_FILES_CHKSUM ??= "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI += "git://review.tizen.org/platform/core/connectivity/bluetooth-frwk;tag=32aa49269ade5764942d23a12e5cc99e81738a7b;nobranch=1"

BBCLASSEXTEND += " native "

