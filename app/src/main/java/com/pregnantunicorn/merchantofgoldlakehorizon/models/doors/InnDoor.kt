package com.pregnantunicorn.merchantofgoldlakehorizon.models.doors

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.dialog_messages.DialogMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant

class InnDoor(
    val buildingName: String,
    val buildingInfo: String,
    val closingInfo: String,
    val doorIcon: () -> Int,
    private var requiredGold: Int
)
{

    fun priceToString() = "$requiredGold"

    fun dialogMessage(): DialogMessage {

        return DialogMessage(
            "Too Expensive",
            R.drawable.golden_coin_64,
            "You don't have enough golden coins to rent the bedchamber."
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