package com.pregnantunicorn.merchantofgoldlakehorizon.models.investigation

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.items.ItemBackpack
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant

object CurrentInvestigation {

    const val DRAGON_INN_CHEST_MORNING = 0
    const val DRAGON_INN_CHEST_SUNSET = 0
    const val DRAGON_INN_CHEST_NIGHT = 0

    private val investigations = arrayOf(

        InvestigationObject(
            10,
            ObjectDescription(
                "Chest",
                { IconFactory().ironChest128() },
                "There are mostly tools in it.",
                "Gold Coins",
                { IconFactory().goldenCoin128() },
                "There are 5 gold coins lying in the chest."
            ),
        ) { Merchant.goldenCoins().addAmount(5) },

        InvestigationObject(
            10,
            ObjectDescription(
                "Chest",
                { IconFactory().ironChest128() },
                "There are mostly tools in it.",
                "Gold Coins",
                { IconFactory().goldenCoin128() },
                "There are 5 gold coins lying in the chest."
            ),
        ) { Merchant.goldenCoins().addAmount(5) },

        InvestigationObject(
            10,
            ObjectDescription(
                "Chest",
                { IconFactory().ironChest64() },
                "There are mostly tools in it.",
                "Dragon Inn Bedroom Key",
                { R.drawable.di_bedroom_key128 },
                "There is a key lying in the chest."
            ),
        ) {  },
    )

    private var investigationObject: InvestigationObject = investigations[DRAGON_INN_CHEST_MORNING]
    fun investigationObject() = investigationObject

    fun changeInvestigation(investigationIndex: Int) {

        investigationObject = investigations[investigationIndex]
    }
}