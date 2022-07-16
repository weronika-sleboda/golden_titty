package com.pregnantunicorn.merchantofgoldlakehorizon.models.doors

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.dialog_messages.DialogMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant

class PaidDoor(
    val buildingName: String,
    val buildingInfo: String,
    val doorIcon: Int,
    val doorAlgorithm: () -> Unit,
    private var requiredGold: Int
)
{

    fun dialogMessage(): DialogMessage {

        return DialogMessage(
            "Too expensive",
            R.drawable.golden_coin_64,
            "You don't have enough golden coins to rent a bed at $buildingName."
        )
    }

    private var allowedToEnter = false
    fun allowedToEnter() = allowedToEnter

    fun open() {

        allowedToEnter = if(Merchant.goldenCoins().hasAmount(requiredGold)) {

            Merchant.goldenCoins().loseAmount(requiredGold)
            true
        }

        else { false }
    }
}