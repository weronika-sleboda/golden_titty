package com.pregnantunicorn.merchantofgoldlakehorizon.models.customers

import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant

class Deal(
    val icon: Int,
    val name: String,
    val demand: Int,
    val reward: Int,
    private val itemIndex: Int
)
{

    fun takeReward(amount: Int) {

        Merchant.goldenCoins().addAmount(amount)
    }

    fun giveAwayItems(amount: Int) {

        Merchant.items()[itemIndex].loseAmount(amount)
    }

    fun meetsDemand(amount: Int) = Merchant.items()[itemIndex].hasAmount(amount)
}