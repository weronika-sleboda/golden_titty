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
            "Agh... It maybe will sound... a little bit... gh... tactless... But do you have... arr... any... healing herbs?",
            "[...]"
        ),

        Act(
            "Game Over",
            R.drawable.skull256,
            "You have been killed by a food poisoned guy. You are a loser.",
            "[Exit to main menu]"
        ),

    )
}