package com.pregnantunicorn.merchantofgoldlakehorizon.models.tools

object CurrentAxe {

    private var axe = Tools.tools[Tools.DWARF_AXE]
    fun axe() = axe

    fun changeAxe(axeIndex: Int) {

        axe = Tools.tools[axeIndex]
    }
}