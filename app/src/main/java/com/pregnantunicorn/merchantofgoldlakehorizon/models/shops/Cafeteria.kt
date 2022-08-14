package com.pregnantunicorn.merchantofgoldlakehorizon.models.shops

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.player.Player

class Cafeteria {

    val drinks = arrayOf(

        Drink(
            "Cappuccino",
            R.drawable.cappuccino64,
            "Accuracy: +5",
        )
        {
            Player.cappuccino().addAmount(1)
        },

        Drink(
            "Smoothie",
            R.drawable.smoothie64,
            "Agility: +5",
        )
        {
            Player.smoothie().addAmount(1)
        },

        Drink(
            "Herbal Tea",
            R.drawable.herbal_tea64,
            "Stealth: +5",
        )
        {
            Player.herbalTea().addAmount(1)
        }
    )
}