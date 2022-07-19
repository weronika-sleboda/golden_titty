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
            "[Suddenly Daniel appears out of nowhere] Afterwards that moron Meteor destroyed the whole city. Luckily, it's only a fable for people with low intelligence.",
            "Why is he a moron?"
        ),

        Act(
            "Daniel",
            IconFactory().daniel256(),
            "You mean Meteor? Well, how can someone blindly follow the orders of others and not be a moron? [He laughs]",
            "[Keep listening]"
        ),
        Act(
            "Daniel",
            IconFactory().daniel256(),
            "Meteor is just another pawn in Creator's sick game. Even if Creator existed I would despise such a god. That's why I'm an atheist.",
            "I feel bad for you"
        ),

        Act(
            "Daniel",
            IconFactory().daniel256(),
            "[He laughs] Because you're just like Meteor. You don't question the questionable. And I'm like Horizon. I'm a free thinker.",
            "[Leave]"
        )
    )
}