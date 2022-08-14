package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world

object CurrentLocation {

    private var location: LocationName = LocationName.RAINBOW_FOREST

    fun location(): Location {

        return when(location) {

            LocationName.RAINBOW_FOREST -> RainbowForest()
            LocationName.PEARL_COAST -> PearlCoast()
        }
    }

    fun changeLocation(locationName: LocationName) {

        location = locationName
    }

}