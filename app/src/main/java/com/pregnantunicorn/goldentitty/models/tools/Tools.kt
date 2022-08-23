package com.pregnantunicorn.goldentitty.models.tools

import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import kotlin.random.Random

object Tools {

    const val NOMAD_BOOMERANG = 0
    const val SHAMAN_BOOMERANG = 1
    const val BANANA_BOOMERANG = 2
    const val CAVEMAN_HAMMER = 3
    const val PILGRIM_HAMMER = 4
    const val KNOCKOUT_HAMMER = 5
    const val CHIEFTAIN_AXE = 6
    const val MERCHANT_AXE = 7
    const val DWARF_AXE = 8

    val tools: Array<Tool> = arrayOf(

        Boomerang(
            "Nomad Boomerang",
            IconFactory().nomadBoomerang64(),
            "Hit: 1, Speed: Normal",
            { 200 },
            { 1 },
            0,
            0,
            NOMAD_BOOMERANG,
            true,
        ),

        Boomerang(
            "Shaman Boomerang",
            IconFactory().shamanBoomerang64(),
            "Hit: 4, Speed: Random",
            { 10 + Random.nextLong(400)},
            { 1 },
            15,
            0,
            SHAMAN_BOOMERANG,
            false,
        ),

        Boomerang(
            "Banana Boomerang",
            IconFactory().bananaBoomerang64(),
            "Hit: 1 - 6, Speed: Fast",
            { 100 },
            { 1 + Random.nextInt(6)},
            20,
            0,
            BANANA_BOOMERANG,
            false,
        ),

        Hammer(
            "Caveman Hammer",
            IconFactory().cavemanHammer64(),
            1,
            0,
            0,
            CAVEMAN_HAMMER,
            true
        ),

        Hammer(
            "Pilgrim Hammer",
            IconFactory().pilgrimHammer64(),
            3,
            5,
            10,
            PILGRIM_HAMMER,
            false
        ),

        Hammer(
            "Knockout Hammer",
            IconFactory().knockoutHammer64(),
            5,
            5,
            20,
            KNOCKOUT_HAMMER,
            false
        ),

        Axe(
            "Chieftain Axe",
            IconFactory().chieftainAxe64(),
            1,
            0,
            0,
            CHIEFTAIN_AXE,
            true,
        ),

        Axe(
            "Merchant Axe",
            IconFactory().merchantAxe64(),
            3,
            10,
            5,
            MERCHANT_AXE,
            false
        ),

        Axe(
            "Dwarf Axe",
            IconFactory().dwarfAxe64(),
            5,
            10,
            15,
            DWARF_AXE,
            false
        ),
    )
}