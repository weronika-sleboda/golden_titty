package com.pregnantunicorn.goldentitty.models.food
import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.player.Player

class FoodManager {

    val foods = arrayOf(

        Food(
            "Coconut",
            R.drawable.coconut64,
            "Health: +2",
            { Player.coconuts().amountToString() },
        ),
    )
}