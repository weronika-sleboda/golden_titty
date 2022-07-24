package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.events

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.Act
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.MiniEvent

object AaliyahsDiary {

    val event = MiniEvent(

        Act(
            "???",
            R.drawable.closed_book256,
            "As you are searching through the carriage, you notice a book lying on a pile of someone's belongings.",
            "[Open The Book]"
        ),

        Act(
            "Aaliyah's Diary - March 9th",
            R.drawable.open_book256,
            "\"Thanks Creator I'm alive. After I was stabbed in the volcano area, I don't feel safe in Goldlake anymore. Someone has to know I'm from Pearl Coast. I tried to hide it, but I failed.\"",
            "[Shut The Book"
        )
    )
}