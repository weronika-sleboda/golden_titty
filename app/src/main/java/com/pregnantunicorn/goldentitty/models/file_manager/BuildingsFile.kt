package com.pregnantunicorn.goldentitty.models.file_manager

import android.content.SharedPreferences
import com.google.gson.Gson
import com.pregnantunicorn.goldentitty.models.construction.BuildingType
import com.pregnantunicorn.goldentitty.models.construction.Buildings
import com.pregnantunicorn.goldentitty.models.construction.CurrentBuilding

class BuildingsFile {

    companion object {

        private const val BUILDINGS = "buildings"
        private const val CURRENT_BUILDING = "current_building"
    }

    fun save(sharedPreferences: SharedPreferences) {

        val gson = Gson()
        val buildings = gson.toJson(Buildings.buildingsBuilt())
        val currentBuilding = gson.toJson(CurrentBuilding.buildingType())

        val buildingsStorage = sharedPreferences.edit().putString(
            BUILDINGS, buildings
        )

        val currentBuildingStorage = sharedPreferences.edit().putString(
            CURRENT_BUILDING, currentBuilding
        )

        buildingsStorage.apply()
        currentBuildingStorage.apply()
    }

    fun load(sharedPreferences: SharedPreferences) {

        val gson = Gson()

        val buildings = sharedPreferences.getString(BUILDINGS, null)
        val currentBuilding = sharedPreferences.getString(CURRENT_BUILDING, null)

        val buildingsType = BooleanArray::class.java
        val currentBuildingType = BuildingType::class.java

        Buildings.load(gson.fromJson(buildings, buildingsType))
        CurrentBuilding.load(gson.fromJson(currentBuilding, currentBuildingType))
    }

    fun reset() {

        Buildings.reset()
    }
}