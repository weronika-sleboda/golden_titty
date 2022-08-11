package com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs

import com.pregnantunicorn.merchantofgoldlakehorizon.R

object CurrentBoomerang {

    const val BUTTERFLY = 0
    const val MARKSMAN = 1

    val boomerangs = arrayOf(

        Boomerang(
            "Butterfly",
            R.drawable.butterfly_boomerang64,
            "Speed: 30ms",
            "Style: Unpredictable",
            "Hits: 1",
            "Power: 50",
            30,
            1,
            50,
            {
                when(CurrentBoomerangPlace.boomerangPlace()) {

                    BoomerangPlaceName.COCONUT_PALM -> UnpredictableStyleCoconut()
                    BoomerangPlaceName.DATE_PALM -> UnpredictableStyleDates()
                    BoomerangPlaceName.PEACH_PALM -> UnpredictableStylePeach()
                    BoomerangPlaceName.PEARL_TITTY_ALTAR -> UnpredictableStylePearlTitty()
                }
            },
            true
        ),

        Boomerang(
            "Marksman",
            R.drawable.marksman_boomerang64,
            "Speed: 300ms",
            "Style: Zig Zag",
            "Hits: 1",
            "Power: 1",
            300,
            1,
            1,
            {
                when(CurrentBoomerangPlace.boomerangPlace()) {

                    BoomerangPlaceName.COCONUT_PALM -> ZigZagStyleCoconut()
                    BoomerangPlaceName.DATE_PALM -> ZigZagStyleDates()
                    BoomerangPlaceName.PEACH_PALM -> ZigZagStylePeach()
                    BoomerangPlaceName.PEARL_TITTY_ALTAR -> ZigZagStylePearlTitty()
                }
            },
            true
        )
    )

    private var boomerang = boomerangs[BUTTERFLY]
    fun boomerang() = boomerang

    fun changeBoomerang(boomerangIndex: Int ){

        boomerang = boomerangs[boomerangIndex]
    }
}