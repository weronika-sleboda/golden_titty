package com.pregnantunicorn.goldentitty.models.meteor

class BodyCondition {

    companion object {

        private const val MIN_VALUE = 0
        private const val MAX_VALUE = 10
    }


    private var amount = MAX_VALUE

    fun amountToString() = "$amount/$MAX_VALUE"

    fun hasAmount(amount: Int) = this.amount >= amount
    fun amountIsMaxed() = amount == MAX_VALUE

    fun amountIsZero() = amount == 0

    fun addAmount(amount: Int) {

        this.amount += amount

        if(this.amount > MAX_VALUE) {

            this.amount = MAX_VALUE
        }
    }

    fun loseAmount(amount: Int) {

        this.amount -= amount

        if(this.amount < MIN_VALUE) {

            this.amount = MIN_VALUE
        }
    }

    fun restore() {

        amount = MAX_VALUE
    }

    fun reset() {

        amount = MAX_VALUE
    }
}