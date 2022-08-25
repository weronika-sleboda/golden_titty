package com.pregnantunicorn.goldentitty.models.excavation

import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.key_items.KeyItemType
import com.pregnantunicorn.goldentitty.models.key_items.KeyItems
import com.pregnantunicorn.goldentitty.models.world_map.world.LocationName

object CurrentExcavationSite {

    private const val NR1 = 0
    private const val NR2 = 1
    private const val NR3 = 2
    private const val NR4 = 3
    private const val NR5 = 4
    private const val NR6 = 5
    private const val NR7 = 6

    private val excavationSites = arrayOf(

        ExcavationSite(
            "Shamanic Necklace",
            IconFactory().shamanicNecklace64(),
            "Excavation Site Nr 1", LocationName.TICKY_TACKA_WEST)
        {
            KeyItems.getKeyItem(KeyItemType.SHAMANIC_NECKLACE).add()
        },

        ExcavationSite(
            "Crystal Of Vision",
            IconFactory().crystalOfVision64(),
            "Excavation Site Nr 2", LocationName.TICKY_TACKA_EAST)
        {
            KeyItems.getKeyItem(KeyItemType.CRYSTAL_OF_VISION).add()
        },

        ExcavationSite(
            "Staff Of Eclipse",
            IconFactory().staffOfEclipse64(),
            "Excavation Site Nr 3", LocationName.TICKY_TACKA_EAST)
        {
            KeyItems.getKeyItem(KeyItemType.STAFF_OF_ECLIPSE).add()
        },

        ExcavationSite(
            "Temple Key",
            IconFactory().key64(),
            "Excavation Site Nr 4", LocationName.TICKY_TACKA_EAST)
        {
            KeyItems.getKeyItem(KeyItemType.TEMPLE_KEY).add()
        },

        ExcavationSite(
            "First Floor Key",
            IconFactory().key64(),
            "Excavation Site Nr 5", LocationName.TICKY_TACKA_EAST)
        {

            KeyItems.getKeyItem(KeyItemType.FIRST_FLOOR_KEY).add()
        },

        ExcavationSite(
            "Second Floor Key",
            IconFactory().key64(),
            "Excavation Site Nr 6", LocationName.TICKY_TACKA_EAST)
        {

            KeyItems.getKeyItem(KeyItemType.SECOND_FLOOR_KEY).add()
        },

        ExcavationSite(
            "Third Floor Key",
            IconFactory().key64(),
            "Excavation Site Nr 7", LocationName.TICKY_TACKA_EAST)
        {

            KeyItems.getKeyItem(KeyItemType.THIRD_FLOOR_KEY).add()
        },
    )

    private var excavationNumber = ExcavationNumber.NR1

    fun excavation(): ExcavationSite {

        return when(excavationNumber) {

            ExcavationNumber.NR1 -> excavationSites[NR1]
            ExcavationNumber.NR2 -> excavationSites[NR2]
            ExcavationNumber.NR3 -> excavationSites[NR3]
            ExcavationNumber.NR4 -> excavationSites[NR4]
            ExcavationNumber.NR5 -> excavationSites[NR5]
            ExcavationNumber.NR6 -> excavationSites[NR6]
            ExcavationNumber.NR7 -> excavationSites[NR7]
        }
    }

    fun changeExcavationNumber(excavationNumber: ExcavationNumber) {

        this.excavationNumber = excavationNumber
    }


}