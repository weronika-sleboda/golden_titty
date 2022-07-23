package com.pregnantunicorn.merchantofgoldlakehorizon.models.investigation

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.EventTitle

object CurrentInvestigation {

    const val CAMP_FIRE = 0

    private val investigations = arrayOf(

        InvestigationObject(
            "Camp Fire",
            { IconFactory().campFire128() },
            "You met Nikita here. It looks like she is one of heretics and skilled in the occult practices.",
            EventInvestigation(EventTitle.FEMME_FATALE),
            5
        )
    )

    private var investigationObject: InvestigationObject = investigations[CAMP_FIRE]
    fun investigationObject() = investigationObject

    fun changeInvestigation(investigationIndex: Int) {

        investigationObject = investigations[investigationIndex]
    }
}