package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.dialogs

class DanielDialogs {

    private val lines = arrayOf(

        "Let me introduce myself. My name is Daniel - the manager of the library. I'm happy that you chose to stay in our town.",
        "I'm glad to see you again. Did you find any interesting book?",
        "If you like reading books, I recommend to read those on adventuring. You will never get lost while gathering resources.",
        "Lately, I read this great book called Goldlake Forest - Demystified. Now, I know Goldlake Forest like my own hand.",
        "Why am I so interested in Goldlake forest, you ask? Well, it's a funny story. Maybe I tell you next time.",
        "There is a certain flower in Goldlake Forest that I'm allergic to. I would love to visit the forest at least once, but I can't, because of that flower.",
        "This flower I'm allergic to, is called Night Kiss, because it's especially active at night. If you're allergic, it will literally kiss you good night.",
        "I love to read books. There are many that I already know by heart. Yes, Book Of Creation is one of them.",
        "How come I know Book Of Creation by heart? [He thinks for a second] It's a long story... "
    )

    fun getLine(index: Int): String {

        return lines[index]
    }
}