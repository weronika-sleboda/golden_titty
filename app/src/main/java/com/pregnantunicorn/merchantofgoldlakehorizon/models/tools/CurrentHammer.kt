package com.pregnantunicorn.merchantofgoldlakehorizon.models.tools

object CurrentHammer {

    private var hammer = Tools.tools[Tools.CAVEMAN_HAMMER]
    fun hammer() = hammer

    fun changeHammer(hammerIndex: Int) {

        hammer = Tools.tools[hammerIndex]
    }

}