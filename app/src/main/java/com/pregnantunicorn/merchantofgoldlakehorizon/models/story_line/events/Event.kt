package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.events

import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.Act

interface Event {

    fun proceed()
    fun eventLine(): Act
}