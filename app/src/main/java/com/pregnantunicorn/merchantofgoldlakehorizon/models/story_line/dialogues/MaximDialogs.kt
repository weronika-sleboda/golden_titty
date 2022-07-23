package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.dialogues

class MaximDialogs {

    private val lines = arrayOf(

        "Hello there, newcomer! I'm Maxim, the manager of the university. You're welcome to visit me any time you like.",
        "Please, Sonny, sit down. Tell me little about yourself. I barely know anything about you.",
        "So? Where are you from exactly?",
        "Are you from Seven Stars, you say? Could you show me that location on the map? Is it a village or a town?",
        "Did Aaliyah tell you that I bought a white robe from her? That's strange, because she gave it to me as a present.",
        "Aaliyah never speaks about her home town... Don't you think it's weird? Like is she's hiding something.",
        "If you want to know anything about the townspeople. Ask me first. I'm very good at gathering information.",
        "Shadow Temple? It's just a party place for the rich kids nothing more...",
        "I don't want to gossip, but you should be aware of Daniel. I once saw him in the cave doing some weird stuff."
    )

    fun getLine(index: Int): String {

        return lines[index]
    }
}