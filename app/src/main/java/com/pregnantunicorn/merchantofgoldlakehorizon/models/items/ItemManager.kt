package com.pregnantunicorn.merchantofgoldlakehorizon.models.items

import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant

class ItemManager {

    fun items(): List<Item> {

        val items = mutableListOf<Item>()

        for(item in Merchant.items()) {

            if(item.owns()) {

                items.add(item)
            }
        }

        return items
    }
}