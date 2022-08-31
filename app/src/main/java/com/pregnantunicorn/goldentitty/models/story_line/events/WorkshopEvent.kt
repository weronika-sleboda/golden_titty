package com.pregnantunicorn.goldentitty.models.story_line.events

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.story_line.Act
import com.pregnantunicorn.goldentitty.models.story_line.EventTitle
import com.pregnantunicorn.goldentitty.models.story_line.MiniEvent
import com.pregnantunicorn.goldentitty.models.world_map.world.LocationName

object WorkshopEvent {

    val event = MiniEvent(

        EventTitle.WORKSHOP_EVENT,

        Act(
            "Workshop",
            IconFactory().workshop256(),
            "The workshop has been built.",
            "Done!"
        ),

        Act(
            "Lady Silvia",
            R.drawable.lady_silvia256,
            "Such a big and beautiful house just for a bunch of tools?! I can't believe it... ",
            "Anyway, it's done"
        ),
    )
}