package com.pregnantunicorn.merchantofgoldlakehorizon.models.university

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.player.Player
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage

class UniversitySkill(
    val name: String,
    val icon: Int,
    val infoAlgorithm: () -> Unit,
    private val skillMaxed: () -> Boolean,
    private val skillAlgorithm: () -> Unit
)
{

    private var price = 100
    fun priceToString() = "Price: $price" + "G"

    fun buy(): Boolean {

        if(Player.goldCoins().hasAmount(price) && !skillMaxed.invoke()) {

            Player.goldCoins().loseAmount(price)
            skillAlgorithm.invoke()
            return true
        }

        if(Player.goldCoins().hasAmount(price)) {

            CurrentMessage.changeMessage(
                "Too Expensive",
                R.drawable.gold_coin_64,
                "You don't have enough golden coins."
            )
        }

        if(skillMaxed.invoke()) {

            CurrentMessage.changeMessage(
                "Maximum Value",
                R.drawable.warning64,
                "This skill has already reached its maximum value."
            )
        }

        return false
    }
}