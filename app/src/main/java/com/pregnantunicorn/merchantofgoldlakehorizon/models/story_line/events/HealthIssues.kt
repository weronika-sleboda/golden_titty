package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.events

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.Act
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.ShortEvent

object HealthIssues {

    val event = ShortEvent(

        Act(
            "The Health Issues",
            IconFactory().theatreScene256(),
            "As you're walking by the theatre scene, you notice Serenity holding the wall and looking pale.",
            "[Approach her]"
        ),

        Act(
            "Serenity",
            IconFactory().serenity256(),
            "[When she sees you, her eyes widens and she seems terrified] ...",
            "Is everything alright?"
        ),

        Act(
            "Serenity",
            IconFactory().serenity256(),
            "Um... I... I... ",
            "Do you need help?"
        ),

        Act(
            "Serenity",
            IconFactory().serenity256(),
            "I.. I have to go... [She rushes through the exit door]",
            "[Leave]"
        ),
    )
}