package com.pregnantunicorn.merchantofgoldlakehorizon.models.trading

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
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

        val persuasion = 5

        if(Merchant.persuasion().hasAmount(persuasion)) {
            Merchant.persuasion().loseAmount(persuasion)
            deal = randomDeal()
            return true
        }

        CurrentMessage.changeMessage(
            "No Persuasion",
            R.drawable.persuasion64,
            "You don't have enough persuasion to change the deal."
        )
        return false
    }

    fun generateNewDeal() {

        deal = randomDeal()
    }
}