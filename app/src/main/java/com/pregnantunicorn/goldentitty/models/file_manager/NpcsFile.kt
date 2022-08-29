package com.pregnantunicorn.goldentitty.models.file_manager

import android.content.SharedPreferences
import com.google.gson.Gson
import com.pregnantunicorn.goldentitty.models.construction.BuildingType
import com.pregnantunicorn.goldentitty.models.construction.Buildings
import com.pregnantunicorn.goldentitty.models.construction.CurrentBuilding
import com.pregnantunicorn.goldentitty.models.npcs.LadySilvia

class NpcsFile {

    companion object {

        private const val LADY_SILVIA_HEALTH = "lady_silvia_health"
        private const val SILVIA_HAS_HOUSE = "silvia_has_house"
    }

    fun save(sharedPreferences: SharedPreferences) {

        val gson = Gson()
        val ladySilviaHealth = gson.toJson(LadySilvia.ladySilvia().health())
        val silviaHasHouse = gson.toJson(LadySilvia.ladySilvia().hasHouse())

        val ladySilviaHealthStorage = sharedPreferences.edit().putString(
            LADY_SILVIA_HEALTH, ladySilviaHealth
        )

        val silviaHasHouseStorage = sharedPreferences.edit().putString(
            SILVIA_HAS_HOUSE, silviaHasHouse
        )

        ladySilviaHealthStorage.apply()
        silviaHasHouseStorage.apply()
    }

    fun load(sharedPreferences: SharedPreferences) {

        val gson = Gson()

        val ladySilviaHealth = sharedPreferences.getString(LADY_SILVIA_HEALTH, null)
        val silviaHasHouse = sharedPreferences.getString(SILVIA_HAS_HOUSE, null)

        val ladySilviaHealthType = Int::class.java
        val silviaHasHouseType = Boolean::class.java

        LadySilvia.ladySilvia().load(
            gson.fromJson(ladySilviaHealth, ladySilviaHealthType),
            gson.fromJson(silviaHasHouse, silviaHasHouseType)
        )
    }

    fun reset() {

        LadySilvia.ladySilvia().reset()
    }
}