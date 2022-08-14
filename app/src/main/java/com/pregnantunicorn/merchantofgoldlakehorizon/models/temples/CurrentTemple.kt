package com.pregnantunicorn.merchantofgoldlakehorizon.models.temples

object CurrentTemple {

    private var templeName: TempleName = TempleName.LATTER_DAY_VAGINA_RAPTURE

    fun templeName(): String {

        return when(templeName) {

            TempleName.LATTER_DAY_VAGINA_RAPTURE -> "Temple Of Latter Day Vagina Rapture"
            TempleName.TITTIES_AND_LEGS -> "Temple Of Titties And Legs"
            TempleName.END_TIMES_TWERK -> "Temple Of End Times Twerk"
            TempleName.GRAND_BOOTY -> "Temple Of Grand Booty"
            TempleName.HOLY_NIPPLE_REVIVAL -> "Temple Of Holy Nipple Revival"
            TempleName.MONOTITTEISM -> "Temple Of Monotitteism"
            TempleName.PUSSYCAT_PROPHET -> "Temple of Pussycat Prophet"
        }
    }

    fun changeTempleName(templeName: TempleName) {

        this.templeName = templeName
    }
}