package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.dialogues

class PashaDialogs {

    private val lines = arrayOf(

        "I'm Pasha - the priest of Shadow Temple. What's the point of this interview?",
        "What do you want? If you want to pray, make your offering at the altar and leave. Don't sneak around.",
        "Why did I chose Shadow Lord? No. It was him who chose me. He revealed himself to me.",
        "I was born poor. I always struggled, I couldn't find a job and couldn't pay the bills, but Shadow Lord rescued me.",
        "Creator?! Don't mention that name to me! He doesn't exist! Where was he when I needed him?!",
        "I grew up believing in Creator. I had strong faith, but he never helped me. All my life was his curse!",
        "If you still believe in Creator, you're naive. You're just another pawn in his sick game.",
        "Shadow Lord has been born by himself. He establishes his own rules. He has power to oppose Creator.",
        "I don't lie. I have met Shadow Lord. I saw him with my own eyes. He is real and he lives among us."
    )

    fun getLine(index: Int): String {

        return lines[index]
    }
}