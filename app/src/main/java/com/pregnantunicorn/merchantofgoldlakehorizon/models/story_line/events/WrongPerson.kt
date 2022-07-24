package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.events

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.Act
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.LongEvent

object WrongPerson {

    val event = LongEvent(

        Act(
            "The Carriage",
            R.drawable.carriage256_sunset,
            "As you are walking along the street, you notice Jin searching through the carriage and Brianna standing by his side.",
            "[Watch from hiding]"
        ),

        Act(
            "Jin",
            R.drawable.jin256,
            "[He shuts a book] Crap! She's from Pearl Coast!",
            "[Watch from hiding]"
        ),

        Act(
            "Brianna",
            R.drawable.brianna256,
            "We should go. Someone could see us.",
            "[Watch from hiding]"
        ),

        Act(
            "Jin",
            R.drawable.jin256,
            "I got the wrong person, crap! He still is out there somewhere. I'm sorry... ",
            "[Watch from hiding]"
        ),

        Act(
            "Brianna",
            R.drawable.brianna256,
            "I know you tried to help me, but this was wrong, Jin. Don't try to do it again. Please, I don't want anyone to get hurt again.",
            "[Watch from hiding]"
        ),

        Act(
            "Jin",
            R.drawable.jin256,
            "I was... I was almost sure, she was him. She had his robe. Crap! I almost killed her. What should we do now?",
            "[Watch from hiding]"
        ),

        Act(
            "Brianna",
            R.drawable.brianna256,
            "We can escape the town... But he will find me there as well after a while. Killing him won't change anything either. He will soon be replaced by others.",
            "[Stop watching]"
        ),
    )
}