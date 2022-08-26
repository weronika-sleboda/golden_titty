package com.pregnantunicorn.goldentitty.models.story_line.events

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.story_line.Act
import com.pregnantunicorn.goldentitty.models.story_line.LongEvent
import com.pregnantunicorn.goldentitty.models.story_line.ShortEvent

object CampFireEvent {

    val event = LongEvent(

        Act(
            "Ticky Tacka Island",
            R.drawable.ticky_tacka_island256,
            "Saphonee: Finally, we're here. The Ticky Tacka Island. Hopefully, the rumors are true.",
            "[Turn around]"
        ),

        Act(
            "Jin",
            R.drawable.jin256,
            "I know what I heard. The high priestess of the Temple Of Sunrise was clear. The Golden Titty of the Goddess Chidinma is hidden on this island.",
            "What if it's not?"
        ),

        Act(
            "Jin",
            R.drawable.jin256,
            "It is. According to the history books, this island was a pilgrimage site for Chidinma's worshippers for decades. If the Golden Titty wasn't here, what would they come out to see?",
            "[Listen]"
        ),

        Act(
            "Saphonee",
            R.drawable.saphonee256,
            "I have know clue... The island is totally deserted... If there is something of value here, then it has to be buried under the ground.",
            "[Turn around]"
        ),

        Act(
            "???",
            R.drawable.secret_gate256_morning,
            "There is a strange gate standing on the right side of the island.",
            "What's that?"
        ),

        Act(
            "Saphonee",
            R.drawable.saphonee256,
            "It looks like a gate [She tries to pass through] What in...? It pushes me back. ",
            "[Turn around]"
        ),

        Act(
            "Jin",
            R.drawable.jin256,
            "It has to be the entrance to the Temple Of Eclipse. The high priestess said it's hidden from the unbelievers. I guess the gate is protected by a magical barrier.",
            "[Turn around]"
        ),

        Act(
            "Saphonee",
            R.drawable.saphonee256,
            "Interesting... We have to start building the excavation sites as soon as possible and dig for some answers. The Golden Titty has to be here, otherwise what is all this protection for?",
            "Yeah, let's go!"
        ),

        Act(
            "Ticky Tacka Island",
            R.drawable.ticky_tacka_island256,
            "Saphonee: Finally, we're here. The Ticky Tacka Island. Hopefully, the rumors are true.",
            "[Turn around]"
        ),

        )
}