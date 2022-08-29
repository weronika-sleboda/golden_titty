package com.pregnantunicorn.goldentitty.models.world_map.world

object CurrentLocation {

    private var location: LocationName = LocationName.TICKY_TACKA_WEST

    fun location(): Location {

        return when(location) {

            LocationName.TICKY_TACKA_WEST -> TickyTackaWest()
            LocationName.TICKY_TACKA_EAST-> TickyTackaEast()
        }
    }

    fun changeLocation(locationName: LocationName) {

        location = locationName
    }

    fun locationName() = location

    fun reset() {

        location = LocationName.TICKY_TACKA_WEST
    }

    fun load(locationName: LocationName) {

        location = locationName
    }
}