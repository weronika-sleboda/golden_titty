package com.pregnantunicorn.merchantofgoldlakehorizon.models.trading_house

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.dialog_messages.DialogMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.GemUpdateType
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant

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

        return false
    }

    override fun dialogMessage(): DialogMessage {

        return DialogMessage(
            "Demand Not Met",
            R.drawable.ruby64,
            "You don't have the demanded amount of ruby."
        )
    }
}