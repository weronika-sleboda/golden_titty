package com.pregnantunicorn.merchantofgoldlakehorizon.models.customers

import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant
import com.pregnantunicorn.merchantofgoldlakehorizon.models.npcs.CurrentNpc
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.dialogues.JinDialogs
import kotlin.random.Random

class Customer(
    val name: String,
    val icon: Int,
    val greeting: String,
    private val thankYouLine: () -> String,
    private val demandNotMetLine: () -> String,
    private val noPersuasionLine: () -> String,
    private val dealChangedLine: () -> String,
    private val requiredPersuasion: Int,
    private var friendIndex: Int
)
{
    private var deal = DealGenerator().generateDeal()

    fun deal() = deal

    fun demandToString() = "In demand: ${deal.demand}"
    fun rewardToString() = "Reward: ${deal.reward}G"

    private var counter = 0

    private fun generateNewDeal() {

        deal = DealGenerator().generateDeal()
    }

    private fun thankYouLine() = thankYouLine.invoke()
    private fun demandNotMetLine() = demandNotMetLine.invoke()
    private fun noPersuasionLine() = noPersuasionLine.invoke()
    private fun dealChangedLine() = dealChangedLine.invoke()

    private var endingLine = ""
    fun endingLine() = endingLine

    fun sell() {

        if(deal.meetsDemand(deal.demand)) {

            deal.takeReward(deal.reward)
            deal.giveAwayItems(deal.demand)
            endingLine = thankYouLine()
            Merchant.friends()[friendIndex].raiseFriendship()
            generateNewDeal()
        }

        else if(!deal.meetsDemand(deal.demand)) {

            endingLine = demandNotMetLine()
        }
    }

    fun changeDeal() {

        endingLine = if(Merchant.persuasion().hasAmount(requiredPersuasion)) {

            Merchant.persuasion().loseAmount(requiredPersuasion)
            generateNewDeal()
            dealChangedLine()
        }

        else {

            noPersuasionLine()
        }
    }
}