DESCRIPTION = "vuplus-images addons panel"
LICENSE = "CLOSED"
PR = "r2.9"
SRC_URI = "git://github.com/linuxbox10/Addons-Panel.git"
S = "${WORKDIR}/git"
SRCREV = "master"
DEPENDS = "python-html"
inherit gitpkgv allarch

FILES_${PN} = "/usr/lib/enigma2/python/Plugins/Extensions/VuPlusImagesCoUk"

do_install () {
	install -d ${D}/usr/lib/enigma2/python/Plugins/Extensions/VuPlusImagesCoUk
	cp -r ${S}/${SETTINGS_FILENAME}/* ${D}/usr/lib/enigma2/python/Plugins/Extensions/VuPlusImagesCoUk
}
