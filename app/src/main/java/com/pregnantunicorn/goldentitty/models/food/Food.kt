package com.pregnantunicorn.goldentitty.models.food

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.player.Player
import com.pregnantunicorn.goldentitty.models.message.CurrentMessage

class Food(
    val name: String,
    val icon: Int,
    val info: String,
    private val amountToString: () -> String,
)
{

    fun amountToString() = "Amount: ${amountToString.invoke()}"

    fun consume(): Boolean {

        return consumeCoconut()
    }

    private fun consumeCoconut(): Boolean {

        val amount = 1

        if(Player.coconuts().hasAmount(amount)) {

            Player.coconuts().loseAmount(amount)
            Player.health().addAmount(2)
            return true
        }

        if(Player.health().amountIsMaxed()) {

            CurrentMessage.changeMessage(
                "Full Health",
                R.drawable.health64,
                "Your health is already full."
            )

            return false
        }

        CurrentMessage.changeMessage(
            "No Coconuts",
            R.drawable.coconut64,
            "You don't have any of these."
        )

        return false
    }
}