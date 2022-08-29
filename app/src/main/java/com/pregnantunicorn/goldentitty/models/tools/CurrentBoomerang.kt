package com.pregnantunicorn.goldentitty.models.tools

object CurrentBoomerang {

    private var boomerang: Boomerang = Tools.tools()[Tools.BANANA_BOOMERANG] as Boomerang
    private var boomerangIndex = Tools.BANANA_BOOMERANG

    fun boomerang() = boomerang

    fun changeBoomerang(boomerangIndex: Int) {

        boomerang = Tools.tools()[boomerangIndex] as Boomerang
    }

    fun reset() {

        boomerang = Tools.tools()[Tools.BANANA_BOOMERANG] as Boomerang
        boomerangIndex = Tools.BANANA_BOOMERANG
    }

    fun load(boomerangIndex: Int) {

        this.boomerangIndex = boomerangIndex
        boomerang = Tools.tools()[boomerangIndex] as Boomerang
    }

    fun boomerangIndex() = boomerangIndex
}