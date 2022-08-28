package com.pregnantunicorn.goldentitty.models.story_line.events

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.story_line.Act
import com.pregnantunicorn.goldentitty.models.story_line.MiniEvent
import com.pregnantunicorn.goldentitty.models.world_map.world.LocationName

object CampFireEvent {

    val event = MiniEvent(

        Act(
            "Camp Fire",
            IconFactory().campFire256(),
            "The camp fire has been built.",
            "Done!"
        ),

        Act(
            "Lady Silvia",
            R.drawable.lady_silvia256,
            "Marvelous! Now I can sit at this cozy camp fire all night long pretending I'm eating, though we all know I don't have a stomach.",
            "Sounds great!"
        ),
    )
}