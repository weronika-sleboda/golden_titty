package com.pregnantunicorn.goldentitty.models.story_line

class SuperLongEvent(
    private val firstLine: Act,
    private val secondLine: Act,
    private val thirdLine: Act,
    private val fourthLine: Act,
    private val fifthLine: Act,
    private val sixthLine: Act,
    private val seventhLine: Act,
    private val eightLine: Act,
    private val ninthLine: Act,
    private val tenthLine: Act

    ): Event()
{

    private var counter = 1

    override fun proceed() {

        counter++
    }

    override fun eventLine(): Act {

        if(counter == 11) {

            completeEvent()
            counter = 11
        }

        return when(counter) {

            1 -> firstLine
            2 -> secondLine
            3 -> thirdLine
            4 -> fourthLine
            5 -> fifthLine
            6 -> sixthLine
            7 -> seventhLine
            8 -> eightLine
            9 -> ninthLine
            else -> { tenthLine }
        }
    }
}