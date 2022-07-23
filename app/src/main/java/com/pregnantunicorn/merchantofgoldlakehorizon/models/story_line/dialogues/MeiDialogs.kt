package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.dialogues

class MeiDialogs {

    private val lines = arrayOf(

        "Welcome lovely, potential customer! My name is Mei, I'm the owner of Red Velvet. ",
        "My clothing shop is best in town. I don't sell rags like this pink-haired incubus Aaliyah.",
        "Aaliyah? I don't trust this foreigner. She suddenly came out of nowhere and now she's destroying my business.",
        "I don't want to gossip, but... Actually I will. Aaliyah steals my customers all the time.",
        "There was a murder attempt on Aaliyah. I found her bleeding in front of the volcano. She didn't even thank me.",
        "Aaliyah was stabbed with a blade. Probably a sword. Khan and Jin wear swords. Isn't that creepy?",
        "Even though I hate that hag Aaliyah, I feel sorry for her being stabbed. Maybe that's why she wants to leave the town.",
        "Me? I was born in Goldlake. I suppose I represent middle class. I'm not poor, but I wish I was richer.",
        "I heard that the heretics give golden coins to new recruits, but they don't want to recruit me. Why?"
    )

    fun getLine(index: Int): String {

        return lines[index]
    }
}