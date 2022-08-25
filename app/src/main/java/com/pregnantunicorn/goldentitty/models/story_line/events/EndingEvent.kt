package com.pregnantunicorn.goldentitty.models.story_line.events

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.story_line.Act
import com.pregnantunicorn.goldentitty.models.story_line.ShortEvent

object EndingEvent {

    val event = ShortEvent(

        Act(
            "Golden Titty",
            R.drawable.golden_titty256,
            "You have managed to run away with the Golden Titty.",
            "Finally"
        ),

        Act(
            "Two Months Later",
            R.drawable.golden_titty256,
            "The Golden Titty was worth more than you expected. You became filthy rich and bought a house on the Pearl Coast Beach.",
            "Yeah!"
        ),

        Act(
            "Special Thanks",
            R.drawable.heart256,
            "Special thanks goes to you lovely gamer for playing the Golden Titty. Thank you!",
            "Exit to main menu"
        ),
    )
}