package com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle

object CurrentDayCycle {

    private var dayCycle = DayCycle.MORNING
    fun dayCycle() = dayCycle

    fun changeDayCycle() {

        dayCycle = when(dayCycle) {

            DayCycle.MORNING -> DayCycle.SUNSET
            DayCycle.SUNSET -> DayCycle.NIGHT
            DayCycle.NIGHT -> DayCycle.MORNING
        }
    }
}