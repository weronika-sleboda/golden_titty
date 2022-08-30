package com.pregnantunicorn.goldentitty.models.story_line.events

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.story_line.Act
import com.pregnantunicorn.goldentitty.models.story_line.EventTitle
import com.pregnantunicorn.goldentitty.models.story_line.MiniEvent
import com.pregnantunicorn.goldentitty.models.world_map.world.LocationName

object LadySilviasDeathEvent {

    val event = MiniEvent(

        EventTitle.LADY_SILVIAS_DEATH,

        Act(
            "Game Over",
            R.drawable.lady_silvia256,
            "How could you starve me to death?! Not that I have a stomach, but I at least would like to imagine I'm eating those fish you give me.",
            "But you're still alive"
        ),

        Act(
            "Game Over",
            R.drawable.lady_silvia256,
            "Of course I am. I'm an undead skeleton, but it doesn't change the fact that I died my thousandth death, which was actually painful. I'm firing you!",
            "[Exit to main menu]"
        ),
    )
}