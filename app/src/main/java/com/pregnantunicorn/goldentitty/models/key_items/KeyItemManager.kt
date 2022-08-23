package com.pregnantunicorn.goldentitty.models.key_items

class KeyItemManager {

    fun items(): List<KeyItem> {

        val keyItems = mutableListOf<KeyItem>()

        for(keyItem in KeyItems.keyItems()) {

            if(keyItem.owns()) {

                keyItems.add(keyItem)
            }
        }

        return keyItems
    }
}