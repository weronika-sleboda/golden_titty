package com.pregnantunicorn.merchantofgoldlakehorizon.models.key_items

class KeyItem(
    val name: String,
    val icon: Int,
    private val keyItemType: KeyItemType
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

    fun equip() {

        CurrentKeyItem.changeKeyItem(keyItemType)
    }
}