package com.pregnantunicorn.merchantofgoldlakehorizon.models.books

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage

class Book(
    val title: String,
    val content: String,
)
{
    private val requiredIntelligence = 5
    private var hasBeenRead: Boolean = false

    fun hasBeenRead() = hasBeenRead

    fun read(): Boolean {

        if(Merchant.intelligence().hasAmount(requiredIntelligence)) {

            Merchant.intelligence().loseAmount(requiredIntelligence)
            hasBeenRead = true
            return true
        }

        CurrentMessage.changeMessage(
            "No Intelligence", R.drawable.intelligence64, "You don't have enough intelligence."
        )

        return false
    }
}