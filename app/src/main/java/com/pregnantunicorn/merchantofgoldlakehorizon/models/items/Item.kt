package com.pregnantunicorn.merchantofgoldlakehorizon.models.items

class Item(
    val name: String,
    val icon: Int,
)
{
    private var owns = true

    fun owns() = owns

    fun add() {

        owns = true
    }

    fun remove() {

        owns  = false
    }
}