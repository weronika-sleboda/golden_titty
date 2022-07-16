package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.events

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.Act
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.ShortEvent

object LostSoul {

    val event = ShortEvent(

        Act(
           "The Lost Soul",
            IconFactory().shadowAltar256(),
            "As you're walking around the temple of the heretics, you suddenly overhear " +
                    "a fierce conversation just in front of the altar.",
            "[Watch from hiding]"
        ),

        Act(
            "Sophia",
            IconFactory().sophia256(),
            "Please, Pasha. Stop this! I don't recognize you anymore. This is wrong! You can still quit this thing. Creator will grant you forgiveness. I can talk to Brianna...",
            "[Watch from hiding]"
        ),

        Act(
            "Pasha",
            IconFactory().pasha256(),
            "I don't care about your useless god! What did he do for me?! " +
                    "I was leaving in poverty whole my life! Where was he?! Why didn't he help me?! Answer me!",
            "[Watch from hiding]"
        ),

        Act(
            "Sophia",
            IconFactory().sophia256(),
            "What happened to you?! Why did you suddenly become this way? [She cries and runs out of the temple]",
            "[Stop watching]"
        )
    )
}