package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.events

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.Act
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.LongEvent
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.ShortEvent

object MysteriousPerson {

    val event = LongEvent(

        Act(
            "The Mysterious Person",
            IconFactory().column256(),
            "As you're walking along the beach, admiring the views, you notice from far away that someone is standing on the top of the column in the middle of the lake.",
            "[Try to see who it is]"
        ),

        Act(
            "Mysterious Person",
            IconFactory().mysteriousPerson256(),
            "[The mysterious person is watching you]",
            "[Keep the eye contact]"
        ),

        Act(
            "Erica",
            IconFactory().erica256(),
            "[Suddenly Erica appears out of nowhere] This column is a remnant of the old city of Goldlake. It's the only building that is left, after the meteor destroyed the city.",
            "Who is that person?"
        ),

        Act(
            "Erica",
            IconFactory().erica256(),
            "Who are you talking about? ",
            "[Point the finger]"
        ),

        Act(
            "Erica",
            IconFactory().erica256(),
            "What do you mean? There are no one standing there. [She laughs] It's okay. You're a foreigner. You're not used to Goldlake's heating sun.",
            "[Look at the column]"
        ),

        Act(
            "The Column",
            IconFactory().column256(),
            "There is no one standing on the top of the column, but you know you didn't imagine that.",
            "[Turn towards Erica]"
        ),

        Act(
            "Erica",
            IconFactory().erica256(),
            "Maybe it was a huge bird. There is no way someone would climb this enormous column, unless... this person has supernatural powers. [She winks] Sorry, I have to go back to work. Have a nice day.",
            "[Leave]"
        ),
    )
}