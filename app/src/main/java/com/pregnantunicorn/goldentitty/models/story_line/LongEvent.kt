package com.pregnantunicorn.goldentitty.models.story_line

import com.pregnantunicorn.goldentitty.models.world_map.world.LocationName

class LongEvent(
    private val firstLine: Act,
    private val secondLine: Act,
    private val thirdLine: Act,
    private val fourthLine: Act,
    private val fifthLine: Act,
    private val sixthLine: Act,
): Event()
{

    private var counter = 1

    override fun proceed() {

        counter++
    }

    override fun eventLine(): Act {

        if(counter == 7) {

            completeEvent()
            counter = 7
        }

        return when(counter) {

            1 -> firstLine
            2 -> secondLine
            3 -> thirdLine
            4 -> fourthLine
            5 -> fifthLine
            else -> { sixthLine }
        }
    }

}