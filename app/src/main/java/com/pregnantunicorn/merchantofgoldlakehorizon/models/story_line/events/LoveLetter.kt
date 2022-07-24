package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.events

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.Act
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.ShortEvent

object LoveLetter {

    val event = ShortEvent(

        Act(
            "The Carriage",
            R.drawable.carriage256_night,
            "As you are walking by the carriage, you notice a letter lying under it on the ground.",
            "[Grab it]"
        ),

        Act(
            "The Love Letter",
            R.drawable.scroll256,
            "\"I gradually fell in love with you, while I was watching you growing up and helping your father to rebuild the city.\"",
            "[Keep reading]"
        ),

        Act(
            "The Love Letter",
            R.drawable.scroll256,
            "\"You cared about the people and you were dedicated to your duty just like me. I saw loneliness in your eyes, the same loneliness I felt...\"",
            "[Keep reading]"
        ),

        Act(
            "The Love Letter",
            R.drawable.scroll256,
            "\"At first I helped you from the hiding. I was guarding you, then just watched you from the distance. I'm sorry if I seem scary to you, but I feel scared as well...\"",
            "[Keep reading]"
        ),
    )
}