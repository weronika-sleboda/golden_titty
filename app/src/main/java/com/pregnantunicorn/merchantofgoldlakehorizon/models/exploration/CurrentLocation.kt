package com.pregnantunicorn.merchantofgoldlakehorizon.models.exploration

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory

object CurrentLocation {

    const val FOREST = 0
    const val CAVE = 1

    private val locations = arrayOf(

        Location(
            "Forest",
            { IconFactory().forest128() },
            "This is the place where you can find wood, feather and spices. Some of them are only available at specific time of day.",
            1,
            LocationType.FOREST
        ),

        Location(
            "Cave",
            { IconFactory().cave128() },
            "This is the place where you can find iron, stones and gems. Some of them are only available at specific time of day.",
            1,
            LocationType.CAVE
        )
    )

    private var location = locations[FOREST]
    fun location() = location

    fun changeLocation(index: Int) {

        location = locations[index]
    }

}