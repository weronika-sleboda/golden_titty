package com.pregnantunicorn.goldentitty.models.story_line.events

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.story_line.Act
import com.pregnantunicorn.goldentitty.models.story_line.EventTitle
import com.pregnantunicorn.goldentitty.models.story_line.ShortEvent
import com.pregnantunicorn.goldentitty.models.world_map.world.LocationName

object ThirdFloorOpeningEvent {

    val event = ShortEvent(

        EventTitle.THIRD_FLOOR_OPENING_EVENT,

        Act(
            "Dark Rider",
            R.drawable.dark_rider256,
            "Who is storming my chamber?!",
            "Um... It's us"
        ),

        Act(
            "Lady Silvia",
            R.drawable.lady_silvia256,
            "No... Just not another freak...",
            "[Sigh]"
        ),

        Act(
            "Dark Rider",
            R.drawable.dark_rider256,
            "Who us?! Look what you have done! See?! I was making my makeup and my hand shook because of you. Now I have to start over.",
            "We're sorry"
        ),

        Act(
            "Dark Rider",
            R.drawable.dark_rider256,
            "I don't care... The damage is already done. I have a date in a hour and I look like a clown. Now, get out! [He attacks you]",
            "[Fight back]"
        ),
    )
}