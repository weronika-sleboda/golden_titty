package com.pregnantunicorn.goldentitty.models.tools

object CurrentSpear {

    private var spear: Spear = Tools.tools()[Tools.BARBARIAN_SPEAR] as Spear
    private var spearIndex = Tools.BARBARIAN_SPEAR

    fun spear() = spear

    fun changeSpear(spearIndex: Int) {

        this.spearIndex = spearIndex
        spear = Tools.tools()[spearIndex] as Spear
    }

    fun spearIndex() = spearIndex

    fun reset() {

        spear = Tools.tools()[Tools.BARBARIAN_SPEAR] as Spear
        spearIndex = Tools.BARBARIAN_SPEAR
    }

    fun load(spearIndex: Int) {

        this.spearIndex = spearIndex
        spear = Tools.tools()[spearIndex] as Spear
    }
}