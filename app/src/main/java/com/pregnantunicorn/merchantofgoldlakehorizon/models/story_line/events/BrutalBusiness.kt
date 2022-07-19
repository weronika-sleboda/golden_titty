package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.events

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.Act
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.LongEvent

object BrutalBusiness {

    val event = LongEvent(

        Act(
            "The Brutal Business",
            IconFactory().greenHouse256(),
            "As you're walking by Green House, you witness the female shop keepers grabbing each others hair and screaming at each other in the middle of the street.",
            "[Watch]"
        ),

        Act(
            "Aaliyah",
            IconFactory().aaliyah256(),
            "Stop spreading those rumors! My clothes are not made of rags that I supposedly find in the forest. I thought you where better than that four eyes!",
            "[Keep watching]"
        ),

        Act(
            "Mei",
            IconFactory().mei256(),
            "Excuse me, but I have to disagree. I don't spread rumors I spread facts about you! Why did you open a clothing shop when there was already one in Goldlake?!",
            "[Keep watching]"
        ),

        Act(
            "Mei",
            IconFactory().mei256(),
            "Why didn't you choose to become a merchant just like Sonny? It's a perfect job for a foreigner like you. By the way I'm not a racist, but you're really begging for problems!",
            "[Keep watching]"
        ),

        Act(
            "Mei",
            IconFactory().mei256(),
            "Maybe it's normal in your culture to steal customers, but we don't do that in Goldlake!",
            "[Keep watching]"
        ),
        Act(
            "Mei",
            IconFactory().mei256(),
            "You came to Goldlake one month before Sonny and he has already assimilated into our society, while you still didn't. What city are you even from?",
            "[Keep watching]"
        ),

        Act(
            "Aaliyah",
            IconFactory().aaliyah256(),
            "It's none of your concern! If you won't stop bothering me I'll report you to Arena! [She enters Green House and slams the door behind herself.]",
            "[Stop watching]"
        )
    )
}