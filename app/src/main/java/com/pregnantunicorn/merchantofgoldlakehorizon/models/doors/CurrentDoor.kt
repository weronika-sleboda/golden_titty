package com.pregnantunicorn.merchantofgoldlakehorizon.models.doors


object CurrentDoor {

    const val GREEN_HOUSE_DOOR = 0
    const val RED_VELVET = 1
    const val LIBRARY_DOOR = 2
    const val UNIVERSITY_DOOR = 3
    const val ARENA_DOOR = 4
    const val THEATRE_DOOR = 5
    const val DIVINE_TEMPLE_DOOR = 6
    const val GOLDEN_PALACE = 7
    const val CAMP = 8

    private val doors = arrayOf(
        GreenHouseDoor(),
        RedVelvetDoor(),
        LibraryDoor(),
        UniversityDoor(),
        ArenaDoor(),
        TheatreDoor(),
        DivineTempleDoor()
    )

    private var door: Door = doors[GREEN_HOUSE_DOOR]
    fun door() = door

    fun changeDoor(doorIndex: Int) {

        door = doors[doorIndex]
    }
}