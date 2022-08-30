package com.pregnantunicorn.goldentitty.models.tent

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.day_cycle.CurrentDayCycle
import com.pregnantunicorn.goldentitty.models.day_cycle.DayCycle
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.meteor.Meteor
import com.pregnantunicorn.goldentitty.models.message.CurrentMessage
import com.pregnantunicorn.goldentitty.models.npcs.LadySilvia
import com.pregnantunicorn.goldentitty.models.story_line.CurrentEvent
import com.pregnantunicorn.goldentitty.models.story_line.EventTitle

class SleepingBag {

    private var healthCost = 1
    fun healthCostToString() = "$healthCost"

    fun icon(): Int = IconFactory().sleepingBag128()
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

    fun sleep(): Boolean {

        Meteor.health().loseAmount(healthCost)

        if(!LadySilvia.ladySilvia().hasHouse()) {

            LadySilvia.ladySilvia().loseHealth()
        }

        CurrentDayCycle.changeDayCycle()
        Meteor.energy().restore()
        changeAndShowMessage()

        if(Meteor.isDead() && LadySilvia.ladySilvia().isDead()) {

            CurrentEvent.changeEvent(EventTitle.TEAMS_DEATH)
            return false
        }

        else if(Meteor.isDead()) {

            CurrentEvent.changeEvent(EventTitle.METEORS_DEATH)
            return false
        }

        else if(LadySilvia.ladySilvia().isDead()) {

            CurrentEvent.changeEvent(EventTitle.LADY_SILVIAS_DEATH)
            return false
        }

        return true
    }
}