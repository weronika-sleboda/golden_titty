package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.dialogs

class EricaDialogs {

    private val lines = arrayOf(

        "Wandering merchant, you say? [She smiles in a flirty way]. I'm Erica - the manager of Golden Palace. I can rent you a bed at sunset and morning.",
        "Did you sleep well?",
        "Your robe... It's very unique... I even would say otherworldly [She gives you a flirty smile].",
        "Sonny, can I give you and advice? Please, buy a new robe. This one is screaming: I'm from... [She stops herself] I'm from far away.",
        "How is your life going? Did you make any friends?",
        "Can I recommend you some good sightseeing places? Volcano Area is a very interesting place to to see [She winks]",
        "Did you ever travel on Ship Orion through the lake at sunset? I did. There is so much to see... I promise [She winks]",
        "Are you okay now? I heard you almost got killed. Can I see your wound? [She touches your back]. It's made by a sword, did you know that?",
        "Me? Why do you suddenly want to know so much about me? I told you already [She winks]. I'm Erica - the manager of Golden Palace."
    )

    fun getLine(index: Int): String {

        return lines[index]
    }
}