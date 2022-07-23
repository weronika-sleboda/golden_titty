package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line

import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.events.*


object EventFactory {

    private var event: Event = InvisibleEnemy.event
    fun currentEvent() = event

    fun changeEvent(eventTitle: EventTitle) {

        event = when(eventTitle) {

            EventTitle.BAD_COMPANY -> BadCompany.event
            EventTitle.BOOK_OF_CREATION -> BookOfCreation.event
            EventTitle.BRUTAL_BUSINESS -> BrutalBusiness.event
            EventTitle.CUSTOMER_THIEF -> CustomerThief.event
            EventTitle.FEMME_FATALE -> FemmeFatale.event
            EventTitle.HEALTH_ISSUES -> HealthIssues.event
            EventTitle.INVISIBLE_ENEMY -> InvisibleEnemy.event
            EventTitle.LOST_SOUL -> LostSoul.event
            EventTitle.MYSTERIOUS_PERSON -> MysteriousPerson.event
            EventTitle.SECRET_LIFE_OF_DANIEL -> SecretLifeOfDaniel.event
            EventTitle.SON_OF_THE_CURSED_ONE -> SonOfCursedOne.event
        }
    }
}