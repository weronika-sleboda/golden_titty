package com.pregnantunicorn.merchantofgoldlakehorizon.models.items

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant

object CurrentItem {

    private var item = ItemType.NONE
    fun item() = item

    fun changeItem(itemType: ItemType) {

        item = itemType
    }

    fun removeItem(itemIndex: Int, itemType: ItemType) {

        Merchant.items()[itemIndex].remove()

        if(item == itemType) {

            changeItem(ItemType.NONE)
        }
    }

    fun fabIcon(): Int {

        return when(item) {

            ItemType.NONE -> R.drawable.grab64
            ItemType.DI_BEDROOM_KEY -> R.drawable.di_bedroom_key64
        }
    }
}