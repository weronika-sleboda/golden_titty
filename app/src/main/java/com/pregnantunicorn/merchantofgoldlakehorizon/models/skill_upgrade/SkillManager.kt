package com.pregnantunicorn.merchantofgoldlakehorizon.models.skill_upgrade

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.Message
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.StatusUpdateType
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage

class SkillManager(
    val name: String,
    val info: String,
    val icon: Int,
    val statusUpdateType: StatusUpdateType,
    private val isMaxed: () -> Boolean,
    private val upgradeAlgorithm: () -> Unit,
    private val changeMessage: () -> Unit
)
{

    private val price = 500

    fun priceToString() = "$price"

    fun dialogMessage(): Message {

        return Message(
            "$name upgraded",
            icon,
            "Your $name has been upgraded by 1 point."
        )
    }

    fun buy(): Boolean {

        if(Merchant.goldenCoins().hasAmount(price) && !isMaxed.invoke()) {

            Merchant.goldenCoins().loseAmount(price)
            upgradeAlgorithm.invoke()
            CurrentMessage.changeMessage(
                "Skill Upgraded",
                icon,
                "$name has been upgraded."
            )
            return true
        }

        else if(isMaxed.invoke()) {

            changeMessage.invoke()
            return false
        }

        CurrentMessage.changeMessage(
            "Too Expensive",
            R.drawable.golden_coin_64,
            "You don't have enough golden coins."
        )

        return false
    }
}