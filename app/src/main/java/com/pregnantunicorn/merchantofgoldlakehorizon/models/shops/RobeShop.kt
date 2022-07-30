package com.pregnantunicorn.merchantofgoldlakehorizon.models.shops

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.robes.RobeCloset

class RobeShop {

    fun name() = "Green House"

    fun products(): List<Product> {

        val products = mutableListOf<Product>()

        if(!RobeCloset.robes[RobeCloset.GOLDEN_ROBE].owns()) {

            products.add(

                Product("Golden Robe", R.drawable.golden_robe64, 500) {

                    RobeCloset.robes[RobeCloset.GOLDEN_ROBE].add()
                }
            )
        }

        if(!RobeCloset.robes[RobeCloset.SILVER_ROBE].owns()) {

            products.add(

                Product("Silver Robe", R.drawable.silver_robe64,420) {

                    RobeCloset.robes[RobeCloset.SILVER_ROBE].add()
                }
            )
        }


        if(!RobeCloset.robes[RobeCloset.BROWN_ROBE].owns()) {

            products.add(

                Product("Brown Robe", R.drawable.brown_robe64, 150) {

                    RobeCloset.robes[RobeCloset.BROWN_ROBE].add()
                }
            )
        }

        if(!RobeCloset.robes[RobeCloset.GREEN_ROBE].owns()) {

            products.add(

                Product("Green Robe", R.drawable.green_robe64, 350) {

                    RobeCloset.robes[RobeCloset.GREEN_ROBE].add()
                }
            )
        }

        if(!RobeCloset.robes[RobeCloset.BLUE_ROBE].owns()) {

            products.add(

                Product("Blue Robe", R.drawable.blue_robe64, 370) {

                    RobeCloset.robes[RobeCloset.BLUE_ROBE].add()
                }
            )
        }

        if(!RobeCloset.robes[RobeCloset.PINK_ROBE].owns()) {

            products.add(

                Product("Pink Robe", R.drawable.pink_robe64,200) {

                    RobeCloset.robes[RobeCloset.PINK_ROBE].add()
                }
            )
        }

        return products
    }
}