package com.pregnantunicorn.merchantofgoldlakehorizon.models.investigation

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.items.ItemBackpack
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant

object CurrentInvestigation {

    const val DRAGON_INN_CHEST = 0

    private val investigations = arrayOf(

        InvestigationObject(
            10,
            ObjectDescription(
                "Chest",
                { IconFactory().goldenCoin128() },
                "There are mostly tools in it.",
                "Gold Coins",
                { IconFactory().goldenCoin128() },
                "There are 5 gold coins lying in the chest."
            ),
        ) { Merchant.goldenCoins().addAmount(5) },
    )

    private var investigationObject: InvestigationObject = investigations[DRAGON_INN_CHEST]
    fun investigationObject() = investigationObject

    fun changeInvestigation(investigationIndex: Int) {

        investigationObject = investigations[investigationIndex]
    }
}