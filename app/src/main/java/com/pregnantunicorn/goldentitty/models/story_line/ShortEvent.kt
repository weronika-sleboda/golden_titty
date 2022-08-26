package com.pregnantunicorn.goldentitty.models.story_line

class ShortEvent(
    private val firstLine: Act,
    private val secondLine: Act,
    private val thirdLine: Act,
    private val fourthLine: Act,

): Event()
{
    private var counter = 1

    override fun proceed() {

        counter++
    }

    override fun eventLine(): Act {

        if(counter == 5) {

            completeEvent()
            counter = 5
        }

        return when(counter) {

            1 -> firstLine
            2 -> secondLine
            3 -> thirdLine
            else ->  { fourthLine }
        }
    }

}