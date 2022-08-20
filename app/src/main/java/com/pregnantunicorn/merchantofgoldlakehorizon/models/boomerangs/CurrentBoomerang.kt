package com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import kotlin.random.Random

object CurrentBoomerang {

    const val BANANA = 0
    const val NOMAD = 1
    const val BUTTERFLY = 2
    const val PILGRIM = 3
    const val BANDIT = 4
    const val WARRIOR = 5
    const val SEDUCER = 6
    const val SHAMAN = 7
    const val CURSED = 8
    const val SNAKE = 9

    val boomerangs = arrayOf(

        Boomerang(
            "Banana",
            R.drawable.banana_boomerang64,
            "Required accuracy: 5",
            5,
            "Speed: Very Slow",
            "Style: Zig Zag",
            "Hits: 1",
            "Power: 1",
            { 400 },
            { 1 },
            { 1 },
            {
                when(CurrentBoomerangPlace.boomerangPlace()) {

                    BoomerangPlaceName.COCONUT_PALM -> ZigZagStyleCoconut()
                    BoomerangPlaceName.DATE_PALM -> ZigZagStyleDates()
                    BoomerangPlaceName.PEACH_PALM -> ZigZagStylePeach()
                    BoomerangPlaceName.TEMPLE -> ZigZagStyleMonk()
                }
            },
            true
        ),

        Boomerang(
            "Nomad",
            R.drawable.nomad_boomerang64,
            "Required accuracy: 3",
            3,
            "Speed: Normal",
            "Style: Unpredictable",
            "Hits: 2",
            "Power: 1",
            { 200 },
            { 2 },
            { 1 },
            {
                when(CurrentBoomerangPlace.boomerangPlace()) {

                    BoomerangPlaceName.COCONUT_PALM -> UnpredictableStyleCoconut()
                    BoomerangPlaceName.DATE_PALM -> UnpredictableStyleDates()
                    BoomerangPlaceName.PEACH_PALM -> UnpredictableStylePeach()
                    BoomerangPlaceName.TEMPLE -> UnpredictableStyleMonk()
                }
            },
            false
        ),

        Boomerang(
            "Butterfly",
            R.drawable.butterfly_boomerang64,
            "Required accuracy: 3",
            3,
            "Speed: Normal",
            "Style: Zig Zag",
            "Hits: 1",
            "Power: 1",
            { 200 },
            { 1 },
            { 1 },
            {
                when(CurrentBoomerangPlace.boomerangPlace()) {

                    BoomerangPlaceName.COCONUT_PALM -> ZigZagStyleCoconut()
                    BoomerangPlaceName.DATE_PALM -> ZigZagStyleDates()
                    BoomerangPlaceName.PEACH_PALM -> ZigZagStylePeach()
                    BoomerangPlaceName.TEMPLE -> ZigZagStyleMonk()
                }
            },
            false
        ),

        Boomerang(
            "Pilgrim",
            R.drawable.pilgrim_boomerang64,
            "Required accuracy: 2",
            2,
            "Speed: Fast",
            "Style: Zig Zag",
            "Hits: 1",
            "Power: 1",
            { 100 },
            { 1 },
            { 1 },
            {
                when(CurrentBoomerangPlace.boomerangPlace()) {

                    BoomerangPlaceName.COCONUT_PALM -> ZigZagStyleCoconut()
                    BoomerangPlaceName.DATE_PALM -> ZigZagStyleDates()
                    BoomerangPlaceName.PEACH_PALM -> ZigZagStylePeach()
                    BoomerangPlaceName.TEMPLE -> ZigZagStyleMonk()
                }
            }
        ),

        Boomerang(
            "Bandit",
            R.drawable.bandit_boomerang64,
            "Required accuracy: 5",
            5,
            "Speed: Fast",
            "Style: Unpredictable",
            "Hits: 2",
            "Power: 3",
            { 100 },
            { 2 },
            { 3 },
            {
                when(CurrentBoomerangPlace.boomerangPlace()) {

                    BoomerangPlaceName.COCONUT_PALM -> UnpredictableStyleCoconut()
                    BoomerangPlaceName.DATE_PALM -> UnpredictableStyleDates()
                    BoomerangPlaceName.PEACH_PALM -> UnpredictableStylePeach()
                    BoomerangPlaceName.TEMPLE -> UnpredictableStyleMonk()
                }
            }
        ),

        Boomerang(
            "Warrior",
            R.drawable.warrior_boomerang64,
            "Required accuracy: 3",
            3,
            "Speed: Normal",
            "Style: Zig Zag",
            "Hits: 1",
            "Power: 3",
            { 200 },
            { 1 },
            { 3 },
            {
                when(CurrentBoomerangPlace.boomerangPlace()) {

                    BoomerangPlaceName.COCONUT_PALM -> ZigZagStyleCoconut()
                    BoomerangPlaceName.DATE_PALM -> ZigZagStyleDates()
                    BoomerangPlaceName.PEACH_PALM -> ZigZagStylePeach()
                    BoomerangPlaceName.TEMPLE -> ZigZagStyleMonk()
                }
            }
        ),

        Boomerang(
            "Seducer",
            R.drawable.seducer_boomerang64,
            "Required accuracy: 2",
            2,
            "Speed: Extremely Slow",
            "Style: Unpredictable",
            "Hits: 3",
            "Power: 1",
            { 500 },
            { 3 },
            { 1 },
            {
                when(CurrentBoomerangPlace.boomerangPlace()) {

                    BoomerangPlaceName.COCONUT_PALM -> UnpredictableStyleCoconut()
                    BoomerangPlaceName.DATE_PALM -> UnpredictableStyleDates()
                    BoomerangPlaceName.PEACH_PALM -> UnpredictableStylePeach()
                    BoomerangPlaceName.TEMPLE -> UnpredictableStyleMonk()
                }
            }
        ),

        Boomerang(
            "Shaman",
            R.drawable.shaman_boomerang64,
            "Required accuracy: 1",
            1,
            "Speed: Normal",
            "Style: Enchanted",
            "Hits: 2",
            "Power: 3",
            { 200 },
            { 2 },
            { 3 },
            {
                when(CurrentBoomerangPlace.boomerangPlace()) {

                    BoomerangPlaceName.COCONUT_PALM -> EnchantedStyleCoconut()
                    BoomerangPlaceName.DATE_PALM -> EnchantedStyleDates()
                    BoomerangPlaceName.PEACH_PALM -> EnchantedStylePeach()
                    BoomerangPlaceName.TEMPLE -> EnchantedStyleMonk()
                }
            }
        ),

        Boomerang(
            "Cursed",
            R.drawable.cursed_boomerang64,
            "Required accuracy: 2",
            2,
            "Speed: Insanely Fast",
            "Style: ???",
            "Hits: Random (1 - 5)",
            "Power: 10",
            { 5 },
            { 1 + Random.nextInt(5) },
            { 10 },
            {

                when(Random.nextInt(3)) {

                    0 -> when(CurrentBoomerangPlace.boomerangPlace()) {

                        BoomerangPlaceName.COCONUT_PALM -> EnchantedStyleCoconut()
                        BoomerangPlaceName.DATE_PALM -> EnchantedStyleDates()
                        BoomerangPlaceName.PEACH_PALM -> EnchantedStylePeach()
                        BoomerangPlaceName.TEMPLE -> EnchantedStyleMonk()
                    }

                    1 -> when(CurrentBoomerangPlace.boomerangPlace()) {

                        BoomerangPlaceName.COCONUT_PALM -> UnpredictableStyleCoconut()
                        BoomerangPlaceName.DATE_PALM -> UnpredictableStyleDates()
                        BoomerangPlaceName.PEACH_PALM -> UnpredictableStylePeach()
                        BoomerangPlaceName.TEMPLE -> UnpredictableStyleMonk()
                    }

                    else -> {

                        when(CurrentBoomerangPlace.boomerangPlace()) {

                            BoomerangPlaceName.COCONUT_PALM -> ZigZagStyleCoconut()
                            BoomerangPlaceName.DATE_PALM -> ZigZagStyleDates()
                            BoomerangPlaceName.PEACH_PALM -> ZigZagStylePeach()
                            BoomerangPlaceName.TEMPLE -> ZigZagStyleMonk()
                        }
                    }

                }
            }
        ),

        Boomerang(
            "Snake",
            R.drawable.snake_bommerang64,
            "Required accuracy: 1",
            1,
            "Speed: ???",
            "Style: Unpredictable",
            "Hits: 10",
            "Power: 1",
            { 5 + Random.nextLong(500) },
            { 10 },
            { 1 },
            {
                when(CurrentBoomerangPlace.boomerangPlace()) {

                    BoomerangPlaceName.COCONUT_PALM -> UnpredictableStyleCoconut()
                    BoomerangPlaceName.DATE_PALM -> UnpredictableStyleDates()
                    BoomerangPlaceName.PEACH_PALM -> UnpredictableStylePeach()
                    BoomerangPlaceName.TEMPLE -> UnpredictableStyleMonk()
                }
            }
        ),
    )

    private var boomerang = boomerangs[BANANA]
    fun boomerang() = boomerang

    fun changeBoomerang(boomerangIndex: Int ){

        boomerang = boomerangs[boomerangIndex]
    }
}