package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.dialogs

class MaximDialogs {

    private val lines = arrayOf(

        "Hello there, newcomer! I'm Maxim, the manager of the university. You're welcome to visit me any time you like.",
        "Hello again! Please, Sonny, sit down. Tell me little about yourself. I barely know anything about you.",
        "So? Where are you from? What town exactly?",
        "Are you from a very small village? Tell me the name, don't hesitate. I will know which one it is. I'm a teacher, I'm very good at geography.",
        "",
        "",
        "",
        "",
        ""
    )

    fun getLine(index: Int): String {

        return lines[index]
    }
}