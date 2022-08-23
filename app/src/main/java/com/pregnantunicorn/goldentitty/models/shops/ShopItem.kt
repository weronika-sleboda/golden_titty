package com.pregnantunicorn.goldentitty.models.shops

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.message.CurrentMessage


class ShopItem(
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