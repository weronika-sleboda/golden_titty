package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.dialogues

class MaximDialogs {

    private val lines = arrayOf(

        "Hello there, newcomer! I'm Maxim, the manager of the university. You're welcome to visit me any time you like.",
        "Hello again! Please, Sonny, sit down. Tell me little about yourself. I barely know anything about you.",
        "So? Where are you from? What town exactly?",
        "Are you from a very small village? Tell me the name, don't hesitate. I will know which one it is. I'm a teacher, I'm very good at geography.",
        "Did Aaliyah tell you that I bought a white robe from her? I don't understand... Why did she lie? She gave it to me as a present.",
        "Aaliyah never speaks about her home country... Don't you think it's weird? Like is she's hiding something.",
        "If you want to know anything about the townspeople. Ask me first. You can count on me. I'm very good at gathering information.",
        "Shadow Temple? It's just a party place for the rich kids nothing more... At least now, you know... since Daniel got excluded.",
        "What? Didn't you know? Daniel was the priest of Shadow Temple... but he got replaced by Pasha. Why? He was a madman, trust me..."
    )

    fun getLine(index: Int): String {

        return lines[index]
    }
}