SUMMARY = "Basic Hello Cargo Example"
HOMEPAGE = "https://git.taservs.net/akloc/rust-yocto-examples"
LICENSE = "CLOSED"

inherit cargo

SRC_URI = "git://github.com/1kloc/rust-yocto-examples.git;protocol=git;branch=master"
S = "${WORKDIR}/git/"
CARGO_MANIFEST_PATH = "${S}/rust/example1/hello_cargo/Cargo.toml"
SRCREV = "${AUTOREV}"

