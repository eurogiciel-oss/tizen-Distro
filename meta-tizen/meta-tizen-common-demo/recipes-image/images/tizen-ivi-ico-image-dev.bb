require recipes-image/images/tizen-ivi-ico-image.bb

DESCRIPTION = "A Tizen ivi image base on Tizen ivi with ico and \
               is suitable for development work."

IMAGE_FEATURES += "dev-pkgs tools-debug debug-tweaks ssh-server-openssh"
CORE_IMAGE_EXTRA_INSTALL += "packagegroup-tizen-dev-tools"