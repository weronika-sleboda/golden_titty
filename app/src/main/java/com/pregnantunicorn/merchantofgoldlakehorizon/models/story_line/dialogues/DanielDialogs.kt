package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.dialogues

class DanielDialogs {

    private val lines = arrayOf(

        "I'm happy that you chose to stay in our town. I'm Daniel - the manager of the library. ",
        "I love to read books. My favorite one is called \"Jamere\".",
        "What's so special about the novel \"Jamere\"? I somehow identify with Jamere.",
        "Jamere is a fictional character that turns into a stone after he kills his own best friend.",
        "No, I didn't kill anyone... The novel \"Jamere\" is just a metaphor to me.",
        "Sometimes when you do something wrong, the feeling of remorse can make you dead inside... It turns you into a stone.",
        "Do you think Creator can forgive any sin?",
        "Book Of Creation mentions that particular divine messenger... His name is Meteor. He frightens me.",
        "Meteor is the destroyer. Sometimes I'm afraid he will find me and destroy me just like the old town of Goldlake."
    )

    fun getLine(index: Int): String {

        return lines[index]
    }
}