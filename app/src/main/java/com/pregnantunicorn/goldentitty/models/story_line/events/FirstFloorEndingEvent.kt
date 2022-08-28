package com.pregnantunicorn.goldentitty.models.story_line.events

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.story_line.Act
import com.pregnantunicorn.goldentitty.models.story_line.MiniEvent
import com.pregnantunicorn.goldentitty.models.world_map.world.LocationName

object FirstFloorEndingEvent {

    val event = MiniEvent(

        Act(
            "Donut The Dragon",
            R.drawable.donut_the_dragon,
            "Dude, what the crap?! You stabbed me! I thought your sword was made out of rubber.",
            "Well, it wasn't"
        ),

        Act(
            "Donut The Dragon",
            R.drawable.donut_the_dragon,
            "How is this even legal? I'm going to report you to animal rights activists! Expect the letter from my lawyer. I'm outta here.",
            "Whatever"
        ),
    )
}