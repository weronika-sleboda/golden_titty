package com.pregnantunicorn.goldentitty.models.temple

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.key_items.KeyItemType
import com.pregnantunicorn.goldentitty.models.story_line.EventTitle
import com.pregnantunicorn.goldentitty.models.story_line.events.*

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
            EnemyName.DONUT_THE_DRAGON,
            TempleFloorNumber.NR1,
            FirstFloorOpeningEvent.event,
            FirstFloorDeathEvent.event,
            FirstFloorEndingEvent.event,
            EventTitle.FIRST_FLOOR_OPENING_EVENT,
            EventTitle.FIRST_FLOOR_ENDING_EVENT
        ),

        TempleFloor(
            "Second Floor",
            KeyItemType.SECOND_FLOOR_KEY,
            KeyItemType.SAPPHIRE,
            R.drawable.sapphire64,
            "Sapphire",
            EnemyName.SENTINO,
            TempleFloorNumber.NR2,
            SecondFloorOpeningEvent.event,
            SecondFloorDeathEvent.event,
            SecondFloorEndingEvent.event,
            EventTitle.SECOND_FLOOR_OPENING_EVENT,
            EventTitle.SECOND_FLOOR_ENDING_EVENT
        ),

        TempleFloor(
            "Second Floor",
            KeyItemType.THIRD_FLOOR_KEY,
            KeyItemType.RUBY,
            R.drawable.ruby64,
            "Ruby",
            EnemyName.VLADIMIR,
            TempleFloorNumber.NR3,
            ThirdFloorOpeningEvent.event,
            ThirdFloorDeathEvent.event,
            ThirdFloorEndingEvent.event,
            EventTitle.THIRD_FLOOR_OPENING_EVENT,
            EventTitle.THIRD_FLOOR_ENDING_EVENT
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