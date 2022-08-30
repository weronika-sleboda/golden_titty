package com.pregnantunicorn.goldentitty.models.excavation

import com.pregnantunicorn.goldentitty.R

class ExcavationTile {

    private var background = R.drawable.beach_morning

    private fun changeBackground() {

        background = R.drawable.soil_morning

    }

    fun background() = background

    fun onClick() {

        changeBackground()
    }


}