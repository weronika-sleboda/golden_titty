package com.pregnantunicorn.merchantofgoldlakehorizon.models.books

import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant

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

        return false
    }
}