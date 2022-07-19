package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.dialogs

class BrianaDialogs {

    private val lines = arrayOf(

        "I never have seen you before. Are you new in town? Who am I? I'm Brianna - The Priestess of Divine Temple. I'm at your service.",
        "Oh, I didn't expect to see you in the temple again. You seem very religious.",
        "I'm so jealous of you sometimes. I wish I could live a normal life as well.",
        "Priests of Divine Temple are not allowed to marry. When you make a vow, you're bound by certain rules for life.",
        "Why did I choose to be a priestess? Hmmm... [She suddenly gets a sad look on her face] Well, it's complicated.",
        "Jin? Why are you asking about him? We're just friends. Did he tell you something?",
        "Jin and I have much in common. We are both married to our duty, that's why I enjoy hanging out with him.",
        "Love clouds people's minds. That's why divine priests are not allowed to engage in romantic relationships.",
        "Love is like a magic spell. Once someone puts that spell on you, you lose your self-control."
    )

    fun getLine(index: Int): String {

        return lines[index]
    }
}