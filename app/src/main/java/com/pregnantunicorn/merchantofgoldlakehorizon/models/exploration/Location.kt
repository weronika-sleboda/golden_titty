package com.pregnantunicorn.merchantofgoldlakehorizon.models.exploration

import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant

class Location(
    val name: String,
    private val iconAlgorithm: () -> Int,
    val info: String,
    private val requiredEnergy: Int,
    private val locationType: LocationType
)
{

    fun icon() = iconAlgorithm.invoke()

    private lateinit var treasure: Treasure
    fun treasure() = treasure

    fun requiredEnergyToString() = "$requiredEnergy"

    fun explore(): Boolean {

        generateNewTreasure()

        if(Merchant.energy().hasAmount(requiredEnergy)) {

            Merchant.energy().loseAmount(requiredEnergy)
            treasure.acquire.invoke()
            return true
        }

        return false
    }

    fun generateNewTreasure() {

        treasure = TreasureGenerator().generateTreasure(locationType)
    }
}