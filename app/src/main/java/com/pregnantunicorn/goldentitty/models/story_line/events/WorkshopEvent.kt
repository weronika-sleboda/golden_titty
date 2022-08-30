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
            "Nice work! Now we can start making tools. We need something to stab that titty molester with.",
            "[Nod]"
        ),
    )
}