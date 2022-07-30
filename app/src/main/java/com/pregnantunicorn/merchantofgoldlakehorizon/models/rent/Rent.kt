package com.pregnantunicorn.merchantofgoldlakehorizon.models.rent

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.Message
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage

class Rent {

    private val price = 50
    fun rentInfo() = "Rent"
    fun priceToString() = "$price"

    fun payRent(): Boolean {

        if(Merchant.goldenCoins().hasAmount(price)) {

            Merchant.goldenCoins().loseAmount(price)
            return true
        }

        CurrentMessage.changeMessage(
            "You're broke",
            R.drawable.broke64,
            "You don't have enough golden coins to pay the rent."
        )

        return false
    }
}