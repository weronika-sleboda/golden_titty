package com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs

object CurrentBoomerangPlace {

    private var boomerangPlace = BoomerangPlaceName.COCONUT_PALM
    fun boomerangPlace() = boomerangPlace

    fun changeBoomerangPlace(boomerangPlaceName: BoomerangPlaceName) {

        this.boomerangPlace = boomerangPlaceName
    }
}