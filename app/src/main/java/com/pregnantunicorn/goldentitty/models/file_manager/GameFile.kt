package com.pregnantunicorn.goldentitty.models.file_manager

import android.content.SharedPreferences
import com.google.gson.Gson
import com.pregnantunicorn.goldentitty.models.music.MusicSettings
import com.pregnantunicorn.goldentitty.models.tutorial.Tutorial

class GameFile {

    companion object {

        private const val GAME_FILE = "game_file"
        private var isSaved = false
    }

    fun save(sharedPreferences: SharedPreferences) {

        BuildingsFile().save(sharedPreferences)
        ChidinmaStatueFile().save(sharedPreferences)
        CurrentDayCycleFile().save(sharedPreferences)
        CurrentFragmentFile().save(sharedPreferences)
        CurrentHandStateFile().save(sharedPreferences)
        EntrancesFile().save(sharedPreferences)
        ExcavationsFile().save(sharedPreferences)
        FoodFile().save(sharedPreferences)
        KeyItemFile().save(sharedPreferences)
        LocationFile().save(sharedPreferences)
        MeteorStatusFile().save(sharedPreferences)
        NpcsFile().save(sharedPreferences)
        ResourcesFile().save(sharedPreferences)
        StoryLineFile().save(sharedPreferences)
        TempleFile().save(sharedPreferences)
        ToolsFile().save(sharedPreferences)

        val gson = Gson()
        val json = gson.toJson(isSaved)
        val editor = sharedPreferences.edit().putString(GAME_FILE, json)
        editor.apply()
    }

    fun fileExists(sharedPreferences: SharedPreferences) = sharedPreferences.getString(GAME_FILE, null)

    fun load(sharedPreferences: SharedPreferences) {

        BuildingsFile().load(sharedPreferences)
        ChidinmaStatueFile().load(sharedPreferences)
        CurrentDayCycleFile().load(sharedPreferences)
        CurrentFragmentFile().load(sharedPreferences)
        CurrentHandStateFile().load(sharedPreferences)
        EntrancesFile().load(sharedPreferences)
        ExcavationsFile().load(sharedPreferences)
        FoodFile().load(sharedPreferences)
        KeyItemFile().load(sharedPreferences)
        LocationFile().load(sharedPreferences)
        MeteorStatusFile().load(sharedPreferences)
        NpcsFile().load(sharedPreferences)
        ResourcesFile().load(sharedPreferences)
        StoryLineFile().load(sharedPreferences)
        TempleFile().load(sharedPreferences)
        ToolsFile().load(sharedPreferences)
    }

    fun reset() {

        MusicSettings.reset()
        Tutorial.reset()
        BuildingsFile().reset()
        ChidinmaStatueFile().reset()
        CurrentDayCycleFile().reset()
        CurrentFragmentFile().reset()
        CurrentHandStateFile().reset()
        ExcavationsFile().reset()
        FoodFile().reset()
        KeyItemFile().reset()
        LocationFile().reset()
        MeteorStatusFile().reset()
        NpcsFile().reset()
        ResourcesFile().reset()
        StoryLineFile().reset()
        TempleFile().reset()
        ToolsFile().reset()
    }
}