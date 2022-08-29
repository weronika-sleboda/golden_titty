package com.pregnantunicorn.goldentitty.models.file_manager

import android.content.SharedPreferences
import com.google.gson.Gson
import com.pregnantunicorn.goldentitty.models.meteor.Meteor

class MeteorStatusFile {

    companion object {

        private const val HEALTH = "health"
        private const val ENERGY = "energy"
    }

    fun save(sharedPreferences: SharedPreferences) {

        val gson = Gson()
        val health = gson.toJson(Meteor.health().amount())
        val energy = gson.toJson(Meteor.energy().amount())

        val healthStorage = sharedPreferences.edit().putString(
            HEALTH, health
        )

        val energyStorage = sharedPreferences.edit().putString(
            ENERGY, energy
        )

        healthStorage.apply()
        energyStorage.apply()
    }

    fun load(sharedPreferences: SharedPreferences) {

        val gson = Gson()

        val health = sharedPreferences.getString(HEALTH, null)
        val energy = sharedPreferences.getString(ENERGY, null)

        val type = Int::class.java

        Meteor.loadStatus(
            gson.fromJson(health, type),
            gson.fromJson(energy, type)
        )
    }

    fun reset() {

        Meteor.reset()
    }
}