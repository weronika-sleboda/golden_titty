package com.pregnantunicorn.merchantofgoldlakehorizon.models.clothing

import com.pregnantunicorn.merchantofgoldlakehorizon.R

object CurrentRobeManager {

    const val MERCHANT_ROBE = 0
    const val GOLDEN_ROBE = 1
    const val COMMONER_ROBE = 2
    const val ARMY_ROBE = 3

    private val robeManagers = arrayOf(

        RobeManager(
           "Merchant Robe",
            "Entering all doors costs equally 5 charisma points.",
            R.drawable.green_robe128,
            1500,
            RobeFactory.MERCHANT_ROBE
        ),

        RobeManager(
            "Golden Robe",
            "Entering Clothing Shop Doors costs only 1 charisma point.",
            R.drawable.golden_robe128,
            900,
            RobeFactory.GOLDEN_ROBE
        ),

        RobeManager(
            "Commoner Robe",
            "Entering Camp costs only 1 charisma point.",
            R.drawable.brown_robe128,
            500,
            RobeFactory.COMMONER_ROBE
        ),

        RobeManager(
            "Army Robe",
            "Entering Arena costs only 1 charisma point.",
            R.drawable.black_robe128,
            1100,
            RobeFactory.ARMY_ROBE
        )

    )

    private var robeManager = robeManagers[MERCHANT_ROBE]
    fun robeManager() = robeManager

    fun changeRobe(robeManagerIndex: Int) {

        robeManager = robeManagers[robeManagerIndex]
    }
}