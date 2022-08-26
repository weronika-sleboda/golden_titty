package com.pregnantunicorn.goldentitty.models.story_line.events

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.story_line.Act
import com.pregnantunicorn.goldentitty.models.story_line.LongEvent
import com.pregnantunicorn.goldentitty.models.story_line.MiniEvent
import com.pregnantunicorn.goldentitty.models.story_line.ShortEvent

object MeteorsDeathEvent {

    val event = MiniEvent(

        Act(
            "Game Over",
            R.drawable.lady_silvia256,
            "Meteor! You won't believe what I found. A new trail. You have to see this... Meteor? Meteor, where are you?",
            "[...]"
        ),

        Act(
            "Game Over",
            R.drawable.skull256,
            "Lady Silvia: Meteor? There is something different about you... Let me guess... A new haircut? ",
            "[Exit to main menu]"
        ),
    )
}