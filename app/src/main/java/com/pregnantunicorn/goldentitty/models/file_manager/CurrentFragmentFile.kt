package com.pregnantunicorn.goldentitty.models.file_manager

import android.content.SharedPreferences
import com.google.gson.Gson
import com.pregnantunicorn.goldentitty.models.current_fragment.CurrentFragment
import com.pregnantunicorn.goldentitty.models.current_fragment.FragmentType

class CurrentFragmentFile {

    companion object {

        private const val CURRENT_FRAGMENT = "current_fragment"
    }

    fun save(sharedPreferences: SharedPreferences) {

        val gson = Gson()
        val currentFragment = gson.toJson(CurrentFragment.currentFragment())

        val fragmentStorage = sharedPreferences.edit().putString(
            CURRENT_FRAGMENT, currentFragment
        )

        fragmentStorage.apply()
    }

    fun load(sharedPreferences: SharedPreferences) {

        val gson = Gson()

        val currentFragment = sharedPreferences.getString(CURRENT_FRAGMENT, null)

        val type = FragmentType::class.java

        CurrentFragment.load(gson.fromJson(currentFragment, type))
    }

    fun reset() {

        CurrentFragment.reset()
    }
}