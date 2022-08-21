package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line

import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.events.*

object EventFactory {

    private var storyProgress = 0
    private var event: Event = OpeningEvent.event

    fun storyProgress() = storyProgress

    fun currentEvent(): Event {

        return OpeningEvent.event
    }

    fun changeEvent(eventTitle: EventTitle) {


    }

    fun increaseProgress() {

        storyProgress++

        if(storyProgress >= 8) {

            storyProgress = 8
        }
    }
}