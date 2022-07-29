package com.pregnantunicorn.merchantofgoldlakehorizon.models.investigation

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory

class ClosetDescription(
    private val newName: String,
    private val newIcon: () -> Int,
    private val newInfo: String,
) : ObjectDescription(
    "Closet",
    { IconFactory().closet128() },
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

        name = "Closet"
        icon = { IconFactory().bed128() }
        info = "There is nothing of value here..."
    }
}