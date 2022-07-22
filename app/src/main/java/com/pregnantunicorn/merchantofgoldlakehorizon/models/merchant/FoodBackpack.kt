package com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.dialog_messages.DialogMessage

class FoodBackpack {

    companion object {

        const val SUSHI = 0
        const val RAMEN = 1
        const val BURGER = 2
        const val FILTER_COFFEE = 3
        const val CAPPUCCINO = 4
        const val LATTE = 5
        const val COCONUT_WATER = 6
        const val SMOOTHIE = 7
        const val HOT_CHOCOLATE = 8
    }

    val foods = arrayOf(

        Food(
            "Sushi",
            R.drawable.sushi64,
            "Energy: 5",
            { Merchant.energy().addAmount(5)},
            { Merchant.energy().amountIsMaxed() },
            DialogMessage(
                "Max energy", R.drawable.energy64,
                "Your energy has already reached max value."
            ),
            statusUpdateType = StatusUpdateType.ENERGY,
        ),

        Food(
            "Ramen",
            R.drawable.ramen64,
            "Energy: 10",
            { Merchant.energy().addAmount(10)},
            { Merchant.energy().amountIsMaxed() },
            DialogMessage(
                "Max energy", R.drawable.energy64,
                "Your energy has already reached max value."
            ),
            statusUpdateType = StatusUpdateType.ENERGY
        ),

        Food(
            "Burger",
            R.drawable.burger64,
            "Energy: 15",
            { Merchant.energy().addAmount(15)},
            { Merchant.energy().amountIsMaxed() },
            DialogMessage(
                "Max energy", R.drawable.energy64,
                "Your energy has already reached max value."
            ),
            statusUpdateType = StatusUpdateType.ENERGY
        ),

        Food(
            "Filter Coffee",
            R.drawable.filter_coffee64,
            "Intelligence: 5",
            { Merchant.intelligence().addAmount(5)},
            { Merchant.intelligence().amountIsMaxed() },
            DialogMessage(
                "Max intelligence", R.drawable.intelligence64,
                "Your intelligence has already reached max value."
            ),
            statusUpdateType = StatusUpdateType.INTELLIGENCE
        ),

        Food(
            "Cappuccino",
            R.drawable.cappuccino64,
            "Intelligence: 10",
            { Merchant.intelligence().addAmount(10)},
            { Merchant.intelligence().amountIsMaxed() },
            DialogMessage(
                "Max intelligence", R.drawable.intelligence64,
                "Your intelligence has already reached max value."
            ),
            statusUpdateType = StatusUpdateType.INTELLIGENCE
        ),

        Food(
            "Latte",
            R.drawable.latte64,
            "Intelligence: 15",
            { Merchant.intelligence().addAmount(15)},
            { Merchant.intelligence().amountIsMaxed() },
            DialogMessage(
                "Max intelligence", R.drawable.intelligence64,
                "Your intelligence has already reached max value."
            ),
            statusUpdateType = StatusUpdateType.INTELLIGENCE
        ),

        Food(
            "Coconut Water",
            R.drawable.coconut_water64,
            "Persuasion: 5",
            { Merchant.persuasion().addAmount(5)},
            { Merchant.persuasion().amountIsMaxed() },
            DialogMessage(
                "Max persuasion", R.drawable.persuasion64,
                "Your persuasion has already reached max value."
            ),
            statusUpdateType = StatusUpdateType.PERSUASION
        ),

        Food(
            "Smoothie",
            R.drawable.smoothie64,
            "Persuasion: 10",
            { Merchant.persuasion().addAmount(10)},
            { Merchant.persuasion().amountIsMaxed() },
            DialogMessage(
                "Max persuasion", R.drawable.persuasion64,
                "Your persuasion has already reached max value."
            ),
            statusUpdateType = StatusUpdateType.PERSUASION
        ),

        Food(
            "Hot Chocolate",
            R.drawable.hot_chocolate64,
            "Persuasion: 15",
            { Merchant.persuasion().addAmount(15)},
            { Merchant.persuasion().amountIsMaxed() },
            DialogMessage(
                "Max persuasion", R.drawable.persuasion64,
                "Your persuasion has already reached max value."
            ),
            statusUpdateType = StatusUpdateType.PERSUASION
        ),

    )
}