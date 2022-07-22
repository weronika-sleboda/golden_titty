package com.pregnantunicorn.merchantofgoldlakehorizon.models.exploration

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.CurrentDayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.DayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.FoodBackpack
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.GemUpdateType
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant
import kotlin.random.Random

class TreasureGenerator {

    private var probability = 10

    fun generateTreasure(): Treasure {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> generateCaveMorningTreasure()
            DayCycle.SUNSET -> generateCaveSunsetTreasure()
            DayCycle.NIGHT -> generateCaveNightTreasure()
        }
    }

    private fun generateCaveMorningTreasure(): Treasure {

        return when(Random.nextInt(probability)) {

            0 -> randomizeFoodTreasure()

            1 -> emptyTreasure()

            else -> {

                Treasure(
                    "Emerald found",
                    R.drawable.emerald64,
                    "Emerald has been added to your backpack.",
                    { Merchant.emerald().addAmount(1)},
                    GemUpdateType.EMERALD
                )
            }
        }
    }

    private fun generateCaveSunsetTreasure(): Treasure {

        return when(Random.nextInt(probability)) {

            0 -> randomizeFoodTreasure()

            1 -> emptyTreasure()

            else -> {

                Treasure(
                    "Sapphire found",
                    R.drawable.sapphire64,
                    "Sapphire have been added to your backpack.",
                    { Merchant.sapphire().addAmount(1)},
                    GemUpdateType.SAPPHIRE,
                )
            }
        }
    }

    private fun generateCaveNightTreasure(): Treasure {

        return when(Random.nextInt(probability)) {

            0 -> randomizeFoodTreasure()

            1 -> emptyTreasure()

            else -> {

                Treasure(
                    "Ruby found",
                    R.drawable.ruby64,
                    "Ruby has been added to your backpack.",
                    { Merchant.ruby().addAmount(1)},
                    GemUpdateType.RUBY
                )
            }
        }
    }

    private fun foodTreasure(): Treasure {

        return when(Random.nextInt(9)) {

            0 -> Treasure(
                "Sushi",
                R.drawable.sushi64,
                "Sushi has been added to your backpack.",
                { Merchant.food()[FoodBackpack.SUSHI].addAmount(1)}
            )

            1 -> Treasure(
                "Ramen",
                R.drawable.ramen64,
                "Ramen has been added to your backpack.",
                { Merchant.food()[FoodBackpack.RAMEN].addAmount(1)}
            )

            2 -> Treasure(
                "Burger",
                R.drawable.burger64,
                "Burger has been added to your backpack.",
                { Merchant.food()[FoodBackpack.BURGER].addAmount(1)}
            )

            3 -> Treasure(
                "Filter Coffee",
                R.drawable.filter_coffee64,
                "Filter coffee has been added to your backpack.",
                { Merchant.food()[FoodBackpack.FILTER_COFFEE].addAmount(1)}
            )

            4 -> Treasure(
                "Cappuccino",
                R.drawable.cappuccino64,
                "Cappuccino has been added to your backpack.",
                { Merchant.food()[FoodBackpack.CAPPUCCINO].addAmount(1)}
            )

            5 -> Treasure(
                "Latte",
                R.drawable.latte64,
                "Latte has been added to your backpack.",
                { Merchant.food()[FoodBackpack.LATTE].addAmount(1)}
            )

            6 -> Treasure(
                "Coconut Water",
                R.drawable.coconut_water64,
                "Coconut water has been added to your backpack.",
                { Merchant.food()[FoodBackpack.COCONUT_WATER].addAmount(1)}
            )

            7 -> Treasure(
                "Smoothie",
                R.drawable.smoothie64,
                "Smoothie has been added to your backpack.",
                { Merchant.food()[FoodBackpack.SMOOTHIE].addAmount(1)}
            )

            else -> Treasure(
                "Hot Chocolate",
                R.drawable.hot_chocolate64,
                "Hot chocolate has been added to your backpack.",
                { Merchant.food()[FoodBackpack.HOT_CHOCOLATE].addAmount(1)}
            )
        }
    }

    private fun randomizeFoodTreasure(): Treasure {

        return when(Random.nextInt(4)) {

            0 -> foodTreasure()
            1 -> emptyTreasure()
            2 -> emptyTreasure()
            else -> { foodTreasure() }
        }
    }

    private fun emptyTreasure(): Treasure {

        return Treasure(
            "Nothing found",
            R.drawable.sonny64_white,
            "There is nothing of value in here...",
            {}
        )
    }
}