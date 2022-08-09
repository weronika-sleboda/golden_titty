package com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs

import com.pregnantunicorn.merchantofgoldlakehorizon.R

object CurrentBoomerang {

    const val BUTTERFLY = 0

    val boomerangs = arrayOf(

        Boomerang(
            "Butterfly",
            R.drawable.butterfly_boomerang64,
            "Speed: 30ms",
            "Style: Unpredictable",
            "Hits: 1",
            "Energy cost: 2",
            300,
            1,
            2,
            BoomerangStyleName.SINGLE_UNPREDICTABLE,
            true
        ),

        Boomerang(
            "Marksman",
            R.drawable.marksman_boomerang64,
            "Speed: 300ms",
            "Style: Circular",
            "Hits: 1",
            "Energy cost: 5",
            300,
            1,
            5,
            BoomerangStyleName.SINGLE_CIRCULAR,
            true
        )
    )

    private var boomerang = boomerangs[BUTTERFLY]
    fun boomerang() = boomerang

    fun changeBoomerang(boomerangIndex: Int ){

        boomerang = boomerangs[boomerangIndex]
    }
}