package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.dialogues

class MalikDialogs {

    private val lines = arrayOf(

        "You really don't know who I am?",
        "Sonny? Let me think... No... I don't remember you. Should I?",
        "[He ignores you]",
        "Hey you, could you bring me a cocktail? [He has a very arrogant attitude] Aren't you a waiter?",
        "Oh, now I remember. You're this new merchant. I'm sorry. I took you for a beggar.",
        "I threw golden coins in Sophia's face and told her to dance for me. That was so funny [He laughs].",
        "Does people tell you I'm the son of the cursed one? What if I told you I was the cursed one?",
        "I know you are looking for someone. How do I know that? [He smirks] I have my people in the town.",
        "I'm not the person you are looking for... but it was nice to see you in person... Meteor."
    )

    fun getLine(index: Int): String {

        return lines[index]
    }
}