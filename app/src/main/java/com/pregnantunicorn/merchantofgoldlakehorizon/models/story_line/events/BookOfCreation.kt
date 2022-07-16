package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.events

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.Act
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.LongEvent

object BookOfCreation {


    val event = LongEvent(

        Act(
            "The Book Of Creation",
            IconFactory().book256(),
            "As you're looking around the library, you stumble upon The Book Of Creation.",
            "[Read]"
        ),

        Act(
            "Chapter 12: Verse 3",
            IconFactory().book256(),
            "The leaders of Goldlake were corrupted and evil. They oppressed the poor and committed terrifying crimes. Creator saw that and his wrath was huge.",
            "[Keep reading]"
        ),

        Act(
            "Chapter 12: Verse 4",
            IconFactory().book256(),
            "He said to one of his servants: \"Meteor, I want you to go to one of my worlds and destroy the city of Goldlake.\"",
            "[Keep reading]"
        ),

        Act(
            "Daniel",
            IconFactory().daniel256(),
            "Afterwards that moron Meteor destroyed the whole city. Luckily, it's only a fable for people with low intelligence.",
            "You think so?"
        ),

        Act(
            "Daniel",
            IconFactory().daniel256(),
            "Of course I do. How can someone blindly follow someone's order and not be a moron? [He laughs]",
            "[Keep listening]"
        ),
        Act(
            "Daniel",
            IconFactory().daniel256(),
            "This Meteor is just another pawn in Creator's sick game.",
            "I don't agree"
        ),

        Act(
            "Daniel",
            IconFactory().daniel256(),
            "[He laughs] Because you're just like him. You don't question the questionable. And I'm like Horizon. I'm a free thinker.",
            "[Leave]"
        )
    )
}