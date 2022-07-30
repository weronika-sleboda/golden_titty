package com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.Message

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
        const val DIVINE_POTION = 9
    }

    val foods = arrayOf(

        Food(
            "Sushi",
            R.drawable.sushi64,
            "Energy: 5",
            { Merchant.energy().addAmount(5)},
            { Merchant.energy().amountIsMaxed() },
            statusUpdateType = StatusUpdateType.ENERGY,
        )
        {
            CurrentMessage.changeMessage(
            "Full Energy", R.drawable.energy64,
            "Your energy is already full.")
        },

        Food(
            "Ramen",
            R.drawable.ramen64,
            "Energy: 10",
            { Merchant.energy().addAmount(10)},
            { Merchant.energy().amountIsMaxed() },
            statusUpdateType = StatusUpdateType.ENERGY
        )
        {
            CurrentMessage.changeMessage(
                "Full Energy", R.drawable.energy64,
                "Your energy is already full.")
        },

        Food(
            "Burger",
            R.drawable.burger64,
            "Energy: 15",
            { Merchant.energy().addAmount(15)},
            { Merchant.energy().amountIsMaxed() },
            statusUpdateType = StatusUpdateType.ENERGY
        )
        {
            CurrentMessage.changeMessage(
                "Full Energy", R.drawable.energy64,
                "Your energy is already full.")
        },

        Food(
            "Filter Coffee",
            R.drawable.filter_coffee64,
            "Intelligence: 5",
            { Merchant.intelligence().addAmount(5)},
            { Merchant.intelligence().amountIsMaxed() },
            statusUpdateType = StatusUpdateType.INTELLIGENCE
        )
        {
            CurrentMessage.changeMessage(
                "Full Intelligence", R.drawable.intelligence64,
                "Your intelligence is already full.")
        },

        Food(
            "Cappuccino",
            R.drawable.cappuccino64,
            "Intelligence: 10",
            { Merchant.intelligence().addAmount(10)},
            { Merchant.intelligence().amountIsMaxed() },
            statusUpdateType = StatusUpdateType.INTELLIGENCE
        )
        {
            CurrentMessage.changeMessage(
                "Full Intelligence", R.drawable.intelligence64,
                "Your intelligence is already full.")
        },

        Food(
            "Latte",
            R.drawable.latte64,
            "Intelligence: 15",
            { Merchant.intelligence().addAmount(15)},
            { Merchant.intelligence().amountIsMaxed() },
            statusUpdateType = StatusUpdateType.INTELLIGENCE
        )
        {
            CurrentMessage.changeMessage(
                "Full Intelligence", R.drawable.intelligence64,
                "Your intelligence is already full.")
        },

        Food(
            "Coconut Water",
            R.drawable.coconut_water64,
            "Persuasion: 5",
            { Merchant.persuasion().addAmount(5)},
            { Merchant.persuasion().amountIsMaxed() },
            statusUpdateType = StatusUpdateType.PERSUASION
        )
        {
            CurrentMessage.changeMessage(
                "Full Persuasion", R.drawable.persuasion64,
                "Your persuasion is already full.")
        },

        Food(
            "Smoothie",
            R.drawable.smoothie64,
            "Persuasion: 10",
            { Merchant.persuasion().addAmount(10)},
            { Merchant.persuasion().amountIsMaxed() },
            statusUpdateType = StatusUpdateType.PERSUASION
        )
        {
            CurrentMessage.changeMessage(
                "Full Persuasion", R.drawable.persuasion64,
                "Your persuasion is already full.")
        },

        Food(
            "Hot Chocolate",
            R.drawable.hot_chocolate64,
            "Persuasion: 15",
            { Merchant.persuasion().addAmount(15)},
            { Merchant.persuasion().amountIsMaxed() },
            statusUpdateType = StatusUpdateType.PERSUASION
        )
        {
            CurrentMessage.changeMessage(
                "Full Persuasion", R.drawable.persuasion64,
                "Your persuasion is already full.")
        },

        Food(
            "Divine Potion",
            R.drawable.divine_potion64,
            "Charisma: 10",
            { Merchant.charisma().addAmount(10)},
            { Merchant.charisma().amountIsMaxed() },
            statusUpdateType = StatusUpdateType.CHARISMA
        )
        {
            CurrentMessage.changeMessage(
                "Full Charisma", R.drawable.charisma64,
                "Your charisma is already full.")
        },

    )
}