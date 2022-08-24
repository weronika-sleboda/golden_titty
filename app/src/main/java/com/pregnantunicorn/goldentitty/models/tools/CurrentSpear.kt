package com.pregnantunicorn.goldentitty.models.tools

object CurrentSpear {

    private var spear: Spear = Tools.tools()[Tools.BARBARIAN_SPEAR] as Spear
    fun spear() = spear

    fun changeSpear(spearIndex: Int) {

        spear = Tools.tools()[spearIndex] as Spear
    }

}