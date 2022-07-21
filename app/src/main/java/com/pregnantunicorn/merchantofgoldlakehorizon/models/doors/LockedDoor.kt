package com.pregnantunicorn.merchantofgoldlakehorizon.models.doors

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.dialog_messages.DialogMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant

class LockedDoor(
    val buildingName: String,
    val buildingInfo: String,
    val doorIcon: () -> Int,
    val doorAlgorithm: () -> Unit,
    private var requiredCharisma: () -> Int
)
{

    fun charismaToString() = "${requiredCharisma.invoke()}"

    fun dialogMessage(): DialogMessage {

        return DialogMessage(
            "No charisma",
            R.drawable.charisma64,
            "The $buildingName is closed. If you want to get invited into the building by its residents, you need charisma."
        )
    }

    private var allowedToEnter = false
    fun allowedToEnter() = allowedToEnter

    fun open() {

        if(Merchant.charisma().hasAmount(requiredCharisma.invoke())) {

            allowedToEnter = true
            doorAlgorithm.invoke()
            Merchant.charisma().loseAmount(requiredCharisma.invoke())
        }

        else { allowedToEnter = false }
    }
}