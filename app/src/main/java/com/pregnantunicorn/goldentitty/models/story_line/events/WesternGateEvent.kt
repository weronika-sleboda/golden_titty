package com.pregnantunicorn.goldentitty.models.story_line.events

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.story_line.Act
import com.pregnantunicorn.goldentitty.models.story_line.MiniEvent
import com.pregnantunicorn.goldentitty.models.world_map.world.LocationName

object WesternGateEvent {

    val event = MiniEvent(

        Act(
            "Western Gate",
            IconFactory().secretGate256(),
            "You are standing in front of a mysterious gate.",
            "What's That?"
        ),

        Act(
            "Lady Silvia",
            R.drawable.lady_silvia256,
            "That gate leads to the Eastern Ticky Tacka. [She tries to pass through the gate] Seven Nipples damn it! That flea bearer have enchanted it. We have to find away to nullify the spell.",
            "[Nod]"
        ),
    )
}