package com.pregnantunicorn.merchantofgoldlakehorizon.models.clothing

import com.pregnantunicorn.merchantofgoldlakehorizon.models.dialog_messages.DialogMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant

class RobeManager(
    val name: String,
    val info: String,
    val icon: Int,
    private val price: Int,
    private val robeIndex: Int
)
{
    fun priceToString() = "$price"

    private var alreadyBought = false
    fun alreadyBought() = alreadyBought

    fun dialogMessage(): DialogMessage {

        return DialogMessage(
            "$name acquired",
            icon,
            "$name has been added to your backpack."
        )
    }

    fun buy(): Boolean {

        if(Merchant.goldenCoins().hasAmount(price)) {

            Merchant.goldenCoins().loseAmount(price)
            RobeFactory.robes[robeIndex].putInBackpack()
            alreadyBought = true
            return true
        }

        return false
    }
}