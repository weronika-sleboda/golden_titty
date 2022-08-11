package com.pregnantunicorn.merchantofgoldlakehorizon.models.food

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage

class Food(
    val name: String,
    val icon: Int,
    val info: String,
    private val foodType: FoodType,
)
{

    fun consume(): Boolean {

        if(Merchant.health().amountIsMaxed()) {

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
        }
    }

    private fun consumeDates(): Boolean {

        val amount = 1

        if(Merchant.dates().hasAmount(amount)) {

            Merchant.dates().loseAmount(amount)
            Merchant.health().addAmount(1)
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

        if(Merchant.coconuts().hasAmount(amount)) {

            Merchant.coconuts().loseAmount(amount)
            Merchant.health().addAmount(2)
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

        if(Merchant.peaches().hasAmount(amount)) {

            Merchant.peaches().loseAmount(amount)
            Merchant.health().addAmount(3)
            return true
        }

        CurrentMessage.changeMessage(
            "No Peaches",
            R.drawable.peach64,
            "You don't have any of these."
        )

        return false
    }

}