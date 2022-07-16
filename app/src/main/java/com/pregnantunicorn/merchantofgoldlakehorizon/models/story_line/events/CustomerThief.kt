package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.events

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.Act
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.LongEvent

object CustomerThief {

    val event = LongEvent(

        Act(
            "The Customer Thief",
            IconFactory().grayRobe256(),
            "As you're looking around Red Velvet, you stumble upon this beautiful robe.",
            "[Try it]"
        ),

        Act(
            "Mei",
            IconFactory().mei256(),
            "Excellent choice! This robe will bring out your black eyes. Please, let me help you, lovely customer.",
            "[Let her help you]"
        ),

        Act(
            "Mei",
            IconFactory().mei256(),
            "[She touches your robe] I'm so sorry. I shouldn't have done this but this fabric... I only have seen it once in my life. Wait... Did that hag Aaliyah sold it to you?!",
            "I don't understand"
        ),

        Act(
            "Mei",
            IconFactory().mei256(),
            "Of course, you don't understand. You're a foreigner. I'm talking about that pink-haired incubus from Green House. She steals my customers all the time. I can't believe she did it again.",
            "No, she didn't."
        ),

        Act(
            "Mei",
            IconFactory().mei256(),
            "Please, you don't have to lie to comfort me. Where else could you buy it? I have traveled around the world and never have seen such a fabric. It's like from another world.",
            "[Keep listening]"
        ),
        Act(
            "Mei",
            IconFactory().mei256(),
            "Where did she get that fabric from? Crap! She will force me out of my business.",
            "Does she wear it herself?"
        ),

        Act(
            "Mei",
            IconFactory().mei256(),
            "Thanks Creator not yet. Such a marketing move would totally destroy me, but she already sold a similar robe to yours to Maxim.",
            "[Leave]"
        )
    )
}