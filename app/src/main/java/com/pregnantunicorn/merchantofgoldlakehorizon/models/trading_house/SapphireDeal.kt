package com.pregnantunicorn.merchantofgoldlakehorizon.models.trading_house

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.dialog_messages.DialogMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.GemUpdateType
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant

class SapphireDeal : Deal(
    R.drawable.sapphire128,
    "Sapphire"
)
{

    override fun sell(): Boolean {

        if(Merchant.sapphire().hasAmount(demand)) {

            Merchant.sapphire().loseAmount(demand)
            Merchant.goldenCoins().addAmount(reward)
            return true
        }

        return false
    }

    override fun dialogMessage(): DialogMessage {

        return DialogMessage(
            "Demand Not Met",
            R.drawable.sapphire64,
            "You don't have the demanded amount of sapphire."
        )
    }
}