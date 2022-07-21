package com.pregnantunicorn.merchantofgoldlakehorizon.models.bed

import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.CurrentDayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.dialog_messages.DialogMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant

class Bed {

    fun icon(): Int {

        return IconFactory().bed128()
    }

    fun dialogMessage(): DialogMessage {

        return DialogMessage(
            "Renting Time Expired",
            IconFactory().dayCycleIcon64(),
            "Time to wake up. Your renting time has expired."
        )
    }

    fun sleep() {

        CurrentDayCycle.changeDayCycle()
        Merchant.energy().restore()
        Merchant.charisma().restore()
        Merchant.persuasion().restore()
        Merchant.intelligence().restore()
    }
}