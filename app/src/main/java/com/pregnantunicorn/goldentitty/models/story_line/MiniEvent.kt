package com.pregnantunicorn.goldentitty.models.story_line

class MiniEvent(
    private val firstLine: Act,
    private val secondLine: Act,
): Event()
{
    private var counter = 1

    override fun proceed() {

        counter++
    }

    override fun eventLine(): Act {

        if(counter == 3) {

            completeEvent()
            counter = 3
        }

        return when(counter) {

            1 -> firstLine
            else ->  { secondLine }
        }
    }

}