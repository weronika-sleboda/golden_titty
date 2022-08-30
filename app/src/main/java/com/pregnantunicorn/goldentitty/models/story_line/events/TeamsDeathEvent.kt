package com.pregnantunicorn.goldentitty.models.story_line.events

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.story_line.Act
import com.pregnantunicorn.goldentitty.models.story_line.EventTitle
import com.pregnantunicorn.goldentitty.models.story_line.MiniEvent
import com.pregnantunicorn.goldentitty.models.world_map.world.LocationName

object TeamsDeathEvent {

    val event = MiniEvent(

        EventTitle.TEAMS_DEATH,

        Act(
            "Game Over",
            R.drawable.lady_silvia256,
            "I can't believe I died my thousandth dead, because you didn't feed me. Meteor? Meteor, are you even listening?",
            "[...]"
        ),

        Act(
            "Game Over",
            R.drawable.skull256,
            "Lady Silvia: Not only that you starved me to death, now you even give me the silent treatment, like it all was my fault. You're fired!",
            "[Exit to main menu]"
        ),
    )
}