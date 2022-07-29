package com.pregnantunicorn.merchantofgoldlakehorizon.models.investigation

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory

class CupboardDescription(
    private val newName: String,
    private val newIcon: () -> Int,
    private val newInfo: String,
) : ObjectDescription(
    "Cupboard",
    { IconFactory().bed128() },
    "Here you can find all kind of items, from key items to golden coins and food."
)
{
    override fun changeDescription() {

        name = newName
        icon = newIcon
        info = newInfo
        buttonText = "Take"
    }

    override fun changeInfo() {

        name = "Cupboard"
        icon = { IconFactory().cupboard128() }
        info = "There is nothing of value here..."
    }

}