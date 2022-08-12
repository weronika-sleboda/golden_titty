package com.pregnantunicorn.merchantofgoldlakehorizon.models.carriage

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Player

class Carriage {

    fun carriageItems(): Array<CarriageItem> {

        val amount = 1

        return arrayOf(

            CarriageItem(
                "Dates",
                9,
                "We pay 9G for a unit",
                R.drawable.dates64,
                { Player.dates().hasAmount(amount) },
                { Player.dates().loseAmount(amount)}
            ),

            CarriageItem(
                "Coconut",
                7,
                "We pay 7G for a unit",
                R.drawable.coconut64,
                { Player.coconuts().hasAmount(amount) },
                { Player.coconuts().loseAmount(amount)}
            ),

            CarriageItem(
                "Peaches",
                5,
                "We pay 5G for a unit",
                R.drawable.peach64,
                { Player.peaches().hasAmount(amount) },
                { Player.peaches().loseAmount(amount)}
            ),
        )
    }
}