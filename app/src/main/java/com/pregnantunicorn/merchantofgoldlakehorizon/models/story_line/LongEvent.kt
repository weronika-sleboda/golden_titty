package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line

class LongEvent(
    private val firstLine: Act,
    private val secondLine: Act,
    private val thirdLine: Act,
    private val fourthLine: Act,
    private val fifthLine: Act,
    private val sixthLine: Act,
    private val seventhLine: Act,

    ): Event()
{

    private var counter = 1

    override fun proceed() {

        counter++
    }

    override fun eventLine(): Act {

        if(counter == 8) {

            completeEvent()
            counter = 8
        }

        return when(counter) {

            1 -> firstLine
            2 -> secondLine
            3 -> thirdLine
            4 -> fourthLine
            5 -> fifthLine
            6 -> sixthLine
            else -> { seventhLine }
        }
    }
}