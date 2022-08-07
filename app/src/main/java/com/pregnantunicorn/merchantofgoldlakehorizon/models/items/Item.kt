package com.pregnantunicorn.merchantofgoldlakehorizon.models.items

class Item(
    val name: String,
    val icon: Int,
    val itemType: ItemType,
)
{
    private var owns = false

    fun owns() = owns

    fun add() {

        owns = true
    }

    fun remove() {

        owns  = false
    }
}