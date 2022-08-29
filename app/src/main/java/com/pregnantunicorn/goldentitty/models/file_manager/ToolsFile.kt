package com.pregnantunicorn.goldentitty.models.file_manager

import android.content.SharedPreferences
import com.google.gson.Gson
import com.pregnantunicorn.goldentitty.models.temple.CurrentEnemy
import com.pregnantunicorn.goldentitty.models.temple.EnemyName
import com.pregnantunicorn.goldentitty.models.temple.TempleFloorNumber
import com.pregnantunicorn.goldentitty.models.temple.TempleFloors
import com.pregnantunicorn.goldentitty.models.tools.*

class ToolsFile {

    companion object {

        private const val OWNED_TOOLS = "owned_tools"
        private const val CURRENT_AXE = "current_axe"
        private const val CURRENT_BOOMERANG = "current_boomerang"
        private const val CURRENT_SPEAR = "current_spear"
        private const val CURRENT_SWORD = "current_sword"
        private const val CURRENT_HAMMER = "current_hammer"
    }

    fun save(sharedPreferences: SharedPreferences) {

        val gson = Gson()
        val ownedTools = gson.toJson(Tools.ownedTools())
        val currentAxe = gson.toJson(CurrentAxe.axeIndex())
        val currentBoomerang = gson.toJson(CurrentBoomerang.boomerangIndex())
        val currentSpear = gson.toJson(CurrentSpear.spearIndex())
        val currentSword = gson.toJson(CurrentSword.swordIndex())
        val currentHammer = gson.toJson(CurrentHammer.hammerIndex())

        val ownedToolsStorage = sharedPreferences.edit().putString(
            OWNED_TOOLS, ownedTools
        )

        val currentAxeStorage = sharedPreferences.edit().putString(
            CURRENT_AXE, currentAxe
        )

        val currentBoomerangStorage = sharedPreferences.edit().putString(
            CURRENT_BOOMERANG, currentBoomerang
        )

        val currentSpearStorage = sharedPreferences.edit().putString(
            CURRENT_SPEAR, currentSpear
        )

        val currentSwordStorage = sharedPreferences.edit().putString(
            CURRENT_SWORD, currentSword
        )

        val currentHammerStorage = sharedPreferences.edit().putString(
            CURRENT_HAMMER, currentHammer
        )

        ownedToolsStorage.apply()
        currentAxeStorage.apply()
        currentBoomerangStorage.apply()
        currentSpearStorage.apply()
        currentSwordStorage.apply()
        currentHammerStorage.apply()
    }

    fun load(sharedPreferences: SharedPreferences) {

        val gson = Gson()

        val ownedTools = sharedPreferences.getString(OWNED_TOOLS, null)
        val currentAxe =  sharedPreferences.getString(CURRENT_AXE, null)
        val currentBoomerang =  sharedPreferences.getString(CURRENT_BOOMERANG, null)
        val currentSpear =  sharedPreferences.getString(CURRENT_SPEAR, null)
        val currentSword =  sharedPreferences.getString(CURRENT_SWORD, null)
        val currentHammer =  sharedPreferences.getString(CURRENT_HAMMER, null)

        val ownedToolsType = BooleanArray::class.java
        val indexType = Int::class.java

        Tools.load(gson.fromJson(ownedTools, ownedToolsType))
        CurrentAxe.load(gson.fromJson(currentAxe, indexType))
        CurrentBoomerang.load(gson.fromJson(currentBoomerang, indexType))
        CurrentSpear.load(gson.fromJson(currentSpear, indexType))
        CurrentSword.load(gson.fromJson(currentSword, indexType))
        CurrentHammer.load(gson.fromJson(currentHammer, indexType))
    }

    fun reset() {

        Tools.reset()
        CurrentSword.reset()
        CurrentBoomerang.reset()
        CurrentSpear.reset()
        CurrentHammer.reset()
        CurrentAxe.reset()
    }
}