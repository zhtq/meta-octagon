SRCDATE = "20220328"

require octagon-libs.inc

SRC_URI_append = " \
    file://libjpeg.so.8.2.2 \
"

do_install_append() {
    install -d ${D}${libdir}
    install -m 0755 ${WORKDIR}/libjpeg.so.8.2.2 ${D}${libdir}/
    ln -s libjpeg.so.8.2.2 ${D}${libdir}/libjpeg.so.8
}


SRC_URI[md5sum] = "dc5b604fe85604d8efa9c18d9d7c6332"
SRC_URI[sha256sum] = "d41044cbd6e408614d0eae67e3481ace16e9f832d4b426c3d6e28ef4c7001a2d"
