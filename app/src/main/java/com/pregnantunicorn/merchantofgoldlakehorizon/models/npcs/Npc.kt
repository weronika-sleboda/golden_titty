package com.pregnantunicorn.merchantofgoldlakehorizon.models.npcs

import com.pregnantunicorn.merchantofgoldlakehorizon.models.suppliers.CurrentCustomer

class Npc(
    val name: String,
    val icon: Int,
    private val firstGreeting: String,
    private val secondGreeting: String,
    private val thirdGreeting: String,
    private val fourthGreeting: String,
    private val fifthGreeting: String,
    private val sixthGreeting: String,
    private val seventhGreeting: String,
    private val eightGreeting: String,
    private val ninthGreeting: String,
    private val tenthGreeting: String,
    private val greetingZero: String,
)
{
    private var friendship = 0
    private var counter = 0

    fun friendshipToString() = "$friendship"

    fun raiseFriendship() {

        val maxValue = 10

        if(friendship < maxValue) {

            counter++

            if(counter == 1) {

                friendship++

                counter = 0
            }
        }
    }

    fun trade() {

        CurrentCustomer.changeCustomer(CurrentCustomer.JIN)
    }

    fun greeting(): String {

        return when(friendship) {

            1 -> firstGreeting
            2 -> secondGreeting
            3 -> thirdGreeting
            4 -> fourthGreeting
            5 -> fifthGreeting
            6 -> sixthGreeting
            7 -> seventhGreeting
            8 -> eightGreeting
            9 -> ninthGreeting
            10 -> tenthGreeting

            else -> { greetingZero }
        }
    }
}