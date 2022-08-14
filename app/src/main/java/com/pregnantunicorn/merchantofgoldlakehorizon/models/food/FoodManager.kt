package com.pregnantunicorn.merchantofgoldlakehorizon.models.food
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.player.Player

class FoodManager {

    val foods = arrayOf(

        Food(
            "Dates",
            R.drawable.dates64,
            "Health: +1",
            { Player.dates().amountToString() },
            FoodType.DATES,
        ),

        Food(
            "Coconut",
            R.drawable.coconut64,
            "Health: +2",
            { Player.dates().amountToString() },
            FoodType.COCONUTS
        ),

        Food(
            "Peach",
            R.drawable.peach64,
            "Health: +3",
            { Player.dates().amountToString() },
            FoodType.PEACHES
        ),

        Food(
            "Cappuccino",
            R.drawable.cappuccino64,
            "Accuracy: +5",
            { Player.cappuccino().amountToString() },
            FoodType.CAPPUCCINO
        ),

        Food(
            "Smoothie",
            R.drawable.smoothie64,
            "Agility: +5",
            { Player.agility().amountToString() },
            FoodType.SMOOTHIE
        ),

        Food(
            "Herbal Tea",
            R.drawable.herbal_tea64,
            "Herbal Tea: +5",
            { Player.herbalTea().amountToString() },
            FoodType.HERBAL_TEA
        ),
    )
}