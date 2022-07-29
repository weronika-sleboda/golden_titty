package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line

import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.events.*


object EventFactory {

    private var event: Event = OpeningEvent.event
    fun currentEvent() = event

    fun changeEvent(eventTitle: EventTitle) {


    }
}