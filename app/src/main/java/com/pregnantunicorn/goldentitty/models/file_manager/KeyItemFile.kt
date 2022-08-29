package com.pregnantunicorn.goldentitty.models.file_manager

import android.content.SharedPreferences
import com.google.gson.Gson
import com.pregnantunicorn.goldentitty.models.construction.BuildingType
import com.pregnantunicorn.goldentitty.models.construction.Buildings
import com.pregnantunicorn.goldentitty.models.construction.CurrentBuilding
import com.pregnantunicorn.goldentitty.models.key_items.CurrentKeyItem
import com.pregnantunicorn.goldentitty.models.key_items.KeyItemType
import com.pregnantunicorn.goldentitty.models.key_items.KeyItems

class KeyItemFile {

    companion object {

        private const val KEY_ITEMS = "key_items"
        private const val CURRENT_KEY_ITEM = "current_key_item"
    }

    fun save(sharedPreferences: SharedPreferences) {

        val gson = Gson()
        val keyItems = gson.toJson(KeyItems.keyItemsOwns())
        val currentKeyItem = gson.toJson(CurrentKeyItem.keyItemType())

        val keyItemsStorage = sharedPreferences.edit().putString(
            KEY_ITEMS, keyItems
        )

        keyItemsStorage.apply()

        val currentKeyItemStorage = sharedPreferences.edit().putString(
            CURRENT_KEY_ITEM, currentKeyItem
        )

        currentKeyItemStorage.apply()
    }

    fun load(sharedPreferences: SharedPreferences) {

        val gson = Gson()

        val keyItems = sharedPreferences.getString(KEY_ITEMS, null)
        val currentKeyItem = sharedPreferences.getString(CURRENT_KEY_ITEM, null)

        val keyItemsType = BooleanArray::class.java
        val currentKeyItemType = KeyItemType::class.java

        KeyItems.load(gson.fromJson(keyItems, keyItemsType))
        CurrentKeyItem.load(gson.fromJson(currentKeyItem, currentKeyItemType))
    }

    fun reset() {

        KeyItems.reset()
    }
}