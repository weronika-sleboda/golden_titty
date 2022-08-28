package com.pregnantunicorn.goldentitty.models.tools

import com.pregnantunicorn.goldentitty.R
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
    const val BARBARIAN_SPEAR = 9
    const val MERCENARY_SPEAR = 10
    const val KING_SPEAR = 11
    private const val KNIFE = 12
    private const val SHOVEL = 13
    const val BANDIT_SWORD = 14
    const val WARRIOR_SWORD = 15
    const val ASSASSIN_SWORD = 16

    private var tools = arrayOf(

        Boomerang(
            "Nomad Boomerang",
            R.drawable.nomad_boomerang64,
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
            R.drawable.shaman_boomerang64,
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
            R.drawable.banana_boomerang64,
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
            R.drawable.caveman_hammer64,
            1,
            0,
            0,
            CAVEMAN_HAMMER,
            true
        ),

        Hammer(
            "Pilgrim Hammer",
            R.drawable.pilgrim_hammer64,
            3,
            5,
            10,
            PILGRIM_HAMMER,
            false
        ),

        Hammer(
            "Knockout Hammer",
            R.drawable.knockout_hammer64,
            5,
            5,
            20,
            KNOCKOUT_HAMMER,
            false
        ),

        Axe(
            "Chieftain Axe",
            R.drawable.chieftain_axe64,
            1,
            0,
            0,
            CHIEFTAIN_AXE,
            true,
        ),

        Axe(
            "Merchant Axe",
            R.drawable.merchant_axe64,
            3,
            10,
            5,
            MERCHANT_AXE,
            false
        ),

        Axe(
            "Dwarf Axe",
            R.drawable.dwarf_axe64,
            5,
            10,
            15,
            DWARF_AXE,
            false
        ),

        Spear(
            "Barbarian Spear",
            R.drawable.barbarian_spear64,
            "Hit: 1, Speed: Very Slow",
            { 400 },
            { 1 }, 8,
            4,
            BARBARIAN_SPEAR,
            false,
        ),

        Spear(
            "Mercenary Spear",
            R.drawable.mercenary_spear64,
            "Hit: 3, Speed: Normal",
            { 200 },
            { 3 },
            10,
            5,
            MERCENARY_SPEAR,
            false,
        ),

        Spear(
            "King Spear",
            R.drawable.king_spear64,
            "Hit: 5, Speed: Fast",
            { 100 },
            { 5 },
            10,
            10,
            KING_SPEAR,
            false,
        ),

        Knife(),
        Shovel(),

        Sword(
            "Bandit Sword",
            IconFactory().banditSword64(),
            "Power: 1, Speed: Slow",
            { 300 },
            { 1 },
            5,
            15,
            BANDIT_SWORD,
            false,
        ),

        Sword(
            "Warrior Sword",
            IconFactory().warriorSword64(),
            "Power: 3, Speed: Normal",
            { 200 },
            { 3 },
            8,
            20,
            WARRIOR_SWORD,
            false,
        ),

        Sword(
            "Assassin Sword",
            IconFactory().assassinSword64(),
            "Power: 5, Speed: Fast",
            { 100 },
            { 5 },
            12,
            30,
            ASSASSIN_SWORD,
            false,
        ),
    )

    fun tools() = tools

    fun reset() {

        tools = arrayOf(

            Boomerang(
                "Nomad Boomerang",
                R.drawable.nomad_boomerang64,
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
                R.drawable.shaman_boomerang64,
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
                R.drawable.banana_boomerang64,
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
                R.drawable.caveman_hammer64,
                1,
                0,
                0,
                CAVEMAN_HAMMER,
                true
            ),

            Hammer(
                "Pilgrim Hammer",
                R.drawable.pilgrim_hammer64,
                3,
                5,
                10,
                PILGRIM_HAMMER,
                false
            ),

            Hammer(
                "Knockout Hammer",
                R.drawable.knockout_hammer64,
                5,
                5,
                20,
                KNOCKOUT_HAMMER,
                false
            ),

            Axe(
                "Chieftain Axe",
                R.drawable.chieftain_axe64,
                1,
                0,
                0,
                CHIEFTAIN_AXE,
                true,
            ),

            Axe(
                "Merchant Axe",
                R.drawable.merchant_axe64,
                3,
                10,
                5,
                MERCHANT_AXE,
                false
            ),

            Axe(
                "Dwarf Axe",
                R.drawable.dwarf_axe64,
                5,
                10,
                15,
                DWARF_AXE,
                false
            ),

            Spear(
                "Barbarian Spear",
                R.drawable.barbarian_spear64,
                "Hit: 1, Speed: Very Slow",
                { 400 },
                { 1 }, 8,
                4,
                BARBARIAN_SPEAR,
                false,
            ),

            Spear(
                "Mercenary Spear",
                R.drawable.mercenary_spear64,
                "Hit: 3, Speed: Normal",
                { 200 },
                { 3 },
                10,
                5,
                MERCENARY_SPEAR,
                false,
            ),

            Spear(
                "King Spear",
                R.drawable.king_spear64,
                "Hit: 5, Speed: Fast",
                { 100 },
                { 5 },
                10,
                10,
                KING_SPEAR,
                false,
            ),

            Knife(),
            Shovel(),

            Sword(
                "Bandit Sword",
                IconFactory().banditSword64(),
                "Power: 1, Speed: Slow",
                { 300 },
                { 1 },
                5,
                15,
                BANDIT_SWORD,
                false,
            ),

            Sword(
                "Warrior Sword",
                IconFactory().warriorSword64(),
                "Power: 3, Speed: Normal",
                { 200 },
                { 3 },
                8,
                20,
                WARRIOR_SWORD,
                false,
            ),

            Sword(
                "Assassin Sword",
                IconFactory().assassinSword64(),
                "Power: 5, Speed: Fast",
                { 100 },
                { 5 },
                12,
                30,
                ASSASSIN_SWORD,
                false,
            ),
        )

    }

    fun ownedTools(): BooleanArray {

        val tools = BooleanArray(tools.size)

        for(index in this.tools.indices) {

            tools[index] = this.tools[index].owns()
        }

        return tools
    }


    fun setTools(tools: BooleanArray) {

        for(index in this.tools.indices) {

            this.tools[index].setOwns(tools[index])
        }
    }
}