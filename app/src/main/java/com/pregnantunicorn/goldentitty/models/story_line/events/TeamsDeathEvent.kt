package com.pregnantunicorn.goldentitty.models.story_line.events

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.story_line.Act
import com.pregnantunicorn.goldentitty.models.story_line.LongEvent
import com.pregnantunicorn.goldentitty.models.story_line.MiniEvent
import com.pregnantunicorn.goldentitty.models.story_line.ShortEvent

object TeamsDeathEvent {

    val event = MiniEvent(

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