package com.pregnantunicorn.merchantofgoldlakehorizon.models.inn

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.CurrentDayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.DayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage

class Bed(
    private val icon: () -> Int,
    private val healthCost: Int,
)
{

    fun healthCostToString() = "$healthCost"

    fun icon(): Int {

        return icon.invoke()
    }

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
        Merchant.health().loseAmount(healthCost)
        Merchant.energy().restore()
        Merchant.charisma().restore()
        Merchant.intelligence().restore()

        changeAndShowMessage()
    }
}