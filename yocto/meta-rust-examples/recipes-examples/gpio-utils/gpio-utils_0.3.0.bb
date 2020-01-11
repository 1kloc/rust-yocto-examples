inherit cargo

SUMMARY = "GPIO Utilities"
HOMEPAGE = "git://github.com/rust-embedded/gpio-utils"
LICENSE = "MIT"

SRC_URI = "git://github.com/rust-embedded/gpio-utils.git;protocol=https;tag=${PV}"
S = "${WORKDIR}/git"

SRC_URI[md5sum] = "575c8c7893b50e225ced4a8fd870400c"
SRC_URI[sha256sum] = "bab235f1247020c870601704624f78d5181c3f8c4597d3a9504d2096a50b8d0f"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=935a9b2a57ae70704d8125b9c0e39059"
