package com.pregnantunicorn.goldentitty.models.story_line.events

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.story_line.Act
import com.pregnantunicorn.goldentitty.models.story_line.EventTitle
import com.pregnantunicorn.goldentitty.models.story_line.MiniEvent
import com.pregnantunicorn.goldentitty.models.world_map.world.LocationName

object LadySilviasHutEvent {

    val event = MiniEvent(

        EventTitle.LADY_SILVIAS_HUT_EVENT,

        Act(
            "Lady Silvia's Hut",
            IconFactory().ladySilviasHut256(),
            "You have built a hut for Lady Silvia",
            "[Show it to her]"
        ),

        Act(
            "Lady Silvia",
            R.drawable.lady_silvia256,
            "What took you so long?! I'm tired of sharing that tent with you and cleaning after you. I ain't yo' mama!",
            "Anyway, it's done!"
        ),
    )
}