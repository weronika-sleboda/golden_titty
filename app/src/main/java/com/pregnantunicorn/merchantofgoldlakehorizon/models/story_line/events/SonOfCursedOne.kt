package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.events

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.Act
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.LongEvent

object SonOfCursedOne {

    val event = LongEvent(

        Act(
            "The Son Of Cursed One",
            IconFactory().boatBar256(),
            "As you're sitting behind the bar on the ship deck, you see a guy equipped with swords approaching other guests on Ship Orion.",
            "[Watch from hiding]"
        ),

        Act(
            "Khan",
            IconFactory().khan256(),
            "Hey, yo' punk! I heard ya wanna be entertained! Sadly, Sophia can't do dance for ya. But luckily my swords can dance for ya instead. Wanna see?",
            "[Watch from hiding]"
        ),

        Act(
            "Nikita",
            IconFactory().nikita256(),
            "[Laughs] Do you see that Malik? He totally lost contact with the reality. [She calmly continues to drink her cocktail].",
            "[Watch from hiding]"
        ),

        Act(
            "Malik",
            IconFactory().malik256(),
            "[Ignores Khan and laughs] Yeah, he's hilarious, more entertaining than that beggar girl.",
            "[Watch from hiding]"
        ),

        Act(
            "Khan",
            IconFactory().khan256(),
            "[He puts out his swords] Yo' spoiled son of da cursed one! If ya ever call Sophia a beggar girl again, Imma gonna kill ya!",
            "[Watch from hiding]"
        ),

        Act(
            "Malik",
            IconFactory().malik256(),
            "[Stands up and looks Khan deeply in the eyes and responds calmly] Get out.",
            "[Watch from hiding]"
        ),

        Act(
            "Khan",
            IconFactory().khan256(),
            "[Khan's eyes widens] What da...? [He leaves the boat bar with a terrified look on his face]",
            "[Stop watching]"
        )
    )
}