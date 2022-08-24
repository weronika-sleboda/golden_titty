package com.pregnantunicorn.goldentitty.models.npcs

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.food.FoodType
import com.pregnantunicorn.goldentitty.models.food.Foods
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

    private var hasHouse = false
    fun hasHouse() = hasHouse

    fun moveToHouse() {

        hasHouse = true
    }

    private val maxHealth = 10
    private val minValue = 0
    private var health = maxHealth

    fun requiredFoodIcon(): Int {

        return if(!hasHouse) {

            R.drawable.fish32
        }

        else { R.drawable.fried_fish32 }
    }

    fun maxHealth() = maxHealth
    fun health() = health

    private fun addHealth(amount: Int) {

        health += amount

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

        if(health != maxHealth) {

            val amount = 1

            if(hasHouse) {

                if(Foods.food(FoodType.FRIED_FISH).hasAmount(amount)) {

                    Foods.food(FoodType.FRIED_FISH).removeAmount(amount)
                    addHealth(3)
                    return true
                }

                CurrentMessage.changeMessage(
                    "No Fried Fish",
                    R.drawable.fried_fish64,
                    "You don't have any of these."
                )

                return false
            }

            if(!hasHouse) {

                if(Foods.food(FoodType.FISH).hasAmount(amount)) {

                    Foods.food(FoodType.FISH).removeAmount(amount)
                    addHealth(1)
                    return true
                }

                CurrentMessage.changeMessage(
                    "No Fish",
                    R.drawable.fish64,
                    "You don't have any of these."
                )

                return false
            }
        }

        return false
    }

}