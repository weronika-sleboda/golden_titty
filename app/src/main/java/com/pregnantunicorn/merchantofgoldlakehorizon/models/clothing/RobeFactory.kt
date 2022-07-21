package com.pregnantunicorn.merchantofgoldlakehorizon.models.clothing

import com.pregnantunicorn.merchantofgoldlakehorizon.R

object RobeFactory {

    const val DIVINE_ROBE = 0
    const val ARMY_ROBE = 1
    const val MERCHANT_ROBE = 2
    const val GOLDEN_ROBE = 3
    const val HERETIC_ROBE = 4
    const val COMMONER_ROBE = 5

    val robes = arrayOf(

        Robe(
            "Divine Robe",
            R.drawable.white_robe64,
            "Divine Temple Door",
            "Charisma Cost: 1",
            "Divine Look",
            "Entering through Divine Temple Door requires now only 1 charisma point.",
            R.drawable.sonny64_white,
            1,
            owns = true,
            wears = true
        ),


        Robe(
            "Army Robe",
            R.drawable.black_robe64,
            "Arena Gate",
            "Charisma Cost: 1",
            "Soldier Look",
            "Entering through Arena Gate requires now only 1 charisma point.",
            R.drawable.sonny64_black,
            1
        ),

        Robe(
            "Merchant Robe",
            R.drawable.green_robe64,
            "All Doors",
            "Charisma Cost: 5",
            "Merchant Look",
            "Entering through all doors requires now equally 5 charisma points.",
            R.drawable.sonny64_green,
            1
        ),

        Robe(
            "Golden Robe",
            R.drawable.golden_robe64,
            "Clothing Shop Doors",
            "Charisma Cost: 1",
            "Bourgeois Look",
            "Entering through Clothing Shop Doors requires now only 1 charisma point.",
            R.drawable.sonny64_golden,
            1
        ),

        Robe(
            "Heretic Robe",
            R.drawable.red_robe64,
            "Shadow Temple Door",
            "Charisma Cost: 1",
            "Heretic Look",
            "Entering through Shadow Temple Door requires now only 1 charisma point.",
            R.drawable.sonny64_red,
            1
        ),

        Robe(
            "Commoner Robe",
            R.drawable.brown_robe64,
            "Camp Entrance",
            "Charisma Cost: 1",
            "Commoner Look",
            "Entering through Camp Entrance requires now only 1 charisma point.",
            R.drawable.sonny64_brown,
            1
        ),
    )

}