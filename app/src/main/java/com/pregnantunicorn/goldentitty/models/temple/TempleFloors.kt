package com.pregnantunicorn.goldentitty.models.temple

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.key_items.KeyItemType

object TempleFloors {

    private const val NR1 = 0
    private const val NR2 = 1
    private const val NR3 = 2

    val floors = arrayOf(

        TempleFloor(
            "First Floor",
            KeyItemType.FIRST_FLOOR_KEY,
            KeyItemType.EMERALD,
            R.drawable.emerald64,
        "Emerald",
            EnemyName.PASHA,
            TempleFloorNumber.NR1
        ),

        TempleFloor(
            "Second Floor",
            KeyItemType.SECOND_FLOOR_KEY,
            KeyItemType.SAPPHIRE,
            R.drawable.sapphire64,
            "Sapphire",
            EnemyName.SENTINO,
            TempleFloorNumber.NR2
        ),

        TempleFloor(
            "Second Floor",
            KeyItemType.THIRD_FLOOR_KEY,
            KeyItemType.RUBY,
            R.drawable.ruby64,
            "Ruby",
            EnemyName.DARK_RIDER,
            TempleFloorNumber.NR3
        ),
    )

    private var templeFloorNumber: TempleFloorNumber = TempleFloorNumber.NR1
    fun templeFloorNumber() = templeFloorNumber

    fun templeFloor(): TempleFloor {

        return when(templeFloorNumber) {

            TempleFloorNumber.NR1 -> floors[NR1]
            TempleFloorNumber.NR2 -> floors[NR2]
            TempleFloorNumber.NR3 -> floors[NR3]
        }
    }

    fun changeTempleFloor(floorNumber: TempleFloorNumber) {

        templeFloorNumber = floorNumber
    }
}