package com.pregnantunicorn.goldentitty.models.story_line.events

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.story_line.Act
import com.pregnantunicorn.goldentitty.models.story_line.MiniEvent
import com.pregnantunicorn.goldentitty.models.world_map.world.LocationName

object PierEvent {

    val event = MiniEvent(

        Act(
            "Pier",
            IconFactory().pier256(),
            "The pier has been built.",
            "Done!"
        ),

        Act(
            "Lady Silvia",
            R.drawable.lady_silvia256,
            "Wonderful! Now we can acquire fish. Mmmm... Sashimi... I wish I had a tongue and could taste it. Anyway, we have a pier.",
            "[Nod]"
        ),
    )
}