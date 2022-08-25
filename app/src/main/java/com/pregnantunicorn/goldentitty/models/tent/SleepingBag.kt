package com.pregnantunicorn.goldentitty.models.tent

import com.pregnantunicorn.goldentitty.models.day_cycle.CurrentDayCycle
import com.pregnantunicorn.goldentitty.models.day_cycle.DayCycle
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.player.Player
import com.pregnantunicorn.goldentitty.models.message.CurrentMessage
import com.pregnantunicorn.goldentitty.models.npcs.CurrentNpc

class SleepingBag {

    private var healthCost = 1
    fun healthCostToString() = "$healthCost"

    fun icon(): Int = IconFactory().sleepingBag128()
    fun info() = "Sleep and restore your status at the expense of 1 health point."

    private fun changeAndShowMessage() {

        when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> CurrentMessage.changeMessage(
               "Wake up!", IconFactory().morning64(), "It's already morning."
            )

            DayCycle.SUNSET -> CurrentMessage.changeMessage(
                "Wake up!", IconFactory().sunset64(), "It's already sunset."
            )

            DayCycle.NIGHT -> CurrentMessage.changeMessage(
                "Wake up!", IconFactory().night64(), "It's already night."
            )
        }
    }

    fun sleep(): Boolean {

        for(npc in CurrentNpc.npcs()) {

            npc.loseHealth()

            if(npc.isDead()) {

                return false
            }
        }

        CurrentDayCycle.changeDayCycle()
        Player.health().loseAmount(healthCost)
        Player.energy().restore()
        changeAndShowMessage()

        if(Player.isDead()) {

            return false
        }

        return true
    }
}