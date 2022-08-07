package com.pregnantunicorn.merchantofgoldlakehorizon.models.items

import com.pregnantunicorn.merchantofgoldlakehorizon.R

class ItemBackpack {

    companion object {

        const val DI_BEDROOM_KEY = 0
    }

    val items = arrayOf(

        Item(
            "Dragon Tavern Bedroom Key",
            R.drawable.di_bedroom_key64,
            ItemType.DI_BEDROOM_KEY,
        )
    )
}