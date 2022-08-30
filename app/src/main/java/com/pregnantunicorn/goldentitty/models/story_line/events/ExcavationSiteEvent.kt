package com.pregnantunicorn.goldentitty.models.story_line.events

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.construction.CurrentBuilding
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.story_line.Act
import com.pregnantunicorn.goldentitty.models.story_line.EventTitle
import com.pregnantunicorn.goldentitty.models.story_line.MiniEvent

object ExcavationSiteEvent {

    val event = MiniEvent(

        EventTitle.EXCAVATION_SITE_EVENT,

        Act(
            "Excavation Site",
            IconFactory().excavationSite256(),
            "The excavation site has been built.",
            "Done!"
        ),

        Act(
            "Lady Silvia",
            R.drawable.lady_silvia256,
            "Now we can start digging for the key items, hoping that the Pussycat Prophet didn't poop into this sand.",
            "[Nod]"
        ),
    )
}