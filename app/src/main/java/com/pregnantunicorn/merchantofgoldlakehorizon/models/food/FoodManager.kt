package com.pregnantunicorn.merchantofgoldlakehorizon.models.food
import com.pregnantunicorn.merchantofgoldlakehorizon.R

class FoodManager {

    val foods = arrayOf(

        Food(
            "Dates",
            R.drawable.dates64,
            "Health: +1",
            FoodType.DATES,
        ),

        Food(
            "Coconut",
            R.drawable.coconut64,
            "Health: +2",
            FoodType.COCONUTS
        ),

        Food(
            "Peach",
            R.drawable.peach64,
            "Health: +3",
            FoodType.PEACHES
        )
    )
}