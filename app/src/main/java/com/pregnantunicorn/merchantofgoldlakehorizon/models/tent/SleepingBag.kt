package com.pregnantunicorn.merchantofgoldlakehorizon.models.tent

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.CurrentDayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.DayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Player
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage

class SleepingBag {

    private var healthCost = 1
    fun healthCostToString() = "$healthCost"

    fun icon(): Int = IconFactory().sleepingBag64()
    fun info() = "Sleep and restore your status at the expense of 1 health point."

    private fun changeAndShowMessage() {

        when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> CurrentMessage.changeMessage(
               "Wake up!", R.drawable.morning64, "It's already morning."
            )

            DayCycle.SUNSET -> CurrentMessage.changeMessage(
                "Wake up!", R.drawable.sunset64, "It's already sunset."
            )

            DayCycle.NIGHT -> CurrentMessage.changeMessage(
                "Wake up!", R.drawable.night64, "It's already night."
            )
        }
    }

    fun sleep() {

        CurrentDayCycle.changeDayCycle()
        Player.health().loseAmount(healthCost)
        Player.accuracy().restore()
        Player.agility().restore()
        Player.stealth().restore()

        changeAndShowMessage()
    }
}