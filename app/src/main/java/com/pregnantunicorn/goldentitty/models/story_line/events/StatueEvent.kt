package com.pregnantunicorn.goldentitty.models.story_line.events

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.story_line.Act
import com.pregnantunicorn.goldentitty.models.story_line.ShortEvent
import com.pregnantunicorn.goldentitty.models.world_map.world.LocationName

object StatueEvent {

    val event = ShortEvent(

        Act(
            "???",
            IconFactory().chidinmaStatue256(),
            "As you are holding the Crystal of Vision, a statue is rising from the ground.",
            "A statue?"
        ),

        Act(
            "Lady Silvia",
            R.drawable.lady_silvia256,
            "That's strange... What is the Statue of Goddess Chidinma doing here? She was worshipped in the ancient times, way before the birth of polytitteism.",
            "[Approach the statue]"
        ),

        Act(
            "Lady Silvia",
            R.drawable.lady_silvia256,
            "[She examines the statue] One day the believers realized though, that the most interesting thing about the goddess are her juicy boobs and the cult evolved into the titty worship.",
            "Interesting"
        ),

        Act(
            "Lady Silvia",
            R.drawable.lady_silvia256,
            "Indeed. Hmmm... There are three slots built into the statue. The logic tells me that something has to be inserted into these slots in order for something to happen.",
            "Logical conclusion"
        ),
    )
}