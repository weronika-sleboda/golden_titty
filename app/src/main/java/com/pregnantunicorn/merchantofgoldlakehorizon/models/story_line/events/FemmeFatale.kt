package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.events

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.Act
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.ShortEvent

object FemmeFatale {

    val event = ShortEvent(

        Act(
            "The Femme Fatale",
            IconFactory().beach256(),
            "As you're walking along the beach, you see a woman sitting on a carpet and drawing symbols in the sand.",
            "[Watch from hiding]"
        ),

        Act(
            "Nikita",
            IconFactory().nikita256(),
            "I know you're watching me. Are you looking at me or at my drawings?",
            "[Approach]"
        ),

        Act(
            "Nikita",
            IconFactory().nikita256(),
            "You're not that talkative. Do I make you self-conscious?",
            "[Look at the drawings]"
        ),

        Act(
            "Nikita",
            IconFactory().nikita256(),
            "[She stands up and gently covers your eyes] Sorry, handsome. This is nothing of your concern... " +
                    "but if you are interested in this kind of... art, you can find me at the boat bar on Ship Orion.",
            "[Leave]"
        )
    )
}