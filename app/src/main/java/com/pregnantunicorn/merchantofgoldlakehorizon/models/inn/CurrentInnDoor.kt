package com.pregnantunicorn.merchantofgoldlakehorizon.models.inn

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory

object CurrentInnDoor {

    const val TENT  = 0

    private val innDoors = arrayOf(

        InnDoor(
            "Tent",
            { IconFactory().curtains128() },
            "You can sleep here for free, but it will damage your health by 1 point.",
            0,
            BedType.SLEEPING_BAG
        )
    )

    private var innDoor = innDoors[TENT]
    fun innDoor() = innDoor

    fun changeInnDoor(innDoorIndex: Int) {

        innDoor = innDoors[innDoorIndex]
    }
}