package com.pregnantunicorn.goldentitty.models.file_manager

import android.content.SharedPreferences
import com.google.gson.Gson
import com.pregnantunicorn.goldentitty.models.construction.BuildingType
import com.pregnantunicorn.goldentitty.models.construction.Buildings
import com.pregnantunicorn.goldentitty.models.construction.CurrentBuilding
import com.pregnantunicorn.goldentitty.models.story_line.CurrentEvent
import com.pregnantunicorn.goldentitty.models.story_line.EventTitle

class StoryLineFile {

    companion object {

        private const val CURRENT_EVENT = "current_event"
    }

    fun save(sharedPreferences: SharedPreferences) {

        val gson = Gson()
        val eventTitle = gson.toJson(CurrentEvent.eventTitle())

        val eventStorage = sharedPreferences.edit().putString(
            CURRENT_EVENT, eventTitle
        )

        eventStorage.apply()
    }

    fun load(sharedPreferences: SharedPreferences) {

        val gson = Gson()

        val currentEvent = sharedPreferences.getString(CURRENT_EVENT, null)
        val eventType = EventTitle::class.java

        CurrentEvent.load(gson.fromJson(currentEvent, eventType))
    }

    fun reset() {

        CurrentEvent.reset()
    }
}