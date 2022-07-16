package com.pregnantunicorn.merchantofgoldlakehorizon.models.customers

import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant
import com.pregnantunicorn.merchantofgoldlakehorizon.models.npcs.CurrentNpc
import kotlin.random.Random

class Customer(
    val name: String,
    val icon: Int,
    val greeting: String,
    private val firstThankYouLine: String,
    private val secondThankYouLine: String,
    private val firstDemandNotMetLine: String,
    private val secondDemandNotMetLine: String,
    private val firstNoPersuasion: String,
    private val secondNoPersuasion: String,
    private val firstDealChanged: String,
    private val secondDealChanged: String,
    private val rewardProbability: Int,
    private val demandProbability: Int,
    private val reward: Int,
    private val demand: Int,
    private val requiredPersuasion: Int,
    private var npcIndex: Int
)
{
    private var deal = DealGenerator().generateDeal(
        demandProbability,
        demand,
        rewardProbability,
        reward
    )

    fun deal() = deal

    fun demandToString() = "In demand: ${deal.demand}"
    fun rewardToString() = "Reward: ${deal.reward}G"

    private var counter = 0

    fun generateNewDeal() {

        deal = DealGenerator().generateDeal(
            demandProbability,
            demand,
            rewardProbability,
            reward
        )
    }

    private fun thankYouLine(): String {

        counter++

        return when(counter) {

            1 -> firstThankYouLine

            else -> {

                counter = 0
                secondThankYouLine
            }
        }
    }

    private fun demandNotMetLine(): String {

        counter++

        return when(counter) {

            1 -> firstDemandNotMetLine

            else -> {

                counter = 0
                secondDemandNotMetLine
            }
        }
    }

    private fun noPersuasionLine(): String {

        counter++

        return when(counter) {

            1 -> firstNoPersuasion

            else -> {

                counter = 0
                secondNoPersuasion
            }
        }
    }

    private fun dealChangedLine(): String {

        counter++

        return when(counter) {

            1 -> firstDealChanged

            else -> {

                counter = 0
                secondDealChanged
            }
        }
    }

    private var endingLine = ""
    fun endingLine() = endingLine

    fun sell() {

        if(deal.meetsDemand(deal.demand)) {

            deal.takeReward(deal.reward)
            deal.giveAwayItems(deal.demand)
            endingLine = thankYouLine()
            CurrentNpc.npcs[npcIndex].raiseFriendship()
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