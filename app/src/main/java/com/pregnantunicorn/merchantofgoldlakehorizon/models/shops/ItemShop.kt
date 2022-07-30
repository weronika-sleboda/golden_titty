package com.pregnantunicorn.merchantofgoldlakehorizon.models.shops

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.robes.RobeCloset

class ItemShop {

    fun name() = "Merchant Hall"

    fun products(): List<Product> {

        val products = mutableListOf<Product>()

        if(!RobeCloset.robes[RobeCloset.GOLDEN_ROBE].owns()) {

            products.add(

                Product("Golden Robe", R.drawable.golden_robe64, 500) {

                    RobeCloset.robes[RobeCloset.GOLDEN_ROBE].add()
                }
            )
        }

        return products
    }
}