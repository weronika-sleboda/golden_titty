package com.pregnantunicorn.merchantofgoldlakehorizon.models.trading_house

import com.pregnantunicorn.merchantofgoldlakehorizon.models.dialog_messages.DialogMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.GemUpdateType
import kotlin.random.Random

abstract class Deal(
    val icon: Int,
    val name: String,
    protected var demand: Int = 5 + Random.nextInt(30),
    protected var reward: Int = 5 + Random.nextInt(30)
)
{
    fun demandToString() = "Demand: $demand Units"
    fun rewardToString() = "Reward: $reward G"

    abstract fun dialogMessage(): DialogMessage
    abstract fun sell(): Boolean
}