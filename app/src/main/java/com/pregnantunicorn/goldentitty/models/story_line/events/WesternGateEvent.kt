package com.pregnantunicorn.goldentitty.models.story_line.events

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.story_line.Act
import com.pregnantunicorn.goldentitty.models.story_line.EventTitle
import com.pregnantunicorn.goldentitty.models.story_line.MiniEvent
import com.pregnantunicorn.goldentitty.models.world_map.world.LocationName

object WesternGateEvent {

    val event = MiniEvent(

        EventTitle.WESTERN_GATE,

        Act(
            "Western Gate",
            IconFactory().secretGate256(),
            "You are standing in front of a mysterious gate.",
            "What's That?"
        ),

        Act(
            "Lady Silvia",
            R.drawable.lady_silvia256,
            "That gate leads to the Eastern Ticky Tacka. [She tries to pass through the gate] Unfortunately it's enchanted. We have to find a way to nullify the spell.",
            "[Nod]"
        ),
    )
}