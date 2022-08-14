package com.pregnantunicorn.merchantofgoldlakehorizon.models.player

class TittyCounter {

    private var tittyCounter = 0
    private var maxValue = 99

    fun tittyCounterToString() = "$tittyCounter/$maxValue"

    fun addTitty() {

        tittyCounter++

        if(tittyCounter > maxValue) {

            tittyCounter = maxValue
        }
    }
}