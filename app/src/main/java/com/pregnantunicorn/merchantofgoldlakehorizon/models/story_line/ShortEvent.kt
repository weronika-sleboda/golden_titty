package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line

class ShortEvent(
    private val firstLine: Act,
    private val secondLine: Act,
    private val thirdLine: Act,

): Event()
{
    private var counter = 1

    override fun proceed() {

        counter++
    }

    override fun eventLine(): Act {

        if(counter == 4) {

            completeEvent()
            counter = 4
        }

        return when(counter) {

            1 -> firstLine
            2 -> secondLine
            else ->  { thirdLine }
        }
    }

}