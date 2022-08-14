package com.pregnantunicorn.merchantofgoldlakehorizon.models.food

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.player.Player
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage

class Food(
    val name: String,
    val icon: Int,
    val info: String,
    val amountToString: () -> String,
    private val foodType: FoodType,
)
{

    fun consume(): Boolean {

        if(Player.health().amountIsMaxed()) {

            CurrentMessage.changeMessage(
                "Full Health",
                R.drawable.health64,
                "Your health is already full."
            )

            return false
        }

        return when(foodType) {

            FoodType.DATES -> consumeDates()
            FoodType.PEACHES -> consumePeaches()
            FoodType.COCONUTS -> consumeCoconut()
            FoodType.CAPPUCCINO -> consumeCappuccino()
            FoodType.SMOOTHIE -> consumeSmoothie()
            FoodType.HERBAL_TEA -> consumeHerbalTea()
        }
    }

    private fun consumeDates(): Boolean {

        val amount = 1

        if(Player.dates().hasAmount(amount)) {

            Player.dates().loseAmount(amount)
            Player.health().addAmount(1)
            return true
        }

        CurrentMessage.changeMessage(
            "No Dates",
            R.drawable.dates64,
            "You don't have any of these."
        )

        return false
    }

    private fun consumeCoconut(): Boolean {

        val amount = 1

        if(Player.coconuts().hasAmount(amount)) {

            Player.coconuts().loseAmount(amount)
            Player.health().addAmount(2)
            return true
        }

        CurrentMessage.changeMessage(
            "No Coconuts",
            R.drawable.coconut64,
            "You don't have any of these."
        )

        return false
    }

    private fun consumePeaches(): Boolean {

        val amount = 1

        if(Player.peaches().hasAmount(amount)) {

            Player.peaches().loseAmount(amount)
            Player.health().addAmount(3)
            return true
        }

        CurrentMessage.changeMessage(
            "No Peaches",
            R.drawable.peach64,
            "You don't have any of these."
        )

        return false
    }

    private fun consumeCappuccino(): Boolean {

        val amount = 1

        if(Player.cappuccino().hasAmount(amount)) {

            Player.cappuccino().loseAmount(amount)
            Player.accuracy().addAmount(5)
            return true
        }

        CurrentMessage.changeMessage(
            "No Cappuccinos",
            R.drawable.cappuccino64,
            "You don't have any of these."
        )

        return false
    }

    private fun consumeSmoothie(): Boolean {

        val amount = 1

        if(Player.smoothie().hasAmount(amount)) {

            Player.smoothie().loseAmount(amount)
            Player.agility().addAmount(5)
            return true
        }

        CurrentMessage.changeMessage(
            "No Smoothies",
            R.drawable.smoothie64,
            "You don't have any of these."
        )

        return false
    }

    private fun consumeHerbalTea(): Boolean {

        val amount = 1

        if(Player.herbalTea().hasAmount(amount)) {

            Player.herbalTea().loseAmount(amount)
            Player.stealth().addAmount(5)
            return true
        }

        CurrentMessage.changeMessage(
            "No Herbal Teas",
            R.drawable.herbal_tea64,
            "You don't have any of these."
        )

        return false
    }
}