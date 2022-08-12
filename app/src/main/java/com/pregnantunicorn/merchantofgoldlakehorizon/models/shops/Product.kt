package com.pregnantunicorn.merchantofgoldlakehorizon.models.shops

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Player
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage


class Product(
    val name: String,
    val icon: Int,
    private val price: Int,
    private val algorithm: () -> Unit
)
{

    fun priceToString() = "Price: $price G"

    fun buy(): Boolean {

        if(Player.goldCoins().hasAmount(price)) {

            Player.goldCoins().loseAmount(price)
            algorithm.invoke()

            CurrentMessage.changeMessage(
                "$name Acquired", icon,
                "$name has been acquired."
            )

            return true
        }

        CurrentMessage.changeMessage(
            "Too Expensive", R.drawable.golden_coin_64,
            "You don't have enough golden coins."
        )

        return false
    }
}