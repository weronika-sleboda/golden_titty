package com.pregnantunicorn.goldentitty.models.story_line.events

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.story_line.Act
import com.pregnantunicorn.goldentitty.models.story_line.EventTitle
import com.pregnantunicorn.goldentitty.models.story_line.ShortEvent
import com.pregnantunicorn.goldentitty.models.world_map.world.LocationName

object TempleEvent {

    val event = ShortEvent(

        EventTitle.TEMPLE_EVENT,

        Act(
            "Temple Ruins",
            R.drawable.temple_ruins256_night,
            "As you are holding the Staff Of Eclipse, a purple fog is rising from the ground and spreading itself across the place until its gone leaving a mysterious temple behind itself.",
            "What is that?"
        ),

        Act(
            "Lady Silvia",
            R.drawable.lady_silvia256,
            "Excellent, my dear! This is the Temple Of End Times Twerk of Latter Day Apocalypse Booty Rapture and Holy Nipple Revival. Or at least it was, until the despicable atitteists destroyed it.",
            "[Follow her]"
        ),

        Act(
            "Lady Silvia",
            R.drawable.lady_silvia256,
            "[She tries to open the main door] Seven Nipples damn it! The door is locked. ",
            "What now?"
        ),

        Act(
            "Lady Silvia",
            R.drawable.lady_silvia256,
            "The flea bearer is hiding inside. We need to keep excavating the island until we find the key to the main entrance.",
            "[Leave]"
        ),
    )
}