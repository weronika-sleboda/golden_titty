package com.pregnantunicorn.goldentitty.models.story_line.events

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.story_line.Act
import com.pregnantunicorn.goldentitty.models.story_line.EventTitle
import com.pregnantunicorn.goldentitty.models.story_line.ShortEvent
import com.pregnantunicorn.goldentitty.models.world_map.world.LocationName

object StatueEvent {

    val event = ShortEvent(

        EventTitle.STATUE_EVENT,

        Act(
            "???",
            IconFactory().chidinmaStatue256(),
            "As you are holding the Crystal of Vision, a statue is rising from the ground.",
            "A statue?"
        ),

        Act(
            "Lady Silvia",
            R.drawable.lady_silvia256,
            "Marvelous! We found the statue of Chidinma!",
            "What does it do?"
        ),

        Act(
            "Lady Silvia",
            R.drawable.lady_silvia256,
            "[She examines the statue] I have no clue... Wait, there is something interesting here. Take a look.",
            "[Approach the statue]"
        ),

        Act(
            "Lady Silvia",
            R.drawable.lady_silvia256,
            "There are three slots built into the statue. The logic tells me that something has to be inserted into these slots in order for something to happen.",
            "Logical conclusion"
        ),
    )
}