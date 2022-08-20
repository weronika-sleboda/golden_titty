package com.pregnantunicorn.merchantofgoldlakehorizon.models.key_items

import com.pregnantunicorn.merchantofgoldlakehorizon.R

class KeyItem(
    val name: String,
    private val keyItemType: KeyItemType
)
{
    val icon = R.drawable.key64

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