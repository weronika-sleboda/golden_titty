package com.pregnantunicorn.goldentitty.models.story_line.events

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.story_line.Act
import com.pregnantunicorn.goldentitty.models.story_line.EventTitle
import com.pregnantunicorn.goldentitty.models.story_line.ShortEvent
import com.pregnantunicorn.goldentitty.models.world_map.world.LocationName

object FirstFloorOpeningEvent {

    val event = ShortEvent(

        EventTitle.FIRST_FLOOR_OPENING_EVENT,

        Act(
            "Donut The Dragon",
            R.drawable.donut_the_dragon,
            "Who da crap is makin' that noise?! Can't ya knock?! Imma tryin' to sleep here! [He sees you] Who are ya?",
            "I want the Titty"
        ),

        Act(
            "Donut The Dragon",
            R.drawable.donut_the_dragon,
            "Eeew! Find a girlfriend loser, cuz I don't have any. Besides, this is the private property.",
            "Give me the Titty"
        ),

        Act(
            "Donut The Dragon",
            R.drawable.donut_the_dragon,
            "Imma male, you pervert! [He notices that you are standing on his carpet] Hey! Ya are stainin' my handmade elven carpet!",
            "I want the Golden Titty"
        ),

        Act(
            "Donut The Dragon",
            R.drawable.donut_the_dragon,
            "Oh... ya mean that one? In that case... Kiss my fatty dragon ass, cuz I ain't givin' it to ya!",
            "[Fight him]"
        ),
    )
}