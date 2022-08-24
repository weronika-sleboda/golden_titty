package com.pregnantunicorn.goldentitty.models.temple

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.key_items.KeyItemType

object TempleFloors {

    val floors = arrayOf(

        TempleFloor(
            "First Floor",
            KeyItemType.FIRST_FLOOR_KEY,
            KeyItemType.EMERALD,
            R.drawable.emerald64,
        "Emerald"
        ),

        TempleFloor(
            "Second Floor",
            KeyItemType.SECOND_FLOOR_KEY,
            KeyItemType.SAPPHIRE,
            R.drawable.sapphire64,
            "Sapphire"
        ),

        TempleFloor(
            "Second Floor",
            KeyItemType.THIRD_FLOOR_KEY,
            KeyItemType.RUBY,
            R.drawable.ruby64,
            "Ruby"
        ),
    )
}