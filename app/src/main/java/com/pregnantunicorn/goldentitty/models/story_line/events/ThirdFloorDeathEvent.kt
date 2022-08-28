package com.pregnantunicorn.goldentitty.models.story_line.events

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.story_line.Act
import com.pregnantunicorn.goldentitty.models.story_line.MiniEvent
import com.pregnantunicorn.goldentitty.models.world_map.world.LocationName

object ThirdFloorDeathEvent {

    val event = MiniEvent(

        Act(
            "Game Over",
            R.drawable.pussycat_prophet256,
            "[He speaks to Vladimir] Move that dead adventurer to the first floor and feed Donut. Unfortunately, the skeleton hag cannot be killed.",
            "[...]"
        ),

        Act(
            "Game Over",
            R.drawable.skull256,
            "Vladimir wiped the floor with you.",
            "[Exit to main menu]"
        ),
    )
}