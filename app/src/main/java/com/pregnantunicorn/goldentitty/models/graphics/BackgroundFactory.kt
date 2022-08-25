package com.pregnantunicorn.goldentitty.models.graphics

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.day_cycle.CurrentDayCycle
import com.pregnantunicorn.goldentitty.models.day_cycle.DayCycle

class BackgroundFactory {

    fun boomerangTile(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.palm_tile_morning_background }
            DayCycle.SUNSET -> { R.drawable.palm_tile_sunset_background}
            DayCycle.NIGHT -> { R.drawable.palm_tile_night_background}
        }
    }

    fun templeFloor(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.temple_floor_morning }
            DayCycle.SUNSET -> { R.drawable.temple_floor_sunset}
            DayCycle.NIGHT -> { R.drawable.temple_floor_night }
        }
    }

    fun soil(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.soil_morning }
            DayCycle.SUNSET -> { R.drawable.soil_sunset}
            DayCycle.NIGHT -> { R.drawable.soil_night }
        }
    }

    fun grass(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.grass_morning }
            DayCycle.SUNSET -> { R.drawable.grass_sunset }
            DayCycle.NIGHT -> { R.drawable.beach_grass }
        }
    }

    fun water(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.water_morning }
            DayCycle.SUNSET -> { R.drawable.water_sunset }
            DayCycle.NIGHT -> { R.drawable.water_night }
        }
    }

    fun beach(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.beach_morning }
            DayCycle.SUNSET -> { R.drawable.beach_sunset }
            DayCycle.NIGHT -> { R.drawable.beach_night }
        }
    }
}