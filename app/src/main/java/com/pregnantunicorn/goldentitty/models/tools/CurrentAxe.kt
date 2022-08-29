package com.pregnantunicorn.goldentitty.models.tools

object CurrentAxe {

    private var axe = Tools.tools()[Tools.DWARF_AXE] as Axe
    private var axeIndex = Tools.DWARF_AXE
    fun axe() = axe

    fun changeAxe(axeIndex: Int) {

        axe = Tools.tools()[axeIndex] as Axe
    }

    fun reset() {

        axe = Tools.tools()[Tools.DWARF_AXE] as Axe
        axeIndex = Tools.DWARF_AXE
    }

    fun load(axeIndex: Int) {

        this.axeIndex = axeIndex
        axe = Tools.tools()[axeIndex] as Axe
    }

    fun axeIndex() = axeIndex
}