package com.pregnantunicorn.merchantofgoldlakehorizon.models.temple_floors

object CurrentTempleFloor {

    private const val FIRST_FLOOR = 0
    private const val SECOND_FLOOR = 1
    private const val THIRD_FLOOR = 2
    private const val FOURTH_FLOOR = 3
    private const val FIFTH_FLOOR = 4
    private const val SIXTH_FLOOR = 5
    private const val SEVENTH_FLOOR = 6

    private val floors = arrayOf(

        TempleFloor("First Floor", TempleFloorName.FIRST_FLOOR),
        TempleFloor("Second Floor", TempleFloorName.SECOND_FLOOR),
        TempleFloor("Third Floor", TempleFloorName.THIRD_FLOOR),
        TempleFloor("Fourth Floor", TempleFloorName.FOURTH_FLOOR),
        TempleFloor("Fifth Floor", TempleFloorName.FIFTH_FLOOR),
        TempleFloor("Sixth Floor", TempleFloorName.SIXTH_FLOOR),
        TempleFloor("Seventh Floor", TempleFloorName.SEVENTH_FLOOR),
    )

    fun floors() = floors

    private var currentFloor = TempleFloorName.FIRST_FLOOR

    fun currentFloor(): TempleFloor {

        return when(currentFloor) {

            TempleFloorName.FIRST_FLOOR -> floors[FIRST_FLOOR]
            TempleFloorName.SECOND_FLOOR -> floors[SECOND_FLOOR]
            TempleFloorName.THIRD_FLOOR -> floors[THIRD_FLOOR]
            TempleFloorName.FOURTH_FLOOR -> floors[FOURTH_FLOOR]
            TempleFloorName.FIFTH_FLOOR -> floors[FIFTH_FLOOR]
            TempleFloorName.SIXTH_FLOOR -> floors[SIXTH_FLOOR]
            TempleFloorName.SEVENTH_FLOOR -> floors[SEVENTH_FLOOR]
        }
    }

    fun changeFloor(floorName: TempleFloorName) {

        currentFloor = floorName
    }

    fun getFloor(templeFloorName: TempleFloorName) {

        when(templeFloorName) {

            TempleFloorName.FIRST_FLOOR -> floors[FIRST_FLOOR]
            TempleFloorName.SECOND_FLOOR -> floors[SECOND_FLOOR]
            TempleFloorName.THIRD_FLOOR -> floors[THIRD_FLOOR]
            TempleFloorName.FOURTH_FLOOR -> floors[FOURTH_FLOOR]
            TempleFloorName.FIFTH_FLOOR -> floors[FIFTH_FLOOR]
            TempleFloorName.SIXTH_FLOOR -> floors[SIXTH_FLOOR]
            TempleFloorName.SEVENTH_FLOOR -> floors[SEVENTH_FLOOR]
        }
    }
}