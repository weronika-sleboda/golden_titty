package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line

import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.events.Event

class ShortEvent(
    private val firstLine: Act,
    private val secondLine: Act,
    private val thirdLine: Act,
    private val fourthLine: Act

): Event
{
    private var counter = 1

    override fun proceed() {

        counter++
    }

    override fun eventLine(): Act {

        return when(counter) {

            1 -> firstLine
            2 -> secondLine
            3 -> thirdLine

            else ->  {

                counter = 5
                fourthLine
            }
        }
    }

}