package com.pregnantunicorn.merchantofgoldlakehorizon.models.items

import com.pregnantunicorn.merchantofgoldlakehorizon.R

class ItemBackpack {

    companion object {

        const val LOVE_LETTER = 0
        const val GEMS = 1
    }

    val items = arrayOf(

        Item(
            "Love Letter",
            "???",
            R.drawable.scroll64,
            ItemType.LOVE_LETTER,
        ),

        Item(
            "GEMS",
            "???",
            R.drawable.gems64,
            ItemType.GEMS,
        )
    )
}