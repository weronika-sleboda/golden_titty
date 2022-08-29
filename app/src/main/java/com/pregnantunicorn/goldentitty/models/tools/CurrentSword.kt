package com.pregnantunicorn.goldentitty.models.tools

object CurrentSword {

    private var sword: Sword = Tools.tools()[Tools.BANDIT_SWORD] as Sword
    private var swordIndex = Tools.BANDIT_SWORD

    fun sword() = sword

    fun changeSword(swordIndex: Int) {

        this.swordIndex = swordIndex
        sword = Tools.tools()[swordIndex] as Sword
    }

    fun swordIndex() = swordIndex

    fun reset() {

        sword = Tools.tools()[Tools.BANDIT_SWORD] as Sword
        swordIndex = Tools.BANDIT_SWORD
    }

    fun load(swordIndex: Int) {

        this.swordIndex = swordIndex
        sword = Tools.tools()[swordIndex] as Sword
    }
}