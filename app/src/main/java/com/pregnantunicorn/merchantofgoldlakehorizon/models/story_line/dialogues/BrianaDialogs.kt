package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.dialogues

class BrianaDialogs {

    private val lines = arrayOf(

        "I never have seen you before [She seems shocked to see you]. Are you new in town?",
        "I'm Brianna - the priestess of Divine Temple. I'm at your service.",
        "I'm so jealous of you sometimes. I wish I could live a normal life as well. [She have a sad look on her face].",
        "What do I consider a normal life? [She takes a deep breath] You know... marriage, children, meeting friends...",
        "Why did I choose to be a priestess? [She suddenly gets a sad look on her face] Well, it's complicated.",
        "Jin and I have much in common. We are both married to our duty, that's why I enjoy hanging out with him.",
        "Jin? What? No. We're just friends. I'm a priestess... I'm not allowed to have boyfriends.",
        "Divine servants are not allowed to... love [She looks very sad and seems distant]. I mean... to marry.",
        "Don't you feel lonely sometimes? Trapped in your destiny? I do... Sorry, I'm talking too much..."
    )

    fun getLine(index: Int): String {

        return lines[index]
    }
}