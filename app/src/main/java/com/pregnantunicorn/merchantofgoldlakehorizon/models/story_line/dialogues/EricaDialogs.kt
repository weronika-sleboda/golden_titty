package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.dialogues

class EricaDialogs {

    private val lines = arrayOf(

        "Wandering merchant, you say? [She smiles in a flirty way]. ",
        "I'm Erica - Let us say, I'm a wandering merchant as well [She winks]. ",
        "What am I doing in the town of Goldlake? Exactly the same thing as you're doing [She winks].",
        "Can I give you an advice? Get rid of that white robe you're used to wear. It's like a big sign: I'm a foreigner.",
        "Which town am I'm from? [She laughs] That's funny... because I'm from the same town as yours [She winks].",
        "You said you were from Seven Stars. I'm also from that town. What a coincidence isn't it?",
        "Be careful. Goldlake is not as peaceful town as it seems to be.",
        "Didn't you know? There already was a murder attempt in the town.",
        "Don't be to sneaky when it comes to townspeople. Remember I warned you."
    )

    fun getLine(index: Int): String {

        return lines[index]
    }
}