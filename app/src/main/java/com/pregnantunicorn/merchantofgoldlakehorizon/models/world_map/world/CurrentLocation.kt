package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world

object CurrentLocation {

    private var location: LocationName = LocationName.SLEAZEHOLE_ISLAND

    fun location(): Location {

        return when(location) {

            LocationName.SLEAZEHOLE_ISLAND -> SleazeholeIsland()
        }
    }

    fun changeLocation(locationName: LocationName) {

        location = locationName
    }

}