package com.pregnantunicorn.goldentitty.models.file_manager

import android.content.SharedPreferences
import com.google.gson.Gson
import com.pregnantunicorn.goldentitty.models.entrances.CurrentEntrance

class EntrancesFile {

    companion object {

        private const val CURRENT_ENTRANCE_INDEX = "current_entrance_index"
    }

    fun save(sharedPreferences: SharedPreferences) {

        val gson = Gson()
        val entranceIndex = gson.toJson(CurrentEntrance.entranceIndex())

        val entranceStorage = sharedPreferences.edit().putString(
            CURRENT_ENTRANCE_INDEX, entranceIndex
        )

        entranceStorage.apply()
    }

    fun load(sharedPreferences: SharedPreferences) {

        val gson = Gson()

        val entranceIndex = sharedPreferences.getString(CURRENT_ENTRANCE_INDEX, null)
        val type = Int::class.java

        CurrentEntrance.loadCurrentEntrance(gson.fromJson(entranceIndex, type))
    }

}