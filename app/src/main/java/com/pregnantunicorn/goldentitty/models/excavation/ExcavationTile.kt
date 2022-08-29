package com.pregnantunicorn.goldentitty.models.excavation

import com.pregnantunicorn.goldentitty.models.graphics.BackgroundFactory

class ExcavationTile {

    private var background = BackgroundFactory().beach()

    private fun changeBackground() {

        background = BackgroundFactory().soil()

    }

    fun background() = background

    fun onClick() {

        changeBackground()
    }


}