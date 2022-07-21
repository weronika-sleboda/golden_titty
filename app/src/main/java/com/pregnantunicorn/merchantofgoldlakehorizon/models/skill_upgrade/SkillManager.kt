package com.pregnantunicorn.merchantofgoldlakehorizon.models.skill_upgrade

import com.pregnantunicorn.merchantofgoldlakehorizon.models.dialog_messages.DialogMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.StatusUpdateType

class SkillManager(
    val name: String,
    val info: String,
    val icon: Int,
    val statusUpdateType: StatusUpdateType,
    private val upgradeAlgorithm: () -> Unit
)
{

    private val price = 1000

    fun priceToString() = "$price"

    fun dialogMessage(): DialogMessage {

        return DialogMessage(
            "$name upgraded",
            icon,
            "Your $name has been upgraded by 1 point."
        )
    }

    fun buy(): Boolean {

        if(Merchant.goldenCoins().hasAmount(price)) {

            Merchant.goldenCoins().loseAmount(price)
            upgradeAlgorithm.invoke()
            return true
        }

        return false
    }
}