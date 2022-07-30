package com.pregnantunicorn.merchantofgoldlakehorizon.models.trading

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage

class RubyDeal : Deal(
    R.drawable.ruby128,
    "Ruby",
)
{

    override fun sell(): Boolean {

        if(Merchant.ruby().hasAmount(demand)) {

            Merchant.ruby().loseAmount(demand)
            Merchant.goldenCoins().addAmount(reward)
            return true
        }

        CurrentMessage.changeMessage(
            "Demand Not Met",
            R.drawable.ruby64,
            "You don't have enough ruby gems."
        )

        return false
    }

}