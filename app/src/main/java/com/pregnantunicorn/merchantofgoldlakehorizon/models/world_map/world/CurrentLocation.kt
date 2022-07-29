package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world

object CurrentLocation {

    private var location: LocationName = LocationName.SEVEN_STARS

    fun location(): Location {

        return when(location) {

            LocationName.SEVEN_STARS -> SevenStars()
            LocationName.METEORS_HOUSE -> MeteorsHouse()
        }
    }

    fun changeLocation(locationName: LocationName) {

        location = locationName
    }

}