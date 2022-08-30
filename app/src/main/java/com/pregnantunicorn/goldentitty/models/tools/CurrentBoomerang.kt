package com.pregnantunicorn.goldentitty.models.tools

object CurrentBoomerang {

    private var boomerang: Boomerang = Tools.tools()[Tools.NOMAD_BOOMERANG] as Boomerang
    private var boomerangIndex = Tools.NOMAD_BOOMERANG

    fun boomerang() = boomerang

    fun changeBoomerang(boomerangIndex: Int) {

        this.boomerangIndex = boomerangIndex
        boomerang = Tools.tools()[boomerangIndex] as Boomerang
    }

    fun reset() {

        boomerang = Tools.tools()[Tools.NOMAD_BOOMERANG] as Boomerang
        boomerangIndex = Tools.NOMAD_BOOMERANG
    }

    fun load(boomerangIndex: Int) {

        this.boomerangIndex = boomerangIndex
        boomerang = Tools.tools()[boomerangIndex] as Boomerang
    }

    fun boomerangIndex() = boomerangIndex
}