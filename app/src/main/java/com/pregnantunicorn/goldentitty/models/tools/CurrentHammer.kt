package com.pregnantunicorn.goldentitty.models.tools

object CurrentHammer {

    private var hammer = Tools.tools[Tools.CAVEMAN_HAMMER]
    fun hammer() = hammer

    fun changeHammer(hammerIndex: Int) {

        hammer = Tools.tools[hammerIndex]
    }

}