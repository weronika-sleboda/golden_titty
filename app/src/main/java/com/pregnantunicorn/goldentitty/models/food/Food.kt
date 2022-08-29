package com.pregnantunicorn.goldentitty.models.food

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.message.CurrentMessage
import com.pregnantunicorn.goldentitty.models.meteor.Meteor

class Food(
    val name: String,
    val icon: Int,
    val info: String,
    private val foodType: FoodType,
    private val conditionIsMaxed: () -> Boolean,
    private val consumeAlgorithm: () -> Unit,
)
{
    private val maxAmount = 999
    private val minAmount = 0
    private var amount = 0

    fun amountToString() = "$amount"
    fun backpackAmount() = "Amount: $amount"
    fun hasAmount(amount: Int) = this.amount >= amount
    fun amountIsMaxed() = amount == maxAmount

    fun add(amount: Int) {

        this.amount += amount

        if(this.amount > maxAmount) {

            this.amount = maxAmount
        }
    }

    fun removeAmount(amount: Int) {

        this.amount -= amount

        if(this.amount < minAmount) {

            this.amount = minAmount
        }
    }

    fun consume(): Boolean {

        val amount = 1

        if(this.amount >= amount && !conditionIsMaxed.invoke()) {

            removeAmount(1)
            consumeAlgorithm.invoke()
            return true
        }

        else if(this.amount == 0) {

            CurrentMessage.changeMessage(
                "No $name",
                icon,
                "You don't have any of these"
            )

            return false
        }

        else if(foodType == FoodType.FISH || foodType == FoodType.FRIED_FISH || foodType == FoodType.COCONUT) {

            if(Meteor.health().amountIsMaxed()) {

                CurrentMessage.changeMessage(
                    "Full Health",
                    R.drawable.health64,
                    "Your health is already full."
                )

                return false
            }
        }

        else if(foodType == FoodType.COCONUT_WATER) {

            if(Meteor.energy().amountIsMaxed()) {

                CurrentMessage.changeMessage(
                    "Full Energy",
                    R.drawable.energy64,
                    "Your energy is already full."
                )

                return false
            }
        }

        return false
    }

    fun reset() {

        amount = 0
    }

    fun load(amount: Int) {

        this.amount = amount
    }

    fun amount() = amount
}