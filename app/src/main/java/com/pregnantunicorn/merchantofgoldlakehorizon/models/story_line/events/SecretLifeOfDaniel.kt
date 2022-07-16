package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.events

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.Act
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.LongEvent

object SecretLifeOfDaniel {

    val event = LongEvent(

        Act(
            "The Secret Life Of Daniel",
            IconFactory().desk256(),
            "As you're walking around the university, you see Maxim whispering something to Serenity a few desks from  you.",
            "[Eavesdrop]"
        ),

        Act(
            "Maxim",
            IconFactory().maxim256(),
            "I'm only telling you what I saw... ",
            "[Eavesdrop]"
        ),

        Act(
            "Serenity",
            IconFactory().serenity256(),
            "Daniel? Are you sure?",
            "[Eavesdrop]"
        ),

        Act(
            "Maxim",
            IconFactory().maxim256(),
            "Yes. It happened at night when I walked by the forest. He was standing there wearing a white robe and chanting something in a weird language.",
            "[Eavesdrop]"
        ),

        Act(
            "Maxim",
            IconFactory().maxim256(),
            "Serenity? What happened? You suddenly went pale... ",
            "[Eavesdrop]"
        ),

        Act(
            "Serenity",
            IconFactory().serenity256(),
            "Sorry, I would like to hear the rest of the story but I have to go home... I don't feel well.",
            "[Eavesdrop]"
        ),

        Act(
            "Maxim",
            IconFactory().maxim256(),
            "It's okay. When I saw Daniel in that forest, I felt the same.",
            "[Stop eavesdropping]"
        )
    )
}