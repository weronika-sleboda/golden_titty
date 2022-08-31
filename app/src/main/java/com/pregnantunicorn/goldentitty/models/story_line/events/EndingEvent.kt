package com.pregnantunicorn.goldentitty.models.story_line.events

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.story_line.Act
import com.pregnantunicorn.goldentitty.models.story_line.EventTitle
import com.pregnantunicorn.goldentitty.models.story_line.SuperLongEvent
import com.pregnantunicorn.goldentitty.models.world_map.world.LocationName

object EndingEvent {

    val event = SuperLongEvent(

        EventTitle.ENDING,

        Act(
            "Lady Silvia",
            R.drawable.lady_silvia256,
            "Finally! The Golden Titty is mine. As promised, here's your reward: 10000 gold coins. Now, let me try this thing out.",
            "Yeah, I'm rich!"
        ),

        Act(
            "Lady Silvia",
            R.drawable.young_lady_silvia256,
            "[She sucks on the Golden Titty and suddenly turns into that hot young female] Yes, I'm sexy again! ",
            "Drop your jaw"
        ),

        Act(
            "Aaliyah",
            R.drawable.aaliyah256,
            "[Out from nowhere another female is storming the building] What???!! I can't believe it!!! How could you, Meteor?! [She slams you in the cheek].",
            "Aaliyah?!"
        ),

        Act(
            "Aaliyah",
            R.drawable.aaliyah256,
            "What is it?! Did I interrupt your honeymoon?! [She attacks Lady Silvia and pulls her hair] What makes that hag better than me?! Answer me! [She cries]",
            "She's not my lover!"
        ),

        Act(
            "Lady Silvia",
            R.drawable.young_lady_silvia256,
            "Excuse me?! I'm not a hag! [She pushes Aaliyah] And stop molesting the Golden Titty! You will damage it! Meteor, who is she?",
            "She's my crazy ex"
        ),

        Act(
            "Aaliyah",
            R.drawable.aaliyah256,
            "[She keeps hitting Lady Silvia] You didn't answer me when I summoned you! You said you needed some space! Meanwhile, you build a house for this courtesan!",
            "What's wrong with you?!"
        ),

        Act(
            "Lady Silvia",
            R.drawable.young_lady_silvia256,
            "A courtesan?! How dare you?! [She pulls Aaliyah's hair]",
            "Stop this!"
        ),

        Act(
            "Aaliyah",
            R.drawable.aaliyah256,
            "You built the whole island for her!!! I have seen everything! A workshop, a cozy campfire, a pier... Meteor, what the crap?!",
            "You're crazy!"
        ),

        Act(
            "The End",
            R.drawable.fight256,
            "Well... It looks like they will fight for a while...",
            "[Sneak out of there]"
        ),
    )
}