package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line

import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.events.*


object EventFactory {

    fun currentEvent(): Event = InvisibleEnemy.event
}