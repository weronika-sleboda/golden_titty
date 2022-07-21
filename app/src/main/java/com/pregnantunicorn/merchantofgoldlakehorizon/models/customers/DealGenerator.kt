package com.pregnantunicorn.merchantofgoldlakehorizon.models.customers

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.ItemBackpack
import kotlin.random.Random

class DealGenerator {

    fun generateDeal(): Deal {

        return when(Random.nextInt(6)) {

            0 -> Deal(
                R.drawable.spices64,
                "Spices",
                1,
                10,
                ItemBackpack.SPICES
            )

            1 -> Deal(
                R.drawable.feather64,
                "Feather",
                1,
                1,
                ItemBackpack.FEATHER
            )

            2 -> Deal(
                R.drawable.iron64,
                "Iron",
                1,
                7,
                ItemBackpack.IRON
            )

            3 -> Deal(R.drawable.wood64,
                "Wood",
                1,
                5,
                ItemBackpack.WOOD
            )

            4 -> Deal(R.drawable.gems64,
                "Gems",
                1,
                15,
                ItemBackpack.GEMS
            )

            else -> {

                Deal(
                    R.drawable.stones64,
                    "Stone",
                    1,
                    3,
                    ItemBackpack.STONES
                )
            }
        }
    }
}