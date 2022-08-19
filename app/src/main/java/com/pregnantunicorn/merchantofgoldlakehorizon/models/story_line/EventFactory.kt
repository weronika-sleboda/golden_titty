package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line

import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.events.*

object EventFactory {

    private var storyProgress = 0
    private var event: Event = OpeningEvent.event

    fun currentEvent(): Event {

        return when(storyProgress) {

            0 -> OpeningEvent.event
            1 -> FirstFloorEvent.event
            2 -> SecondFloorEvent.event
            3 -> ThirdFloorEvent.event
            4 -> FourthFloorEvent.event
            5 -> FifthFloorEvent.event
            6 -> SixthFloorEvent.event
            7 -> SeventhFloorEvent.event

            else -> EndingEvent.event
        }
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