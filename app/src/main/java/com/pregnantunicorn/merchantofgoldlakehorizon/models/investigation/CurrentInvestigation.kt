package com.pregnantunicorn.merchantofgoldlakehorizon.models.investigation

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.items.ItemBackpack
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant

object CurrentInvestigation {

    const val KHANS_BED = 0
    const val ERICAS_BED = 1
    const val JINS_BED = 2
    const val JORDANS_BED = 3
    const val NIKITAS_BED = 4
    const val PASHAS_BED = 5
    const val SONNYS_BED = 6
    const val KHANS_CLOSET = 7
    const val ERICAS_CLOSET = 8
    const val JINS_CLOSET = 9
    const val JORDANS_CLOSET = 10
    const val NIKITAS_CLOSET = 11
    const val PASHAS_CLOSET = 12
    const val SONNYS_CLOSET = 13
    const val KHANS_CUPBOARD = 14
    const val ERICAS_CUPBOARD = 15
    const val JINS_CUPBOARD = 16
    const val JORDANS_CUPBOARD = 17
    const val NIKITAS_CUPBOARD = 18
    const val PASHAS_CUPBOARD = 19
    const val SONNYS_CUPBOARD = 20
    const val KHANS_TABLE = 21
    const val ERICAS_TABLE = 22
    const val JINS_TABLE = 23
    const val JORDANS_TABLE = 24
    const val NIKITAS_TABLE = 25
    const val PASHAS_TABLE = 26
    const val SONNYS_TABLE = 27
    const val UPPER_BEACH_PARASOL = 28
    const val LOWER_BEACH_PARASOL = 29


