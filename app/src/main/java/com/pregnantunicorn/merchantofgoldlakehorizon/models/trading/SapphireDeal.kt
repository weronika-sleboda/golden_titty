package com.pregnantunicorn.merchantofgoldlakehorizon.models.trading

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage

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

        CurrentMessage.changeMessage(
            "Demand Not Met",
            R.drawable.sapphire64,
            "You don't have enough sapphire gems."
        )

        return false
    }

}