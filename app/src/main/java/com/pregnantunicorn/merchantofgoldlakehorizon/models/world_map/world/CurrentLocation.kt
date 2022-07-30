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
            LocationName.GREEN_HOUSE -> ClothingShop()
            LocationName.WHITE_PALACE -> FoodShop()
            LocationName.LIBRARY -> Library()
            LocationName.DIVINE_TEMPLE -> DivineTemple()
            LocationName.HERETIC_TEMPLE -> HereticTemple()
            LocationName.UNIVERSITY -> University()
            LocationName.MERCHANT_HALL -> MerchantHall()

        }
    }

    fun changeLocation(locationName: LocationName) {

        location = locationName
    }

}