package com.pregnantunicorn.goldentitty.models.story_line.events

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.story_line.*
import com.pregnantunicorn.goldentitty.models.world_map.world.LocationName

object SecondFloorDeathEvent {

    val event = MiniEvent(

        EventTitle.SECOND_FLOOR_DEATH_EVENT,

        Act(
            "Sentino",
            R.drawable.sentino256,
            "Agh... It will maybe sound... a little bit... gh... tactless... But do you have... arr... any... painkillers?",
            "[...]"
        ),

        Act(
            "Game Over",
            R.drawable.skull256,
            "Lady Silvia: Sure. Take those [She gives him her painkillers] I know exactly how you feel. I'm on my imaginary period each month for thousand years already.",
            "[Exit to main menu]"
        ),

    )
}