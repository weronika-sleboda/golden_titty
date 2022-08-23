package com.pregnantunicorn.goldentitty.models.key_items

object CurrentKeyItem {

    private var keyItem: KeyItemType = KeyItemType.FIRST_FLOOR
    fun keyItemType() = keyItem

    fun keyItem(): KeyItem {

        return KeyItems.getKeyItem(keyItem)
    }

    fun changeKeyItem(keyItemType: KeyItemType) {

        keyItem = keyItemType
    }
}