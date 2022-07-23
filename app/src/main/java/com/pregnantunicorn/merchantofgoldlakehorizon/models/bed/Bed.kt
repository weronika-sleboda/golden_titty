package com.pregnantunicorn.merchantofgoldlakehorizon.models.bed

import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.CurrentDayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.DayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.dialog_messages.DialogMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant
import com.pregnantunicorn.merchantofgoldlakehorizon.models.rent.RentTime
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world.CurrentMap

class Bed {

    fun icon(): Int {

        return IconFactory().bed128()
    }

    fun dialogMessage(): DialogMessage {

        val dayCycle = when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> "morning"
            DayCycle.SUNSET -> "sunset"
            DayCycle.NIGHT -> "night"
        }

        return DialogMessage(
            "Wake Up",
            IconFactory().dayCycleIcon64(),
            "Time to wake up. It's already $dayCycle."
        )
    }

    fun sleep() {

        CurrentDayCycle.changeDayCycle()
        Merchant.energy().restore()
        Merchant.charisma().restore()
        Merchant.persuasion().restore()
        Merchant.intelligence().restore()
        RentTime.raiseCounter()

    }
}