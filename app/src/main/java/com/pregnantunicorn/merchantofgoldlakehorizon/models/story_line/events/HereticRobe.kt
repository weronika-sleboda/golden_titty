package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.events

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.dialog_messages.DialogMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.Act
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.MiniEvent

object HereticRobe {

    val event = MiniEvent(

        Act(
            "The Volcano",
            R.drawable.volcano128_morning,
            "As you are walking by the volcano, you notice a robe lying on the ground between the pile of stones.",
            "[Grab it]"
        ),

        Act(
            "The Heretic Robe",
            R.drawable.heretic_robe256,
            "It looks a little bit worn out, but if you take it and wear it, entering Shadow Temple will cost you less charisma points.",
            "[Put in the backpack]"
        ),
    )

}