package com.pregnantunicorn.goldentitty.models.shops

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.message.CurrentMessage

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