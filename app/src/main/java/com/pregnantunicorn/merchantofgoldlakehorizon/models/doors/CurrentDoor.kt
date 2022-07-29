package com.pregnantunicorn.merchantofgoldlakehorizon.models.doors

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world.CurrentLocation
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world.LocationName


object CurrentDoor {

    const val METEORS_HOUSE = 0

    private val doors = arrayOf(

        Door(
            "Meteor's House",
            "You can restore your status here. Each 7th day cycle you have to pay 20G in rent.",
            "Open All Day",
            {IconFactory().houseDoor128()},
            {
                CurrentLocation.changeLocation(LocationName.METEORS_HOUSE)
            }
        )
    )

    private var door: Door = doors[METEORS_HOUSE]
    fun door() = door

    fun changeDoor(doorIndex: Int) {

        door = doors[doorIndex]
    }
}