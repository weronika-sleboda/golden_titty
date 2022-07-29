package com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant

class Gem {

    companion object {

        private const val MIN_VALUE = 0
        private const val MAX_VALUE = 999
    }

    private var amount = 0

    fun amountToString() = "$amount"

    fun hasAmount(amount: Int) = this.amount >= amount

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

    fun reset() {

        amount = 0
    }

}