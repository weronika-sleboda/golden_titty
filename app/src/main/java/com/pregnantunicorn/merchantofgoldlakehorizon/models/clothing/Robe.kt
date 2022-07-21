package com.pregnantunicorn.merchantofgoldlakehorizon.models.clothing

import com.pregnantunicorn.merchantofgoldlakehorizon.models.dialog_messages.DialogMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant

class Robe(
    val name: String,
    val icon: Int,
    val doorInfo: String,
    val charismaInfo: String,
    private val lookTitle: String,
    private val lookInfo: String,
    private val merchantIcon: Int,
    private val charisma: Int,
    private var owns: Boolean = false,
    private var wears: Boolean = false
)
{

    fun dialogMessage(): DialogMessage {

        return DialogMessage(
            lookTitle,
            icon,
            lookInfo
        )
    }

    fun boughtMessage(): DialogMessage {

        return  DialogMessage(
            "$name acquired",
            icon,
            "$name have been added to your backpack."
        )
    }

    fun wears() = wears
    fun owns() = owns

    fun putInBackpack() {

        owns = true
    }

    fun wear() {

        Merchant.appearance().changeAppearance(merchantIcon)
        wears = true
    }

    fun takeOff() {

        wears = false
    }

}