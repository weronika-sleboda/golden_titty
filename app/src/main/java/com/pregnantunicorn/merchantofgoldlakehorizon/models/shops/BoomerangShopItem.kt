package com.pregnantunicorn.merchantofgoldlakehorizon.models.shops

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.player.Player
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage


class BoomerangShopItem(
    val name: String,
    val icon: Int,
    val requiredAccuracy: String,
    val speed: String,
    val style: String,
    val hitAmount: String,
    val power: String,
    private val price: Int,
    private val algorithm: () -> Unit
)
{

    fun priceToString() = "Price: $price G"

    fun buy(): Boolean {

        CurrentMessage.changeMessage(
            "Too Expensive", R.drawable.gold_coin_64,
            "You don't have enough golden coins."
        )

        return false
    }
}