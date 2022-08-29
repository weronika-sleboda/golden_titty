package com.pregnantunicorn.goldentitty.models.file_manager

import android.content.SharedPreferences
import com.google.gson.Gson
import com.pregnantunicorn.goldentitty.models.construction.BuildingType
import com.pregnantunicorn.goldentitty.models.construction.Buildings
import com.pregnantunicorn.goldentitty.models.construction.CurrentBuilding
import com.pregnantunicorn.goldentitty.models.resources.Resources

class ResourcesFile {

    companion object {

        private const val IRON = "iron"
        private const val WOOD = "wood"
    }

    fun save(sharedPreferences: SharedPreferences) {

        val gson = Gson()
        val iron = gson.toJson(Resources.iron().amount())
        val wood = gson.toJson(Resources.wood().amount())

        val ironStorage = sharedPreferences.edit().putString(
            IRON, iron
        )

        val woodStorage = sharedPreferences.edit().putString(
            WOOD, wood
        )

        ironStorage.apply()
        woodStorage.apply()
    }

    fun load(sharedPreferences: SharedPreferences) {

        val gson = Gson()

        val iron = sharedPreferences.getString(IRON, null)
        val wood = sharedPreferences.getString(WOOD, null)

        val type = Int::class.java

        Resources.load(
            gson.fromJson(iron, type),
            gson.fromJson(wood, type)
        )

    }

    fun reset() {

        Resources.reset()
    }
}