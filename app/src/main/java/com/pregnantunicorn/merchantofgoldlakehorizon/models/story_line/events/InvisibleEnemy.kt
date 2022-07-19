package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.events

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.Act
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.LongEvent

object InvisibleEnemy {

    val event = LongEvent(

        Act(
            "The Invisible Enemy",
            IconFactory().forestAtNight256(),
            "As you're walking around the forest at night, you suddenly get stabbed in the back with a blade and lose your consciousness.",
            "[Black out]"
        ),

        Act(
            "Creator",
            IconFactory().creator256(),
            "Someone tried to kill you, but because of that whole in the system I couldn't see who it was. The only way for me to monitor Goldlake right now is through praying believers.",
            "[Keep listening]"
        ),

        Act(
            "Creator",
            IconFactory().creator256(),
            "When you wake up, take a closer look at the first person you meet. It could be Horizon. I don't hear any prayers right now so I don't have any clue what's happening in Goldlake.",
            "[Wake up]"
        ),

        Act(
            "Jin",
            IconFactory().jin256(),
            "[Whispers] I love you, but we have to stop this. It's the second foreigner that almost get killed. You know why and you know who will be next.",
            "[Pretend you're sleeping]"
        ),

        Act(
            "Brianna",
            IconFactory().brianna256(),
            "[She whispers] No, we can't stop! If we stop right now, it would mean that we fought for nothing.  I'm already doomed anyway. Giving up won't change anything.",
            "[Pretend you're sleeping]"
        ),

        Act(
            "Jin",
            IconFactory().jin256(),
            "[He whispers] I don't want you to share the same fate as those foreigners. He's here and he is looking for you.",
            "[Pretend you're sleeping]"
        ),

        Act(
            "Brianna",
            IconFactory().brianna256(),
            "[She whispers] I know... [She kisses Jin] But you don't have to worry that much... I'm not alone. I have protectors. They will handle him.",
            "[Fall asleep]"
        )
    )
}