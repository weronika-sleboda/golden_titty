package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.dialogues

class AaliyahDialogs {

    private val lines = arrayOf(

        "Hello, there! Are you new in town? That's so cool. I'm Aaliyah - the owner of the clothing shop Green House.",
        "Hello, Sonny! Check out my new robes if you have some spare time. I have very good prices.",
        "That white robe that you're wearing, is it the only one you own? I found a similar one in the forest.",
        "I never sell things I find in the forest. It's a fake rumor. I only did it once, because Maxim begged me.",
        "When Maxim saw that white robe in my hand he said: \"Where did you get it from?\" and offered me 5000 golden coins for it.",
        "I sold that white robe to Maxim, because I really needed that money. I need money for my next travel.",
        "Oh, didn't you know? I'm moving out from Goldlake. I will stay here for 2 months and then continue to travel around the world.",
        "Why does everyone asking me about my home country? What does it matter?",
        "My home country? Why do you keep asking? I'm tired of those questions [She seems very angry]. It's none of anyone's concern!",
    )

    fun getLine(index: Int): String {

        return lines[index]
    }
}