package com.pregnantunicorn.goldentitty.models.story_line.events

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.story_line.Act
import com.pregnantunicorn.goldentitty.models.story_line.MiniEvent
import com.pregnantunicorn.goldentitty.models.world_map.world.LocationName

object FirstFloorDeathEvent {

    val event = MiniEvent(

        Act(
            "Donut The Dragon",
            R.drawable.donut_the_dragon,
            "Yeah! Take that, you animal abuser!",
            "[...]"
        ),

        Act(
            "Game Over",
            R.drawable.skull256,
            "You have been killed by Donut The Dragon.",
            "[Exit to main menu]"
        ),
    )
}