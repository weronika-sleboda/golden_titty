package com.pregnantunicorn.goldentitty.models.file_manager

import android.content.SharedPreferences
import com.google.gson.Gson
import com.pregnantunicorn.goldentitty.models.food.Foods

class FoodFile {

    companion object {

        private const val FOODS = "foods"
    }

    fun save(sharedPreferences: SharedPreferences) {

        val gson = Gson()
        val foods = gson.toJson(Foods.foodAmounts())

        val foodStorage = sharedPreferences.edit().putString(
            FOODS, foods
        )

        foodStorage.apply()
    }

    fun load(sharedPreferences: SharedPreferences) {

        val gson = Gson()

        val foods = sharedPreferences.getString(FOODS, null)
        val type = IntArray::class.java

        Foods.load(gson.fromJson(foods, type))
    }

    fun reset() {

        Foods.reset()
    }
}