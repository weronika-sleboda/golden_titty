package com.pregnantunicorn.merchantofgoldlakehorizon.models.tools

object CurrentBoomerang {

    private var boomerang: Boomerang = Tools.tools[Tools.BANANA_BOOMERANG] as Boomerang
    fun boomerang() = boomerang

    fun changeBoomerang(boomerangIndex: Int) {

        boomerang = Tools.tools[boomerangIndex] as Boomerang
    }

}