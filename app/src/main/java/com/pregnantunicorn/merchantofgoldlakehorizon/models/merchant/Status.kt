package com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant

class Status {

    companion object {

        private const val MAX_VALUE = 99
        private const val MIN_VALUE = 0
    }

    private var maxAmount = 99
    private var amount = maxAmount

    fun amountToString() = "$amount/$maxAmount"

    fun hasAmount(amount: Int) = this.amount >= amount
    fun amountIsMaxed() = amount == maxAmount

    fun addMaxAmount(amount: Int) {

        maxAmount += amount

        if(this.maxAmount > MAX_VALUE) {

            this.maxAmount = MAX_VALUE
        }
    }

    fun addAmount(amount: Int) {

        this.amount += amount

        if(this.amount > maxAmount) {

            this.amount = maxAmount
        }
    }

    fun loseAmount(amount: Int) {

        this.amount -= amount

        if(this.amount < MIN_VALUE) {

            this.amount = MIN_VALUE
        }
    }

    fun restore() {

        amount = maxAmount
    }

    fun reset() {

        maxAmount = 10
        amount = maxAmount
    }
}