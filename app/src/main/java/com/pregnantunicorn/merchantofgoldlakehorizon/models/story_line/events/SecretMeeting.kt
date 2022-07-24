package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.events

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.Act
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.ShortEvent

object SecretMeeting {

    val event = ShortEvent(

        Act(
            "The Volcano",
            R.drawable.volcano128_night,
            "As you are walking by the volcano, you stumble upon a group of strange individuals. Luckily they don't see you.",
            "[Watch from hiding]"
        ),

        Act(
            "???",
            R.drawable.white_heretic256,
            "[He has a voice of a male] Don't worry. I will take care of him.",
            "[Watch from hiding]"
        ),

        Act(
            "???",
            R.drawable.brown_heretic256,
            "[He has a voice of a male] Be sure you do that. Our Lord, doesn't want to be discovered.",
            "[Watch from hiding]"
        ),

        Act(
            "Unknown Male",
            R.drawable.white_heretic256,
            "I will. I'm the master of deception. I know what to do. He won't be able to separate the truth from the lie.",
            "[Stop watching.]"
        )
    )
}