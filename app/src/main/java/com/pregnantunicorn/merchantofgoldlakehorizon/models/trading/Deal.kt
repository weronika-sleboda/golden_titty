package com.pregnantunicorn.merchantofgoldlakehorizon.models.trading

import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.Message
import kotlin.random.Random

abstract class Deal(
    val icon: Int,
    val name: String,
    protected var demand: Int = 5 + Random.nextInt(20),
    protected var reward: Int = 5 + Random.nextInt(10)
)
{
    fun demandToString() = "Demand: $demand Units"
    fun rewardToString() = "Reward: $reward G"

    abstract fun sell(): Boolean
}