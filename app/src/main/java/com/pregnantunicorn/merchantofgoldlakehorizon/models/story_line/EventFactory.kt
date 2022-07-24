package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line

import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.events.*


object EventFactory {

    private var event: Event = AaliyahsDiary.event
    fun currentEvent() = event

    fun changeEvent(eventTitle: EventTitle) {

        event = when(eventTitle) {

            EventTitle.AALIYAHS_DIARY -> AaliyahsDiary.event
            EventTitle.WRONG_PERSON -> WrongPerson.event
            EventTitle.LOVE_LETTER -> LoveLetter.event
            EventTitle.SECRET_MEETING -> SecretMeeting.event
            EventTitle.HERETIC_ROBE -> HereticRobe.event
        }
    }
}