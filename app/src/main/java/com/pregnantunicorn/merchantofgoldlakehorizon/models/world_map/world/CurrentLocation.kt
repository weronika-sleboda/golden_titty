package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world

object CurrentLocation {

    private var location: LocationName = LocationName.GREENERIA

    fun location(): Location {

        return when(location) {

           LocationName.GREENERIA -> Greeneria()
        }
    }

    fun changeLocation(locationName: LocationName) {

        location = locationName
    }

}