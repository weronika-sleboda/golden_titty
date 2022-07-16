package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.events

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.Act
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.ShortEvent

object BadCompany {

    val event = ShortEvent(

        Act(
            "The Bad Company",
            IconFactory().boatBar256(),
            "As you're walking by a boat bar, you overhear a fight between the captain and his friend.",
            "[Watch from hiding]"
        ),

        Act(
            "Lee",
            IconFactory().lee256(),
            "Stop blaming me for what happened. He is an adult. Becoming a priest of the heretic temple was he's own choice. I only offered him a good job.",
            "[Watch from hiding]"
        ),

        Act(
            "Sophia",
            IconFactory().sophia256(),
            "I blame you because you introduced him to those people! Look what happened! He's not himself anymore! [She cries]",
            "[Watch from hiding]"
        ),

        Act(
            "Lee",
            IconFactory().lee256(),
            "You wrong, Sophia. Look at me. I steered this boat from the first day I met those people and I never got involved with them. It was Pashas own choice to hang out with them.",
            "[Stop watching]"
        )
    )
}