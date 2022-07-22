package com.pregnantunicorn.merchantofgoldlakehorizon.models.exploration

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant

class Cave {

    val name = "Goldlake Cave"
    val info = "This is the place where you can gather gems. " +
            "You can find emerald at morning, sapphire at sunset and ruby at night."

    private val requiredEnergy = 1

    fun icon() = IconFactory().cave128()

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

        treasure = TreasureGenerator().generateTreasure()
    }
}