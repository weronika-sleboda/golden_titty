package com.pregnantunicorn.goldentitty.models.file_manager

import android.content.SharedPreferences
import com.google.gson.Gson
import com.pregnantunicorn.goldentitty.models.chidinmas_statue.ChidinmasStatue

class ChidinmaStatueFile {

    companion object {

        private const val EMERALD_INSERTED = "emerald_inserted"
        private const val RUBY_INSERTED = "ruby_inserted"
        private const val SAPPHIRE_INSERTED = "sapphire_inserted"
    }

    fun save(sharedPreferences: SharedPreferences) {

        val gson = Gson()
        val emeraldInserted = gson.toJson(ChidinmasStatue().emeraldInserted())
        val rubyInserted = gson.toJson(ChidinmasStatue().rubyInserted())
        val sapphireInserted = gson.toJson(ChidinmasStatue().sapphireInserted())

        val emeraldStorage = sharedPreferences.edit().putString(
            EMERALD_INSERTED, emeraldInserted
        )

        emeraldStorage.apply()

        val rubyStorage = sharedPreferences.edit().putString(
            RUBY_INSERTED, rubyInserted
        )

        rubyStorage.apply()

        val sapphireStorage = sharedPreferences.edit().putString(
            SAPPHIRE_INSERTED, sapphireInserted
        )

        sapphireStorage.apply()
    }

    fun load(sharedPreferences: SharedPreferences) {

        val gson = Gson()

        val emeraldInserted = sharedPreferences.getString(EMERALD_INSERTED, null)
        val rubyInserted = sharedPreferences.getString(RUBY_INSERTED, null)
        val sapphireInserted = sharedPreferences.getString(SAPPHIRE_INSERTED, null)

        val type = Boolean::class.java

        ChidinmasStatue().load(
            gson.fromJson(emeraldInserted, type),
            gson.fromJson(rubyInserted, type),
            gson.fromJson(sapphireInserted, type)
        )
    }

    fun reset() {

        ChidinmasStatue().reset()
    }
}