package com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.dialog_messages.DialogMessage

class Food(
    val name: String,
    val icon: Int,
    val info: String,
    private val restorationAlgorithm: () -> Unit,
    private val restorationIsMax: () -> Boolean,
    private val maxStatusMessage: DialogMessage,
    val statusUpdateType: StatusUpdateType
)
{

    companion object {

        private const val MIN_VALUE = 0
        private const val MAX_VALUE = 999
    }

    private var amount = 0

    fun amountToString() = "Amount: $amount"

    fun hasAmount(amount: Int) = this.amount >= amount

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

    fun dialogMessage(): DialogMessage {

        return if(amount == 0) {

            DialogMessage(
                "Empty backpack",
                icon,
                "You don't have any of these in your backpack."
            )
        }

        else {

            maxStatusMessage
        }
    }

    fun consume(): Boolean {

        if(amount > 0 && !restorationIsMax()) {

            loseAmount()
            restorationAlgorithm.invoke()
            return true
        }

        return false
    }

}