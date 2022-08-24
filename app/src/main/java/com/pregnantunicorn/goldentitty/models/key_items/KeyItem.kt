package com.pregnantunicorn.goldentitty.models.key_items

class KeyItem(
    val icon: Int,
    val name: String,
    private val keyItemType: KeyItemType
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

    fun equip() {

        CurrentKeyItem.changeKeyItem(keyItemType)
    }
}