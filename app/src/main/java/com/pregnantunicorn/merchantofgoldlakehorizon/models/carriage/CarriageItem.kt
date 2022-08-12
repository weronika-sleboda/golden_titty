package com.pregnantunicorn.merchantofgoldlakehorizon.models.carriage

import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Player
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage

class CarriageItem(
    val name: String,
    private val worth: Int,
    val worthToString: String,
    val icon: Int,
    private val hasAmount: () -> Boolean,
    private val sellAlgorithm: () -> Unit
)
{
    fun sell(): Boolean {

        if(hasAmount.invoke()) {

            sellAlgorithm.invoke()
            Player.goldCoins().addAmount(worth)
            return true
        }

        CurrentMessage.changeMessage(
            "No $name",
            icon,
            "You don't have any of these."
        )

        return false
    }
}