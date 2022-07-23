package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.dialogues

class AaliyahDialogs {

    private val lines = arrayOf(

        "Hello, there! Are you new in town? I'm Aaliyah - the owner of the clothing shop Green House.",
        "Your white robe is so beautiful. It looks almost otherworldly. I found a similar one in the bushes.",
        "You want to see that robe I found? I'm sorry but I already sold it.",
        "You wonder who bought that robe that I found in the bushes? It was Maxim.",
        "Maxim offered me 1000 golden coins for that otherworldly robe I found. I wonder why, if he never wears it.",
        "Which town are you from? Maybe I'll visit it. I'm moving out from Goldlake next month.",
        "Why am I moving out from Goldlake? Well, It's complicated.",
        "Would you judge me if I told you I was a foreigner as well?",
        "I'm from... Let us say... I'm not from here. Please, don't ask me questions about my home town.",
    )

    fun getLine(index: Int): String {

        return lines[index]
    }
}