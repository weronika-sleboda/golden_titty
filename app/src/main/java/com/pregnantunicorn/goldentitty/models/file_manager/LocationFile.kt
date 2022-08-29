package com.pregnantunicorn.goldentitty.models.file_manager

import android.content.SharedPreferences
import com.google.gson.Gson
import com.pregnantunicorn.goldentitty.models.tools.CurrentHandState
import com.pregnantunicorn.goldentitty.models.tools.HandState
import com.pregnantunicorn.goldentitty.models.world_map.world.CurrentLocation
import com.pregnantunicorn.goldentitty.models.world_map.world.LocationName

class LocationFile {

    companion object {

        private const val CURRENT_LOCATION = "current_location"
    }

    fun save(sharedPreferences: SharedPreferences) {

        val gson = Gson()
        val currentLocation = gson.toJson(CurrentLocation.locationName())

        val locationStorage = sharedPreferences.edit().putString(
            CURRENT_LOCATION, currentLocation
        )

        locationStorage.apply()
    }

    fun load(sharedPreferences: SharedPreferences) {

        val gson = Gson()

        val currentLocation = sharedPreferences.getString(CURRENT_LOCATION, null)

        val type = LocationName::class.java

        CurrentLocation.load(gson.fromJson(currentLocation, type))
    }

    fun reset() {

        CurrentLocation.reset()
    }
}