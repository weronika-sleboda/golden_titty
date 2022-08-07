package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world

object CurrentLocation {

    private var location: LocationName = LocationName.DRAGON_INN_BEDROOM

    fun location(): Location {

        return when(location) {

           LocationName.DRAGON_INN_BEDROOM -> DragonInnBedroom()
        }
    }

    fun changeLocation(locationName: LocationName) {

        location = locationName
    }

}