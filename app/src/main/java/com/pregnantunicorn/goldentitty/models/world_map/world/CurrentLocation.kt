package com.pregnantunicorn.goldentitty.models.world_map.world

object CurrentLocation {

    private var location: LocationName = LocationName.SLEAZEHOLE_ISLAND_WEST

    fun location(): Location {

        return when(location) {

            LocationName.SLEAZEHOLE_ISLAND_WEST -> SleazeholeIslandWest()
            LocationName.SLEAZEHOLE_ISLAND_EAST -> SleazeholeIslandEast()
        }
    }

    fun changeLocation(locationName: LocationName) {

        location = locationName
    }

}