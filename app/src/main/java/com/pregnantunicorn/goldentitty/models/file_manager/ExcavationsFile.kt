package com.pregnantunicorn.goldentitty.models.file_manager

import android.content.SharedPreferences
import com.google.gson.Gson
import com.pregnantunicorn.goldentitty.models.construction.BuildingType
import com.pregnantunicorn.goldentitty.models.construction.Buildings
import com.pregnantunicorn.goldentitty.models.construction.CurrentBuilding
import com.pregnantunicorn.goldentitty.models.excavation.CurrentExcavationSite
import com.pregnantunicorn.goldentitty.models.excavation.ExcavationNumber
import com.pregnantunicorn.goldentitty.models.excavation.ExcavationTile

class ExcavationsFile {

    companion object {

        private const val EXCAVATED_SITES = "excavation_sites"
        private const val KEY_POSITIONS = "key_positions"
        private const val EXCAVATION_AREAS = "excavation_areas"
        private const val EXCAVATION_NUMBER = "excavation_number"
    }

    fun save(sharedPreferences: SharedPreferences) {

        val gson = Gson()
        val excavatedSites = gson.toJson(CurrentExcavationSite.excavatedSites())
        val keyPositions = gson.toJson(CurrentExcavationSite.keyPositions())
        val excavationAreas = gson.toJson(CurrentExcavationSite.excavationAreas())
        val excavationNumber = gson.toJson(CurrentExcavationSite.excavationNumber())

        val excavatedStorage = sharedPreferences.edit().putString(
            EXCAVATED_SITES, excavatedSites
        )

        excavatedStorage.apply()

        val keyPositionStorage = sharedPreferences.edit().putString(
            KEY_POSITIONS, keyPositions
        )

        keyPositionStorage.apply()

        val areas = sharedPreferences.edit().putString(
            EXCAVATION_AREAS, excavationAreas
        )

        areas.apply()

        val numberStorage = sharedPreferences.edit().putString(
            EXCAVATION_NUMBER, excavationNumber
        )

        numberStorage.apply()
    }

    fun load(sharedPreferences: SharedPreferences) {

        val gson = Gson()

        val excavatedSites = sharedPreferences.getString(EXCAVATED_SITES, null)
        val keyPositions = sharedPreferences.getString(KEY_POSITIONS, null)
        val excavationAreas = sharedPreferences.getString(EXCAVATION_AREAS, null)
        val excavationNumber = sharedPreferences.getString(EXCAVATION_NUMBER, null)

        val excavatedType = BooleanArray::class.java
        val keyPositionType = IntArray::class.java
        val areasType = Array<Array<ExcavationTile>>::class.java
        val numberType = ExcavationNumber::class.java

        CurrentExcavationSite.load(
            gson.fromJson(excavationAreas, areasType),
            gson.fromJson(keyPositions, keyPositionType),
            gson.fromJson(excavatedSites, excavatedType),
            gson.fromJson(excavationNumber,  numberType)
        )
    }

    fun reset() {

        CurrentExcavationSite.reset()
    }
}