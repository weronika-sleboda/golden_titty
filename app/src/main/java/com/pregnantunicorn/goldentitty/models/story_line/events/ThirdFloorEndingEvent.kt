package com.pregnantunicorn.goldentitty.models.story_line.events

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.story_line.Act
import com.pregnantunicorn.goldentitty.models.story_line.EventTitle
import com.pregnantunicorn.goldentitty.models.story_line.MiniEvent
import com.pregnantunicorn.goldentitty.models.story_line.ShortEvent
import com.pregnantunicorn.goldentitty.models.world_map.world.LocationName

object ThirdFloorEndingEvent {

    val event = MiniEvent(

        EventTitle.THIRD_FLOOR_ENDING_EVENT,

        Act(
            "Dark Rider",
            R.drawable.dark_rider256,
            "Do I look to you like I'm into titties? Eeew! I have no clue where that golden boob is hidden. ",
            "What about this ruby stone?"
        ),

        Act(
            "Dark Rider",
            R.drawable.dark_rider256,
            "That one I dropped? I received it from my ex. Just take it. He cheated on me anyway. Now, leave me alone, I have to fix that terrible makeup.",
            "[Leave]"
        ),
    )
}