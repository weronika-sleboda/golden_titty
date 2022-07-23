package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.dialogues

class NikitaDialogs {

    private val lines = arrayOf(

        "Shadow Lord help me... Who are you, handsome? My name is Nikita. Nikita Blade, of the famous Blade Family.",
        "Already back? Did you miss me, handsome?",
        "Is it okay for me to touch your arms? [She touches your arms]. You're so athletic. ",
        "Sonny, could you help me with my necklace? It got stuck in my hair. [The pedant on her necklace portrays a hammer].",
        "The hammer on my pedant,? It represents my lord. He is like a hammer that crashes the old system.",
        "Who is my lord? [He touches gently your chest] You don't know? I thought you knew everything about me.",
        "You think I'm trying to seduce you? I'm just being nice... I didn't know I made you so nervous... [She winks]",
        "Me? Well, I'm very proud of who I am. I'm the daughter of Henry Blade. I don't keep it a secret.",
        "I feel weird, now that I know who you are... I really find you attractive. Such a bad, you're not on my side."
    )

    fun getLine(index: Int): String {

        return lines[index]
    }
}