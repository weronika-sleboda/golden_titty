package com.pregnantunicorn.merchantofgoldlakehorizon.models.shops

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.FoodBackpack
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant

class FoodShop {

    fun name() = "Food Shop"

    val products = arrayOf(

        Product("Sushi", R.drawable.sushi64, 7){

            Merchant.food()[FoodBackpack.SUSHI].addAmount(1)
        },

        Product("Ramen", R.drawable.ramen64, 12){

            Merchant.food()[FoodBackpack.RAMEN].addAmount(1)
        },

        Product("Burger", R.drawable.burger64, 18){

            Merchant.food()[FoodBackpack.BURGER].addAmount(1)
        },

        Product("Filter Coffee", R.drawable.filter_coffee64, 13){

            Merchant.food()[FoodBackpack.FILTER_COFFEE].addAmount(1)
        },

        Product("Cappuccino", R.drawable.cappuccino64, 18){

            Merchant.food()[FoodBackpack.CAPPUCCINO].addAmount(1)
        },

        Product("Sushi", R.drawable.latte64, 23){

            Merchant.food()[FoodBackpack.LATTE].addAmount(1)
        },

        Product("Coconut Water", R.drawable.coconut_water64, 10){

            Merchant.food()[FoodBackpack.COCONUT_WATER].addAmount(1)
        },

        Product("Smoothie", R.drawable.smoothie64, 15){

            Merchant.food()[FoodBackpack.SMOOTHIE].addAmount(1)
        },

        Product("Hot Chocolate", R.drawable.hot_chocolate64, 20){

            Merchant.food()[FoodBackpack.HOT_CHOCOLATE].addAmount(1)
        },

        Product("Divine Potion", R.drawable.divine_potion64, 24){

            Merchant.food()[FoodBackpack.HANDSOMENESS_POTION].addAmount(1)
        }
    )
}