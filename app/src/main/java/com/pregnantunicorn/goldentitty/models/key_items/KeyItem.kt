package com.pregnantunicorn.goldentitty.models.key_items

import com.pregnantunicorn.goldentitty.models.tools.CurrentHandState
import com.pregnantunicorn.goldentitty.models.tools.HandState

class KeyItem(
    val icon: Int,
    val name: String,
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

        CurrentHandState.changeHandState(HandState.KEY_ITEM)
        CurrentKeyItem.changeKeyItem(keyItemType)
    }
}