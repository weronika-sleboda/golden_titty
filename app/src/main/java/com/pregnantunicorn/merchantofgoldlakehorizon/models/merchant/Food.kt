package com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant

class Food(
    val name: String,
    val icon: Int,
    val info: String,
    private val restorationAlgorithm: () -> Unit,
    private val restorationIsMax: () -> Boolean,
    val statusUpdateType: StatusUpdateType,
    val changeMessage: () -> Unit
)
{

    companion object {

        private const val MIN_VALUE = 0
        private const val MAX_VALUE = 999
    }

    private var amount = 0

    fun amountToString() = "Amount: $amount"

    fun hasAmount(amount: Int) = this.amount >= amount

    fun isEmpty() = amount == 0

    fun addAmount(amount: Int) {

        this.amount += amount

        if(this.amount > MAX_VALUE) {

            this.amount = MAX_VALUE
        }
    }

    private fun loseAmount() {

        this.amount--

        if(this.amount < MIN_VALUE) {

            this.amount = MIN_VALUE
        }
    }

    fun consume(): Boolean {

        if(amount > 0 && !restorationIsMax()) {

            loseAmount()
            restorationAlgorithm.invoke()
            return true
        }

        changeMessage.invoke()
        return false
    }

    fun reset() {

        amount = 0
    }

}