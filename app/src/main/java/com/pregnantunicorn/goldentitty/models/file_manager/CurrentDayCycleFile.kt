package com.pregnantunicorn.goldentitty.models.file_manager

import android.content.SharedPreferences
import com.google.gson.Gson
import com.pregnantunicorn.goldentitty.models.day_cycle.CurrentDayCycle
import com.pregnantunicorn.goldentitty.models.day_cycle.DayCycle

class CurrentDayCycleFile {

    companion object {

        private const val CURRENT_DAY_CYCLE = "current_day_cycle"
    }

    fun save(sharedPreferences: SharedPreferences) {

        val gson = Gson()
        val currentDayCycle = gson.toJson(CurrentDayCycle.dayCycle())

        val dayCycleStorage = sharedPreferences.edit().putString(
            CURRENT_DAY_CYCLE, currentDayCycle
        )

        dayCycleStorage.apply()
    }

    fun load(sharedPreferences: SharedPreferences) {

        val gson = Gson()

        val currentDayCycle = sharedPreferences.getString(CURRENT_DAY_CYCLE, null)

        val type = DayCycle::class.java

        CurrentDayCycle.load(gson.fromJson(currentDayCycle, type))
    }

    fun reset() {

        CurrentDayCycle.reset()
    }
}