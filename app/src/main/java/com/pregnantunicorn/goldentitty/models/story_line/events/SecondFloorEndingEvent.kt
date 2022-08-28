package com.pregnantunicorn.goldentitty.models.story_line.events

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.story_line.Act
import com.pregnantunicorn.goldentitty.models.story_line.MiniEvent
import com.pregnantunicorn.goldentitty.models.story_line.ShortEvent
import com.pregnantunicorn.goldentitty.models.world_map.world.LocationName

object SecondFloorEndingEvent {

    val event = MiniEvent(

        Act(
            "Sentino",
            R.drawable.sentino256,
            "[He passed out.]",
            "I feel sorry for him"
        ),

        Act(
            "Lady Silvia",
            R.drawable.lady_silvia256,
            "Me too... What was that tavern called? Stinky Sock? I will never go there.",
            "Not me either"
        ),
    )
}