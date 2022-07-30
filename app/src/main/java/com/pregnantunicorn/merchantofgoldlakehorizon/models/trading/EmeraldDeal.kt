package com.pregnantunicorn.merchantofgoldlakehorizon.models.trading

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage

class EmeraldDeal : Deal(
    R.drawable.emerald128,
    "Emerald",
)
{

    override fun sell(): Boolean {

        if(Merchant.emerald().hasAmount(demand)) {

            Merchant.emerald().loseAmount(demand)
            Merchant.goldenCoins().addAmount(reward)
            return true
        }

        CurrentMessage.changeMessage(
            "Demand Not Met",
            R.drawable.emerald64,
            "You don't have enough emerald gems."
        )

        return false
    }
}