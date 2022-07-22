package com.pregnantunicorn.merchantofgoldlakehorizon.models.doors

import com.pregnantunicorn.merchantofgoldlakehorizon.models.clothing.RobeFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.CurrentDayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.DayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.npcs.CurrentNpc

object CurrentLockedDoor {

    const val ARENA_DOOR = 0
    const val CAMP_DOOR = 1

    private val lockedDoors = arrayOf(
        LockedDoor(
            "Arena",
            "Arena is closed right now, but you still can use your charisma " +
                    "to enter the building and meet the manager.",
            { IconFactory().arenaDoor128() },
            { CurrentNpc.changeNpc(CurrentNpc.JIN) },
            {
                if(RobeFactory.robes[RobeFactory.ARMY_ROBE].wears()) { 1 }
                else { 6 }
            }
        ),

        LockedDoor(
            "Camp",
            "You can't sleep in the camp right now, but you still can use your charisma " +
                    "to get in and meet the residents.",
            { IconFactory().tent128() },
            {
                when(CurrentDayCycle.dayCycle()) {

                    DayCycle.MORNING -> CurrentNpc.changeNpc(CurrentNpc.SOPHIA)

                    else -> CurrentNpc.changeNpc(CurrentNpc.KHAN)
                }
            },
            {
                if(RobeFactory.robes[RobeFactory.COMMONER_ROBE].wears()) { 1 }
                else { 4 }
            }
        )
    )

    private var lockedDoor = lockedDoors[ARENA_DOOR]
    fun lockedDoor() = lockedDoor

    fun changeLockedDoor(lockedDoorIndex: Int) {

        lockedDoor = lockedDoors[lockedDoorIndex]
    }
}