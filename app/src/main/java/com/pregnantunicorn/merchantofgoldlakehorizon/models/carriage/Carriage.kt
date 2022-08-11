package com.pregnantunicorn.merchantofgoldlakehorizon.models.carriage

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant

class Carriage {

    fun carriageItems(): Array<CarriageItem> {

        val amount = 1

        return arrayOf(

            CarriageItem(
                "Dates",
                8,
                "Worth: 8G",
                R.drawable.dates64,
                { Merchant.dates().hasAmount(amount) },
                { Merchant.dates().loseAmount(amount)}
            ),

            CarriageItem(
                "Coconut",
                5,
                "Worth: 5G",
                R.drawable.coconut64,
                { Merchant.coconuts().hasAmount(amount) },
                { Merchant.coconuts().loseAmount(amount)}
            ),

            CarriageItem(
                "Peaches",
                7,
                "Worth: 7G",
                R.drawable.peach64,
                { Merchant.peaches().hasAmount(amount) },
                { Merchant.peaches().loseAmount(amount)}
            ),
        )
    }
}