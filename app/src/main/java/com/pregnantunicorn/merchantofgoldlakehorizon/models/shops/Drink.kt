package com.pregnantunicorn.merchantofgoldlakehorizon.models.shops

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.models.player.Player

class Drink(
    val name: String,
    val icon: Int,
    val info: String,
    private val shopAlgorithm: () -> Unit
)
{
    private val price = 10

    fun buy(): Boolean {

        if(Player.goldCoins().hasAmount(price)) {

            Player.goldCoins().loseAmount(price)
            shopAlgorithm.invoke()

            CurrentMessage.changeMessage(
                "$name Acquired",
                icon,
                "$name has been acquired."
            )

            return true
        }

        CurrentMessage.changeMessage(
            "Too Expensive",
            R.drawable.gold_coin_64,
            "You don't have enough gold coins to make the purchase."
        )

        return false
    }
}