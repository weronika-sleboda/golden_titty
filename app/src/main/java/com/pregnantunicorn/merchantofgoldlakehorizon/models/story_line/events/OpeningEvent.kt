package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.events

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.Act
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.LongEvent
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.SuperLongEvent

object OpeningEvent {

    val event = LongEvent(

        Act(
            "The Divine Altar",
            R.drawable.divine_altar256,
            "You are standing before the holy altar of Creator - the god of the whole universe.",
            "Why am I here?"
        ),

        Act(
            "Creator",
            R.drawable.eye256,
            "You have broken my divine rules and took your own life.",
            "Did I?"
        ),

        Act(
            "Creator",
            R.drawable.eye256,
            "You don't remember, because I have reprogrammed you. From now on, you are Meteor - my divine messenger.",
            "I don't understand"
        ),

        Act(
            "Creator",
            R.drawable.eye256,
            "Your main purpose in life is now to watch over my other creations and take care of their souls.",
            "What does it mean?"
        ),

        Act(
            "Creator",
            R.drawable.eye256,
            "I will send you back to Seven Stars - your former hometown, in a disguise of a worldly creature.",
            "[Keep listening]"
        ),

        Act(
            "Creator",
            R.drawable.eye256,
            "Solve the problems of 6 townspeople. You can find the full list of those people in your backpack with all the details.",
            "[Keep listening]"
        ),

        Act(
            "Creator",
            R.drawable.eye256,
            "When you save all of those people, a divine gate will suddenly appear in the town. Go through that gate to complete the mission. ",
            "[Wake up]"
        )
    )
}