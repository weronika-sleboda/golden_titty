package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.clothing.RobeFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.dialog_messages.DialogMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.Act
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.Event

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
            RobeFactory.robes[RobeFactory.HERETIC_ROBE].putInBackpack()
            counter = 3
        }

        return when(counter) {

            1 -> firstLine
            else ->  { secondLine }
        }
    }

}