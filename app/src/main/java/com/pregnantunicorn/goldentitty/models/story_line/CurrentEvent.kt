package com.pregnantunicorn.goldentitty.models.story_line

import com.pregnantunicorn.goldentitty.models.story_line.events.*

object CurrentEvent {

    private var event: Event = OpeningEvent.event
    private var eventTitle = EventTitle.OPENING

    fun eventTitle() = eventTitle
    fun currentEvent() = event

    fun changeEvent(eventTitle: EventTitle) {

        this.eventTitle = eventTitle

        event = when(CurrentEvent.eventTitle) {

            EventTitle.OPENING -> OpeningEvent.event
            EventTitle.ENDING -> EndingEvent.event
            EventTitle.WORKSHOP_EVENT -> WorkshopEvent.event
            EventTitle.EXCAVATION_SITE_EVENT -> ExcavationSiteEvent.event
            EventTitle.CAMP_FIRE_EVENT -> CampFireEvent.event
            EventTitle.FIRST_FLOOR_OPENING_EVENT -> FirstFloorOpeningEvent.event
            EventTitle.FIRST_FLOOR_DEATH_EVENT -> FirstFloorDeathEvent.event
            EventTitle.FIRST_FLOOR_ENDING_EVENT -> FirstFloorEndingEvent.event
            EventTitle.SECOND_FLOOR_OPENING_EVENT -> SecondFloorOpeningEvent.event
            EventTitle.SECOND_FLOOR_DEATH_EVENT -> SecondFloorDeathEvent.event
            EventTitle.SECOND_FLOOR_ENDING_EVENT -> SecondFloorEndingEvent.event
            EventTitle.THIRD_FLOOR_OPENING_EVENT -> ThirdFloorOpeningEvent.event
            EventTitle.THIRD_FLOOR_DEATH_EVENT -> ThirdFloorDeathEvent.event
            EventTitle.THIRD_FLOOR_ENDING_EVENT -> ThirdFloorEndingEvent.event
            EventTitle.LADY_SILVIAS_DEATH -> LadySilviasDeathEvent.event
            EventTitle.TEAMS_DEATH -> TeamsDeathEvent.event
            EventTitle.LADY_SILVIAS_HUT_EVENT -> LadySilviasHutEvent.event
            EventTitle.STATUE_EVENT -> StatueEvent.event
            EventTitle.TEMPLE_EVENT -> TempleEvent.event
            EventTitle.METEORS_DEATH -> MeteorsDeathEvent.event
            EventTitle.PIER_EVENT -> PierEvent.event
            EventTitle.WESTERN_GATE -> WesternGateEvent.event
        }
    }

    fun changeEvent(event: Event) {

        this.event = event
    }

    fun reset() {

        event = OpeningEvent.event
        eventTitle = EventTitle.OPENING
    }

    fun load(eventTitle: EventTitle) {

        changeEvent(eventTitle)
    }
}