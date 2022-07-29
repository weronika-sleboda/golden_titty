package com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.CurrentDayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.DayCycle

class BackgroundFactory {

    fun woodenFloor(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.wooden_floor_morning }
            DayCycle.SUNSET -> { R.drawable.wooden_floor_sunset}
            DayCycle.NIGHT -> { R.drawable.wooden_floor_night }
        }
    }

    fun pinkCarpet(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.pink_carpet_morning }
            DayCycle.SUNSET -> { R.drawable.pink_carpet_sunset }
            DayCycle.NIGHT -> { R.drawable.pink_carpet_night }
        }
    }



    fun grass(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.morning_grass_background }
            DayCycle.SUNSET -> { R.drawable.sunset_grass_background }
            DayCycle.NIGHT -> { R.drawable.night_grass_background }
        }
    }

    fun jungle(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.morning_jungle_background }
            DayCycle.SUNSET -> { R.drawable.sunset_jungle_background }
            DayCycle.NIGHT -> { R.drawable.night_jungle_background }
        }
    }

    fun volcano(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.morning_volcano_background }
            DayCycle.SUNSET -> { R.drawable.sunset_volcano_background }
            DayCycle.NIGHT -> { R.drawable.night_volcano_background }
        }
    }

    fun snow(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.morning_snow_background }
            DayCycle.SUNSET -> { R.drawable.sunset_snow_background }
            DayCycle.NIGHT -> { R.drawable.night_snow_background }
        }
    }

    fun water(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.morning_water_background }
            DayCycle.SUNSET -> { R.drawable.sunset_water_background }
            DayCycle.NIGHT -> { R.drawable.night_water_background }
        }
    }

    fun beach(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.morning_beach_background }
            DayCycle.SUNSET -> { R.drawable.sunset_beach_background }
            DayCycle.NIGHT -> { R.drawable.night_beach_background }
        }
    }
}