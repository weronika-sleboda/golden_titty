package com.pregnantunicorn.goldentitty.models.tools

object CurrentSword {

    private var sword: Sword = Tools.tools()[Tools.BANDIT_SWORD] as Sword
    fun sword() = sword

    fun changeSword(swordIndex: Int) {

        sword = Tools.tools()[swordIndex] as Sword
    }

}