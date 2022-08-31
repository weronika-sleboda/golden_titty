package com.pregnantunicorn.goldentitty.models.file_manager

import android.content.SharedPreferences
import com.google.gson.Gson
import com.pregnantunicorn.goldentitty.models.temple.CurrentEnemy
import com.pregnantunicorn.goldentitty.models.temple.EnemyName
import com.pregnantunicorn.goldentitty.models.temple.TempleFloorNumber
import com.pregnantunicorn.goldentitty.models.temple.TempleFloors

class TempleFile {

    companion object {

        private const val CONQUERED_FLOORS = "conquered_floors"
        private const val CURRENT_FLOOR = "current_floor"
        private const val CURRENT_ENEMY = "current_enemy"
        private const val DONUT_HEALTH = "donut_health"
        private const val SENTINO_HEALTH = "sentino_health"
        private const val DARK_RIDER_HEALTH = "dark_rider_health"
    }

    fun save(sharedPreferences: SharedPreferences) {

        val gson = Gson()
        val conqueredFloors = gson.toJson(TempleFloors.conqueredBooleans())
        val currentFloor = gson.toJson(TempleFloors.templeFloorNumber())
        val currentEnemy = gson.toJson(CurrentEnemy.enemyName())
        val donutHealth = gson.toJson(CurrentEnemy.donut().health())
        val sentinoHealth = gson.toJson(CurrentEnemy.sentino().health())
        val darkRiderHealth = gson.toJson(CurrentEnemy.darkRider().health())

        val conqueredFloorsStorage = sharedPreferences.edit().putString(
            CONQUERED_FLOORS, conqueredFloors
        )

        val currentFloorStorage = sharedPreferences.edit().putString(
            CURRENT_FLOOR, currentFloor
        )

        val currentEnemyStorage = sharedPreferences.edit().putString(
            CURRENT_ENEMY, currentEnemy
        )

        val donutStorage = sharedPreferences.edit().putString(
            DONUT_HEALTH, donutHealth
        )

        val sentinoStorage = sharedPreferences.edit().putString(
            SENTINO_HEALTH, sentinoHealth
        )

        val darkRiderStorage = sharedPreferences.edit().putString(
            DARK_RIDER_HEALTH, darkRiderHealth
        )

        conqueredFloorsStorage.apply()
        currentFloorStorage.apply()
        currentEnemyStorage.apply()
        donutStorage.apply()
        sentinoStorage.apply()
        darkRiderStorage.apply()
    }

    fun load(sharedPreferences: SharedPreferences) {

        val gson = Gson()

        val conqueredFloors = sharedPreferences.getString(CONQUERED_FLOORS, null)
        val currentFloor = sharedPreferences.getString(CURRENT_FLOOR, null)
        val currentEnemy = sharedPreferences.getString(CURRENT_ENEMY, null)
        val donutHealth = sharedPreferences.getString(DONUT_HEALTH, null)
        val sentinoHealth = sharedPreferences.getString(SENTINO_HEALTH, null)
        val darkRiderHealth = sharedPreferences.getString(DARK_RIDER_HEALTH, null)

        val conqueredFloorsType = BooleanArray::class.java
        val currentFloorType = TempleFloorNumber::class.java
        val currentEnemyType = EnemyName::class.java
        val healthType = Int::class.java

        TempleFloors.load(
            gson.fromJson(conqueredFloors, conqueredFloorsType),
            gson.fromJson(currentFloor, currentFloorType)
        )

        CurrentEnemy.load(
            gson.fromJson(currentEnemy, currentEnemyType),
            gson.fromJson(donutHealth, healthType),
            gson.fromJson(sentinoHealth, healthType),
            gson.fromJson(darkRiderHealth, healthType)
        )
    }

    fun reset() {

        CurrentEnemy.reset()
        TempleFloors.reset()
    }
}