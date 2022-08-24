package com.pregnantunicorn.goldentitty.models.food

import com.pregnantunicorn.goldentitty.models.message.CurrentMessage

class Food(
    val name: String,
    val icon: Int,
    val info: String,
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

        if(this.amount >= amount) {

            removeAmount(1)
            consumeAlgorithm.invoke()
            return true
        }

        CurrentMessage.changeMessage(
            "No $name",
            icon,
            "You don't have any of these"
        )

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