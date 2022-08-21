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



        CurrentMessage.changeMessage(
            "Too Expensive",
            R.drawable.gold_coin_64,
            "You don't have enough gold coins to make the purchase."
        )

        return false
    }
}