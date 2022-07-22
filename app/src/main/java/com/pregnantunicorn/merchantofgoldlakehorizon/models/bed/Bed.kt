package com.pregnantunicorn.merchantofgoldlakehorizon.models.bed

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.CurrentDayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.DayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.dialog_messages.DialogMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant
import com.pregnantunicorn.merchantofgoldlakehorizon.models.rent.RentTime
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.RentCollectorFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

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
        Merchant.hourglass().nextDayCycle()
        RentTime.raiseCounter()
    }
}