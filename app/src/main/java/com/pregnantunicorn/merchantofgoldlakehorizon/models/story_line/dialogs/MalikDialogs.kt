package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.dialogs

class MalikDialogs {

    private val lines = arrayOf(

        "You really don't know who I am? My family name is Sapphire, does it click for you?",
        "Sonny? Let me think... No... I don't remember you. Should I?",
        "[He ignores you]",
        "Hey you, could you bring me a cocktail? [He has a very arrogant attitude] You're not a waiter? So what? Don't you need money?",
        "Hey... I know who you are. You are that foreigner who got stabbed. I bet it was that beggar whit the swords.",
        "Could you show me that scare on your back? [He looks at your scare] Awesome. You were cut like a fish fillet [He laughs]",
        "Sonny, great to see you. Show me that scare again. Don't want to? I guess it still hurts...",
        "Sophia? I threw a handful of golden coins in her face, and told her: Do the beggar dance for me. And she cried and run away [He laughs].",
        "You think Sophia-story wasn't funny? Yeah, I agree. I know even funnier story than that... like when my lord was filleting you in the forest. [He laughs]",
    )

    fun getLine(index: Int): String {

        return lines[index]
    }
}