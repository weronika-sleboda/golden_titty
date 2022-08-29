package com.pregnantunicorn.goldentitty.models.file_manager

import android.content.SharedPreferences
import com.google.gson.Gson
import com.pregnantunicorn.goldentitty.models.tools.CurrentHandState
import com.pregnantunicorn.goldentitty.models.tools.HandState

class CurrentHandStateFile {

    companion object {

        private const val CURRENT_HAND_STATE = "current_hand_state"
    }

    fun save(sharedPreferences: SharedPreferences) {

        val gson = Gson()
        val currentHandState = gson.toJson(CurrentHandState.handState())

        val handStateStorage = sharedPreferences.edit().putString(
            CURRENT_HAND_STATE, currentHandState
        )

       handStateStorage.apply()
    }

    fun load(sharedPreferences: SharedPreferences) {

        val gson = Gson()

        val currentHandState = sharedPreferences.getString(CURRENT_HAND_STATE, null)

        val type = HandState::class.java

        CurrentHandState.load(gson.fromJson(currentHandState, type))
    }

    fun reset() {

        CurrentHandState.reset()
    }
}