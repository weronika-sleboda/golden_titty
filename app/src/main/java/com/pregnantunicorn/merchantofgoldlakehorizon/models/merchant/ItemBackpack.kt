package com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant

import com.pregnantunicorn.merchantofgoldlakehorizon.R

class ItemBackpack {

    companion object {

        const val FEATHER = 0
        const val WOOD = 1
        const val SPICES = 2
        const val STONES = 3
        const val IRON = 4
        const val GEMS =5
    }

    val items = arrayOf(
        Item("Feather", R.drawable.feather64),
        Item("Wood", R.drawable.wood64),
        Item("Spices", R.drawable.spices64),
        Item("Stones", R.drawable.stones64),
        Item("Iron", R.drawable.iron64),
        Item("Gems", R.drawable.gems64)
    )
}