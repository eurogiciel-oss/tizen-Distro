require libdevice-node.inc

PRIORITY = "10"

LIC_FILES_CHKSUM ??= "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI += "git://review.tizen.org/platform/core/system/libdevice-node;tag=d65efaf311abaf22ffd0d9bc22c28182e003304a;nobranch=1"

BBCLASSEXTEND += " native "

