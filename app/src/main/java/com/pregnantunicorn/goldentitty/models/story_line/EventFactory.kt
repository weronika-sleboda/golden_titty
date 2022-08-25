package com.pregnantunicorn.goldentitty.models.story_line

import com.pregnantunicorn.goldentitty.models.story_line.events.*

object EventFactory {

    private var eventTitle = EventTitle.OPENING

    fun currentEvent(): Event {

        return OpeningEvent.event
    }

    fun changeEvent(eventTitle: EventTitle) {

        this.eventTitle = eventTitle
    }
}