SUMMARY = "libreader for Octagon Model ${MACHINE}"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "CLOSED"
PACKAGE_ARCH = "${MACHINE_ARCH}"

RDEPENDS_${PN} = "libsdl"

COMPATIBLE_MACHINE = "^(sfx6008)$"

SRCDATE = "20220413"

PV = "${SRCDATE}"
PR = "r0"

SRC_URI = "http://define-sw.dyndns.tv/openatv/openpli/${MACHINE}-libreader-${SRCDATE}.tar.gz"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/libreader ${D}/${bindir}
}

do_package_qa() {
}

FILES_${PN}  = "${bindir}/libreader"

SRC_URI[md5sum] = "fcf1518e8c616d263708f060c2760d6f"
SRC_URI[sha256sum] = "23ca6e747b0731beb42b68f5d1c34dd9ea55fc320eeca7142a85a56b91661a64"
