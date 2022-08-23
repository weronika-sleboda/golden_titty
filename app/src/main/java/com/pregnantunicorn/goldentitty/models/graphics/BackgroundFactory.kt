package com.pregnantunicorn.goldentitty.models.graphics

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.day_cycle.CurrentDayCycle
import com.pregnantunicorn.goldentitty.models.day_cycle.DayCycle

class BackgroundFactory {

    fun boomerangTile(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.boomerang_tile_morning_background }
            DayCycle.SUNSET -> { R.drawable.boomerang_tile_sunset_background}
            DayCycle.NIGHT -> { R.drawable.boomerang_tile_night_background}
        }
    }

    fun blueCarpet(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.blue_carpet_morning }
            DayCycle.SUNSET -> { R.drawable.blue_carpet_sunset}
            DayCycle.NIGHT -> { R.drawable.blue_carpet_night}
        }
    }

    fun whiteFloor(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.white_floor_morning }
            DayCycle.SUNSET -> { R.drawable.white_floor_sunset}
            DayCycle.NIGHT -> { R.drawable.white_floor_night }
        }
    }

    fun divineFloor(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.divine_temple_morning}
            DayCycle.SUNSET -> { R.drawable.divine_temple_sunset}
            DayCycle.NIGHT -> { R.drawable.divine_temple_night }
        }
    }

    fun hereticFloor(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.heretic_temple_morning }
            DayCycle.SUNSET -> { R.drawable.heretic_temple_sunset}
            DayCycle.NIGHT -> { R.drawable.heretic_temple_night }
        }
    }

    fun redCarpet(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.red_carpet_morning_background }
            DayCycle.SUNSET -> { R.drawable.red_carpet_sunset_background}
            DayCycle.NIGHT -> { R.drawable.red_carpet_night_background }
        }
    }

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