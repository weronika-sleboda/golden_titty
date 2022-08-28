package com.pregnantunicorn.goldentitty.models.story_line.events

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.story_line.Act
import com.pregnantunicorn.goldentitty.models.story_line.ShortEvent
import com.pregnantunicorn.goldentitty.models.world_map.world.LocationName

object ThirdFloorEndingEvent {

    val event = ShortEvent(

        Act(
            "Pussycat Prophet",
            R.drawable.pussycat_prophet256,
            "Mr. Vladimir?! Mr. Vladimir, please wake up... [Vladimir's tongue is hanging]",
            "I think he's dead"
        ),

        Act(
            "Pussycat Prophet",
            R.drawable.pussycat_prophet256,
            "Dead???!! [He jumps from fear] No! My prophet career is over!",
            "Time for punishment"
        ),

        Act(
            "Pussycat Prophet",
            R.drawable.pussycat_prophet256,
            "Punishment?! It's not my fault I'm a villain. There weren't any youth recreation centers in my neighbourhood.",
            "[Punish him]"
        ),

        Act(
            "Lady Silvia",
            R.drawable.lady_silvia256,
            "Well, we're done. The only problem is that we still don't know where the titty is hidden.",
            "[Leave the temple]"
        ),
    )
}