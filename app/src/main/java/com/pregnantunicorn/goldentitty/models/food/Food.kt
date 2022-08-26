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
    private var amount = maxAmount

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

        if(foodType == FoodType.FISH || foodType == FoodType.FRIED_FISH) {

            if(Meteor.health().amountIsMaxed()) {

                CurrentMessage.changeMessage(
                    "Full Health",
                    R.drawable.health64,
                    "Your health is already full."
                )
            }
        }

        else if(foodType == FoodType.COCONUT || foodType == FoodType.COCONUT_WATER) {

            if(Meteor.energy().amountIsMaxed()) {

                CurrentMessage.changeMessage(
                    "Full Energy",
                    R.drawable.health64,
                    "Your energy is already full."
                )
            }
        }

        else {

            CurrentMessage.changeMessage(
                "No $name",
                icon,
                "You don't have any of these"
            )
        }

        return false
    }

    fun resetAmount() {

        amount = 0
    }

    fun setAmount(amount: Int) {

        this.amount = amount
    }

    fun amount() = amount
}