package com.pregnantunicorn.goldentitty.models.tools

object CurrentHammer {

    private var hammer = Tools.tools()[Tools.CAVEMAN_HAMMER] as Hammer
    private var hammerIndex = Tools.CAVEMAN_HAMMER

    fun hammer() = hammer

    fun changeHammer(hammerIndex: Int) {

        this.hammerIndex = hammerIndex
        hammer = Tools.tools()[hammerIndex] as Hammer
    }

    fun reset() {

        hammer = Tools.tools()[Tools.CAVEMAN_HAMMER] as Hammer
        hammerIndex = Tools.CAVEMAN_HAMMER
    }

    fun hammerIndex() = hammerIndex

    fun load(hammerIndex: Int) {

        this.hammerIndex = hammerIndex
        hammer = Tools.tools()[hammerIndex] as Hammer
    }

}