    private val investigations = arrayOf(

        InvestigationObject(
            5,
            BedDescription(
                "Golden Coin",
                { IconFactory().goldenCoin128() },
                "There are 5 golden coins lying on the bed."
            ),
        ) { Merchant.goldenCoins().addAmount(5) },

        InvestigationObject(
            5,
            BedDescription(
                "Love Letter",
                { IconFactory().goldenCoin128() },
                "There is a love letter lying on the bed"
            ),
        ) { Merchant.items()[ItemBackpack.LOVE_LETTER].add() },

        InvestigationObject(
            5,
            BedDescription(
                "Golden Coin",
                { IconFactory().goldenCoin128() },
                "There are 5 golden coins lying on the bed."
            ),
        ) { Merchant.goldenCoins().addAmount(5) },

        InvestigationObject(
            5,
            BedDescription(
                "Golden Coin",
                { IconFactory().goldenCoin128() },
                "There are 5 golden coins lying on the bed."
            ),
        ) { Merchant.goldenCoins().addAmount(5) },

        InvestigationObject(
            5,
            BedDescription(
                "Golden Coin",
                { IconFactory().goldenCoin128() },
                "There are 5 golden coins lying on the bed."
            ),
        ) { Merchant.goldenCoins().addAmount(5) },

        InvestigationObject(
            5,
            BedDescription(
                "Golden Coin",
                { IconFactory().goldenCoin128() },
                "There are 5 golden coins lying on the bed."
            ),
        ) { Merchant.goldenCoins().addAmount(5) },

        InvestigationObject(
            5,
            BedDescription(
                "Golden Coin",
                { IconFactory().goldenCoin128() },
                "There are 5 golden coins lying on the bed."
            ),
        ) { Merchant.goldenCoins().addAmount(5) },

        InvestigationObject(
            5,
            BedDescription(
                "Golden Coin",
                { IconFactory().goldenCoin128() },
                "There are 5 golden coins lying on the bed."
            ),
        ) { Merchant.goldenCoins().addAmount(5) },

        InvestigationObject(
            5,
            BedDescription(
                "Golden Coin",
                { IconFactory().goldenCoin128() },
                "There are 5 golden coins lying on the bed."
            ),
        ) { Merchant.goldenCoins().addAmount(5) },

        InvestigationObject(
            5,
            BedDescription(
                "Golden Coin",
                { IconFactory().goldenCoin128() },
                "There are 5 golden coins lying on the bed."
            ),
        ) { Merchant.goldenCoins().addAmount(5) },

        InvestigationObject(
            5,
            BedDescription(
                "Golden Coin",
                { IconFactory().goldenCoin128() },
                "There are 5 golden coins lying on the bed."
            ),
        ) { Merchant.goldenCoins().addAmount(5) },

        InvestigationObject(
            5,
            BedDescription(
                "Golden Coin",
                { IconFactory().goldenCoin128() },
                "There are 5 golden coins lying on the bed."
            ),
        ) { Merchant.goldenCoins().addAmount(5) },

        InvestigationObject(
            5,
            BedDescription(
                "Golden Coin",
                { IconFactory().goldenCoin128() },
                "There are 5 golden coins lying on the bed."
            ),
        ) { Merchant.goldenCoins().addAmount(5) },

        InvestigationObject(
            5,
            BedDescription(
                "Golden Coin",
                { IconFactory().goldenCoin128() },
                "There are 5 golden coins lying on the bed."
            ),
        ) { Merchant.goldenCoins().addAmount(5) },

        InvestigationObject(
            5,
            BedDescription(
                "Golden Coin",
                { IconFactory().goldenCoin128() },
                "There are 5 golden coins lying on the bed."
            ),
        ) { Merchant.goldenCoins().addAmount(5) },

        InvestigationObject(
            5,
            BedDescription(
                "Golden Coin",
                { IconFactory().goldenCoin128() },
                "There are 5 golden coins lying on the bed."
            ),
        ) { Merchant.goldenCoins().addAmount(5) },

        InvestigationObject(
            5,
            BedDescription(
                "Golden Coin",
                { IconFactory().goldenCoin128() },
                "There are 5 golden coins lying on the bed."
            ),
        ) { Merchant.goldenCoins().addAmount(5) },

        InvestigationObject(
            5,
            BedDescription(
                "Golden Coin",
                { IconFactory().goldenCoin128() },
                "There are 5 golden coins lying on the bed."
            ),
        ) { Merchant.goldenCoins().addAmount(5) },

        InvestigationObject(
            5,
            BedDescription(
                "Golden Coin",
                { IconFactory().goldenCoin128() },
                "There are 5 golden coins lying on the bed."
            ),
        ) { Merchant.goldenCoins().addAmount(5) },

        InvestigationObject(
            5,
            BedDescription(
                "Golden Coin",
                { IconFactory().goldenCoin128() },
                "There are 5 golden coins lying on the bed."
            ),
        ) { Merchant.goldenCoins().addAmount(5) },

        InvestigationObject(
            5,
            BedDescription(
                "Golden Coin",
                { IconFactory().goldenCoin128() },
                "There are 5 golden coins lying on the bed."
            ),
        ) { Merchant.goldenCoins().addAmount(5) },

        InvestigationObject(
            5,
            BedDescription(
                "Golden Coin",
                { IconFactory().goldenCoin128() },
                "There are 5 golden coins lying on the bed."
            ),
        ) { Merchant.goldenCoins().addAmount(5) },

        InvestigationObject(
            5,
            BedDescription(
                "Golden Coin",
                { IconFactory().goldenCoin128() },
                "There are 5 golden coins lying on the bed."
            ),
        ) { Merchant.goldenCoins().addAmount(5) },

        InvestigationObject(
            5,
            BedDescription(
                "Golden Coin",
                { IconFactory().goldenCoin128() },
                "There are 5 golden coins lying on the bed."
            ),
        ) { Merchant.goldenCoins().addAmount(5) },

        InvestigationObject(
            5,
            BedDescription(
                "Golden Coin",
                { IconFactory().goldenCoin128() },
                "There are 5 golden coins lying on the bed."
            ),
        ) { Merchant.goldenCoins().addAmount(5) },

        InvestigationObject(
            5,
            BedDescription(
                "Golden Coin",
                { IconFactory().goldenCoin128() },
                "There are 5 golden coins lying on the bed."
            ),
        ) { Merchant.goldenCoins().addAmount(5) },

        InvestigationObject(
            5,
            BedDescription(
                "Golden Coin",
                { IconFactory().goldenCoin128() },
                "There are 5 golden coins lying on the bed."
            ),
        ) { Merchant.goldenCoins().addAmount(5) },

        InvestigationObject(
            5,
            BedDescription(
                "Golden Coin",
                { IconFactory().goldenCoin128() },
                "There are 5 golden coins lying on the bed."
            ),
        ) { Merchant.goldenCoins().addAmount(5) },

        InvestigationObject(
            5,
            BedDescription(
                "Golden Coin",
                { IconFactory().goldenCoin128() },
                "There are 5 golden coins lying on the bed."
            ),
        ) { Merchant.goldenCoins().addAmount(5) },

        InvestigationObject(
            5,
            BedDescription(
                "Golden Coin",
                { IconFactory().goldenCoin128() },
                "There are 5 golden coins lying on the bed."
            ),
        ) { Merchant.goldenCoins().addAmount(5) },
    )

    private var investigationObject: InvestigationObject = investigations[KHANS_BED]
    fun investigationObject() = investigationObject

    fun changeInvestigation(investigationIndex: Int) {

        investigationObject = investigations[investigationIndex]
    }
}