package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.dialogues

class SerenityDialogs {

    private val lines = arrayOf(

        "Um... I... I'm Serenity - the manager of the theatre. Why... Why are you asking?",
        "Um... I don't understand... Why are you here? What do you want from me?",
        "Why do you want to know so much about me? [She seems scared of you] Did I do something wrong?",
        "Please, tell me... What is it about? Why do you visit me? What are you looking for?",
        "Do you know that I can see things? Are you able to see that ability in me?",
        "I.. Sorry... Please, stop visiting me. You know what I mean... Why me? Why are you here?",
        "Don't tell me, you don't know what I mean. I know who you are. I can see that.",
        "What don't you understand? Let me repeat. I can see you. I see your true nature.",
        "I was born this way. I'm a a psychic. I can see divine beings. Please, leave me alone. I don't want to get involved."
    )

    fun getLine(index: Int): String {

        return lines[index]
    }
}