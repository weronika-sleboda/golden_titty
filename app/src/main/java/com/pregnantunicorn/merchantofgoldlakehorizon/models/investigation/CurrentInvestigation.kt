package com.pregnantunicorn.merchantofgoldlakehorizon.models.investigation

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.EventTitle

object CurrentInvestigation {

    const val CARRIAGE_MORNING = 0
    const val CARRIAGE_SUNSET = 1
    const val CARRIAGE_NIGHT = 2
    const val VOLCANO_DAY = 3
    const val VOLCANO_SUNSET = 4
    const val VOLCANO_NIGHT = 5

    private val investigations = arrayOf(

        InvestigationObject(
            "The Carriage",
            { IconFactory().carriage128() },
            "This is the place where you found Aaliyah's diary in the morning. She is from Pearl Coast but she tries to hide it.",
            EventInvestigation(EventTitle.AALIYAHS_DIARY),
            5
        ),

        InvestigationObject(
            "The Carriage",
            { IconFactory().carriage128() },
            "This is the place were you saw Jin and Brianna having a conversation at the sunset. Jin tried to kill some woman.",
            EventInvestigation(EventTitle.WRONG_PERSON),
            5
        ),

        InvestigationObject(
            "The Carriage",
            { IconFactory().carriage128() },
            "This is the place were you found a love letter. It's unclear who wrote it.",
            EventInvestigation(EventTitle.LOVE_LETTER),
            5
        ),

        InvestigationObject(
            "The Volcano",
            { IconFactory().volcano128() },
            "This is the place were you found the heretic robe in the morning.",
            EventInvestigation(EventTitle.HERETIC_ROBE),
            5
        ),

        InvestigationObject(
            "The Volcano",
            { IconFactory().volcano128() },
            "This is the place were you stumbled upon a group of strange individuals.",
            EventInvestigation(EventTitle.SECRET_MEETING),
            5
        ),

        InvestigationObject(
            "The Volcano",
            { IconFactory().volcano128() },
            "This is the place were you stumbled upon a group of strange individuals at night. They talked about deceiving someone.",
            EventInvestigation(EventTitle.SECRET_MEETING),
            5
        )
    )

    private var investigationObject: InvestigationObject = investigations[CARRIAGE_MORNING]
    fun investigationObject() = investigationObject

    fun changeInvestigation(investigationIndex: Int) {

        investigationObject = investigations[investigationIndex]
    }
}