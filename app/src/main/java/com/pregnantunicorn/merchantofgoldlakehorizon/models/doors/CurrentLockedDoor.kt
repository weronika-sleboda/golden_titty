package com.pregnantunicorn.merchantofgoldlakehorizon.models.doors

import com.pregnantunicorn.merchantofgoldlakehorizon.models.clothing.RobeFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.CurrentDayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.DayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.npcs.CurrentNpc

object CurrentLockedDoor {

    const val ARENA_DOOR = 0
    const val CAMP_DOOR = 1
    const val BOAT_DOOR = 2
    const val UNIVERSITY_DOOR = 3
    const val LIBRARY_DOOR = 4
    const val THEATRE_DOOR = 5
    const val DIVINE_TEMPLE_DOOR = 6
    const val HERETIC_TEMPLE_DOOR = 7
    const val GREEN_HOUSE_DOOR = 8
    const val RED_VELVET_DOOR = 9

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
            "You still can use your charisma " +
                    "to enter the camp and meet the residents.",
            { IconFactory().tent128() },
            {
                when(CurrentDayCycle.dayCycle()) {

                    DayCycle.MORNING -> CurrentNpc.changeNpc(CurrentNpc.SOPHIA)

                    DayCycle.SUNSET -> CurrentNpc.changeNpc(CurrentNpc.KHAN)

                    DayCycle.NIGHT -> CurrentNpc.changeNpc(CurrentNpc.ERICA)
                }
            },
            {
                if(RobeFactory.robes[RobeFactory.COMMONER_ROBE].wears()) { 1 }
                else { 4 }
            }
        ),

        LockedDoor(
            "Ship Orion",
            "You can use your charisma to get on board the ship" +
                    " and meet the passengers.",
            { IconFactory().boatLadder128() },
            {
                when(CurrentDayCycle.dayCycle()) {

                    DayCycle.MORNING -> CurrentNpc.changeNpc(CurrentNpc.NIKITA)

                    DayCycle.SUNSET -> CurrentNpc.changeNpc(CurrentNpc.LEE)

                    DayCycle.NIGHT -> CurrentNpc.changeNpc(CurrentNpc.MALIK)
                }
            },
            {
                if(RobeFactory.robes[RobeFactory.HERETIC_ROBE].wears()) { 1 }
                else { 6 }
            }
        ),

        LockedDoor(
            "University",
            "University is closed right now but you can still use your charisma " +
                    "to get in and meet the manager.",
            { IconFactory().universityDoor128() },
            {
                CurrentNpc.changeNpc(CurrentNpc.MAXIM)
            },
            {
                if(RobeFactory.robes[RobeFactory.MERCHANT_ROBE].wears()) { 1 }
                else { 5 }
            }
        ),

        LockedDoor(
            "Library",
            "Library is closed right now but you can still use your charisma " +
                    "to get in and meet the manager.",
            { IconFactory().universityDoor128() },
            {
                CurrentNpc.changeNpc(CurrentNpc.DANIEL)
            },
            {
                if(RobeFactory.robes[RobeFactory.MERCHANT_ROBE].wears()) { 1 }
                else { 6 }
            }
        ),

        LockedDoor(
            "Theatre",
            "Theatre is closed right now but you can still use your charisma " +
                    "to get in and meet the manager.",
            { IconFactory().theatreDoor128() },
            {
                CurrentNpc.changeNpc(CurrentNpc.SERENITY)
            },
            {
                if(RobeFactory.robes[RobeFactory.MERCHANT_ROBE].wears()) { 2 }
                else { 3 }
            }
        ),

        LockedDoor(
            "Divine Temple",
            "Divine Temple is closed right now but you can still use your charisma " +
                    "to get in and meet the priestess.",
            { IconFactory().divineDoor128() },
            {
                CurrentNpc.changeNpc(CurrentNpc.BRIANNA)
            },
            {
                if(RobeFactory.robes[RobeFactory.DIVINE_ROBE].wears()) { 1 }
                else { 4 }
            }
        ),

        LockedDoor(
            "Shadow Temple",
            "Shadow Temple is closed right now but you can still use your charisma " +
                    "to get in and meet the priest.",
            { IconFactory().hereticDoor128() },
            {
                CurrentNpc.changeNpc(CurrentNpc.PASHA)
            },
            {
                if(RobeFactory.robes[RobeFactory.HERETIC_ROBE].wears()) { 1 }
                else { 10 }
            }
        ),

        LockedDoor(
            "Green House",
            "Green House is closed right now but you can still use your charisma " +
                    "to get in and meet the owner.",
            { IconFactory().secondClothingDoor128() },
            {
                CurrentNpc.changeNpc(CurrentNpc.AALIYAH)
            },
            {
                if(RobeFactory.robes[RobeFactory.GOLDEN_ROBE].wears()) { 1 }
                else { 3 }
            }
        ),

        LockedDoor(
            "Red Velvet",
            "Red Velvet is closed right now but you can still use your charisma " +
                    "to get in and meet the owner.",
            { IconFactory().firstClothingDoor128() },
            {
                CurrentNpc.changeNpc(CurrentNpc.MEI)
            },
            {
                if(RobeFactory.robes[RobeFactory.GOLDEN_ROBE].wears()) { 1 }
                else { 3 }
            }
        ),
    )

    private var lockedDoor = lockedDoors[ARENA_DOOR]
    fun lockedDoor() = lockedDoor

    fun changeLockedDoor(lockedDoorIndex: Int) {

        lockedDoor = lockedDoors[lockedDoorIndex]
    }
}