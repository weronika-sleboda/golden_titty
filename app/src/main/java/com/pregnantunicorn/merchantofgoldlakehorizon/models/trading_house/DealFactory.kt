package com.pregnantunicorn.merchantofgoldlakehorizon.models.trading_house

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.dialog_messages.DialogMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant
import kotlin.random.Random

object DealFactory {

    private fun randomDeal(): Deal {

        return when(Random.nextInt(3)) {

            0 -> EmeraldDeal()
            1 -> SapphireDeal()

            else -> { RubyDeal() }
        }
    }

    private var deal = randomDeal()
    fun deal() = deal

    fun changeDeal(): Boolean {

        if(Merchant.persuasion().hasAmount(1)) {

            Merchant.persuasion().loseAmount(1)
            deal = randomDeal()
            return true
        }

        return false
    }

    fun generateNewDeal() {

        deal = randomDeal()
    }

    fun dialogMessage(): DialogMessage {

        return DialogMessage(
            "No Persuasion",
            R.drawable.persuasion64,
            "You don't have enough persuasion to change the deal."
        )
    }
}