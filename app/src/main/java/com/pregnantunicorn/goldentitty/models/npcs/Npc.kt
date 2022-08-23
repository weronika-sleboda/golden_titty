package com.pregnantunicorn.goldentitty.models.npcs

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.message.CurrentMessage
import com.pregnantunicorn.goldentitty.models.player.Player
import com.pregnantunicorn.goldentitty.models.player.Status
import kotlin.math.max

class Npc(
    val name: String,
    val icon: Int,
    val greeting: () -> String,
    val afterMeal: () -> String,
    val isFedLine:() -> String,
)
{

    private val maxHealth = 10
    private val minValue = 0
    private var health = maxHealth

    fun maxHealth() = maxHealth
    fun health() = health

    private fun addHealth() {

        health++

        if(health > maxHealth) {

            health = maxHealth
        }
    }

    fun loseHealth() {

        health--

        if(health < minValue) {

            health = minValue
        }
    }

    fun isDead() = health == 0

    fun isFed() = health == maxHealth

    fun feed(): Boolean {

        if(Player.coconuts().hasAmount(1)) {

            addHealth()
            return true
        }

        CurrentMessage.changeMessage(
            "No Coconuts",
            R.drawable.coconut64,
            "You don't have any of these."
        )

        return false
    }
}