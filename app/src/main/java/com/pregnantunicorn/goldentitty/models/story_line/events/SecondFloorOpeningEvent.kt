package com.pregnantunicorn.goldentitty.models.story_line.events

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.story_line.Act
import com.pregnantunicorn.goldentitty.models.story_line.LongEvent
import com.pregnantunicorn.goldentitty.models.story_line.SuperLongEvent
import com.pregnantunicorn.goldentitty.models.world_map.world.LocationName

object SecondFloorOpeningEvent {

    val event = LongEvent(

        Act(
            "Sentino",
            R.drawable.sentino256,
            "Ghh.... arh... Get... out....",
            "[Jump from fear]"
        ),

        Act(
            "Lady Silvia",
            R.drawable.lady_silvia256,
            "Meteor, be careful! This man is some kind of psycho! ",
            "Don't worry. I handle him."
        ),

        Act(
            "Sentino",
            R.drawable.sentino256,
            "Agh... um... Get...mgh... out... ",
            "He looks so pale"
        ),

        Act(
            "Lady Silvia",
            R.drawable.lady_silvia256,
            "[She hides behind you] Not that I look any better, but this guy looks like a spook.",
            "[Nod]"
        ),

        Act(
            "Sentino",
            R.drawable.sentino256,
            "Agh... um... I know... This... This tantamen ramen I ate yesterday... Ghmm... agh... My stomach hurts... I'm never going to eat at the Stinky Shoe tavern again.",
            "Maybe it was too spicy"
        ),

        Act(
            "Sentino",
            R.drawable.sentino256,
            "Gh... um... or... the pork wasn't fresh... Anyway...As I was saying... Get... agh... out...",
            "[Fight him]"
        ),

        )
}