package com.pregnantunicorn.goldentitty.models.key_items

object CurrentKeyItem {

    private var keyItem: KeyItemType = KeyItemType.SHAMANIC_NECKLACE
    fun keyItemType() = keyItem

    fun keyItem(): KeyItem {

        return KeyItems.getKeyItem(keyItem)
    }

    fun changeKeyItem(keyItemType: KeyItemType) {

        keyItem = keyItemType
    }
}