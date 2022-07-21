package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.dialogues

class NikitaDialogs {

    private val lines = arrayOf(

        "Shadow Lord help me... Who are you, handsome? My name is Nikita. Nikita Blade, of the famous Blade Family.",
        "Already back? Did you miss me, handsome?",
        "Is it okay for me to touch your arms? [She touches your arms]. You're so athletic. ",
        "Sonny, could you help me with my necklace? It got stuck in my hair. [The pedant on her necklace portrays a hammer].",
        "The hammer on my pedant, you ask? [She touches gently your chest]. If you want to know, you have to prove yourself worthy.",
        "Malik says my dress is too revealing. Take a look at me, Sonny [Her dress is in fact revealing] Do you agree?",
        "You think I'm trying to seduce you? [She laughs] I'm just being nice... I didn't know I made you so nervous... [She winks]",
        "Me? Well, I'm very proud of who I am. I'm the daughter of Henry Blade. I don't keep it a secret. Yes, I swim in golden coins.",
        "Shadow Temple? [She touches gently your chest] Want to be a disciple? I can't wait to be your mistress... [She winks]"
    )

    fun getLine(index: Int): String {

        return lines[index]
    }
}