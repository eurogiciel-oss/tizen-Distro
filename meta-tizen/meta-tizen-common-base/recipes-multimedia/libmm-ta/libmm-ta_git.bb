require libmm-ta.inc

PRIORITY = "10"

LIC_FILES_CHKSUM ??= "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI += "git://review.tizen.org/platform/core/multimedia/libmm-ta;tag=d4cf22487676cd686fc7344972b52a8e045525f9;nobranch=1"

BBCLASSEXTEND += " native "

