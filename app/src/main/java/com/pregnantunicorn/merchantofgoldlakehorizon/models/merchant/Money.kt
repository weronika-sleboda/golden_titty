package com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant

class Money()
{

    companion object {

        private const val MIN_VALUE = 0
        private const val MAX_VALUE = 99999
    }

    private var amount = 100

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