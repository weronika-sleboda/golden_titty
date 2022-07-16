package com.pregnantunicorn.merchantofgoldlakehorizon.models.customers

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.ItemBackpack
import kotlin.random.Random

class DealGenerator {

    fun generateDeal(
        demandProbability: Int,
        demand: Int,
        rewardProbability: Int,
        reward: Int,
    ): Deal {

        return when(Random.nextInt(6)) {

            0 -> Deal(
                R.drawable.spices64,
                "Spices",
                demandProbability + Random.nextInt(demand),
                rewardProbability + Random.nextInt(reward),
                ItemBackpack.SPICES
            )

            1 -> Deal(
                R.drawable.feather64,
                "Feather",
                demandProbability + Random.nextInt(demand),
                rewardProbability + Random.nextInt(reward),
                ItemBackpack.FEATHER
            )

            2 -> Deal(
                R.drawable.iron64,
                "Iron",
                demandProbability + Random.nextInt(demand),
                rewardProbability + Random.nextInt(reward),
                ItemBackpack.IRON
            )

            3 -> Deal(R.drawable.wood64,
                "Wood",
                demandProbability + Random.nextInt(demand),
                rewardProbability + Random.nextInt(reward),
                ItemBackpack.WOOD
            )

            4 -> Deal(R.drawable.gems64,
                "Gems",
                demandProbability + Random.nextInt(demand),
                rewardProbability + Random.nextInt(reward),
                ItemBackpack.GEMS
            )

            else -> {

                Deal(
                    R.drawable.stones64,
                    "Stone",
                    demandProbability + Random.nextInt(demand),
                    rewardProbability + Random.nextInt(reward),
                    ItemBackpack.STONES
                )
            }
        }
    }
}