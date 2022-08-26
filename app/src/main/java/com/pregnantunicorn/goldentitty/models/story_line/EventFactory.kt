package com.pregnantunicorn.goldentitty.models.story_line

import com.pregnantunicorn.goldentitty.models.story_line.events.*

object EventFactory {

    private var eventTitle = EventTitle.OPENING

    fun currentEvent(): Event {

        return when(eventTitle) {

            EventTitle.OPENING -> OpeningEvent.event
            EventTitle.ENDING -> EndingEvent.event
            EventTitle.WORKSHOP_EVENT -> WorkshopEvent.event
            EventTitle.EXCAVATION_SITE_EVENT -> ExcavationSiteEvent.event
            EventTitle.CAMP_FIRE_EVENT -> CampFireEvent.event
            EventTitle.FIRST_FLOOR_EVENT -> FirstFloorEvent.event
            EventTitle.LADY_SILVIAS_DEATH -> LadySilviasDeathEvent.event
            EventTitle.TEAMS_DEATH -> TeamsDeathEvent.event
            EventTitle.LADY_SILVIAS_HUT_EVENT -> LadySilviasHutEvent.event
            EventTitle.STATUE_EVENT -> StatueEvent.event
            EventTitle.TEMPLE_EVENT -> TempleEvent.event
            EventTitle.METEORS_DEATH -> MeteorsDeathEvent.event
            EventTitle.SECOND_FLOOR_EVENT -> SecondFloorEvent.event
            EventTitle.THIRD_FLOOR_EVENT -> ThirdFloorEvent.event
        }
    }

    fun changeEvent(eventTitle: EventTitle) {

        this.eventTitle = eventTitle
    }
}