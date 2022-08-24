package com.pregnantunicorn.goldentitty.models.excavation

import com.pregnantunicorn.goldentitty.models.graphics.BackgroundFactory

class ExcavationTile {

    private var background = BackgroundFactory().beach()
    private var hasBeenClicked = false

    fun hasBeenClicked() = hasBeenClicked

    private fun changeBackground() {

        background = BackgroundFactory().woodenFloor()

    }

    fun background() = background

    fun onClick() {

        changeBackground()
        hasBeenClicked = true
    }
}