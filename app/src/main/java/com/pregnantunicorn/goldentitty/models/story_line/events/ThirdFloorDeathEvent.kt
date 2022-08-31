package com.pregnantunicorn.goldentitty.models.story_line.events

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.story_line.Act
import com.pregnantunicorn.goldentitty.models.story_line.EventTitle
import com.pregnantunicorn.goldentitty.models.story_line.MiniEvent
import com.pregnantunicorn.goldentitty.models.world_map.world.LocationName

object ThirdFloorDeathEvent {

    val event = MiniEvent(

        EventTitle.THIRD_FLOOR_DEATH_EVENT,

        Act(
            "Game Over",
            R.drawable.dark_rider256,
            "Talk to my hand [He is holding the hand with his palm towards Lady Silvia] I'm too fabulous for this drama!",
            "[...]"
        ),

        Act(
            "Game Over",
            R.drawable.skull256,
            "Dark Rider wiped the floor with you.",
            "[Exit to main menu]"
        ),
    )
}