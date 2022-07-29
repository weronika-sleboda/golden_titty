package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world

object CurrentLocation {

    private var location: LocationName = LocationName.GREENERIA

    fun location(): Location {

        return when(location) {

            LocationName.GREENERIA -> GreeneriaDistrict()
            LocationName.PEARL_COAST -> PearlCoastDistrict()
            LocationName.METEORS_HOUSE -> MeteorsHouse()
            LocationName.ERICAS_HOUSE -> EricasHouse()
            LocationName.JINS_HOUSE -> JinsHouse()
            LocationName.JORDANS_HOUSE -> JordansHouse()
            LocationName.KHANS_HOUSE -> KhansHouse()
            LocationName.NIKITAS_HOUSE -> NikitasHouse()
            LocationName.PASHAS_HOUSE -> PashasHouse()
            LocationName.SONNYS_HOUSE -> SonnysHouse()
            LocationName.PEARL_COAST_BEACH -> PearlCoastBeach()
            LocationName.RAINBOW_JUNGLE -> RainbowForest()
            LocationName.CAVE -> Cave()
        }
    }

    fun changeLocation(locationName: LocationName) {

        location = locationName
    }

}