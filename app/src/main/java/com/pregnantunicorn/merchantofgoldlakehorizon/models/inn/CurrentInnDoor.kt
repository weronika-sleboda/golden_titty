package com.pregnantunicorn.merchantofgoldlakehorizon.models.inn

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory

object CurrentInnDoor {

    const val FORGOTTEN_DEN = 0
    const val TENT  = 1

    private val innDoors = arrayOf(

        InnDoor(
            "Forgotten Den",
            { IconFactory().houseDoor64() },
            "A cheap inn where you can restore your status.",
            30,
            BedType.DOUBLE_BED
        ),

        InnDoor(
            "Tent",
            { IconFactory().curtains128() },
            "You can sleep here for free, but it will damage your health by 1 point.",
            0,
            BedType.SLEEPING_BAG
        )
    )

    private var innDoor = innDoors[FORGOTTEN_DEN]
    fun innDoor() = innDoor

    fun changeInnDoor(innDoorIndex: Int) {

        innDoor = innDoors[innDoorIndex]
    }
}