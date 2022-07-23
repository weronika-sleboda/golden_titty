package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.dialogues

class LeeDialogs {

    private val lines = arrayOf(

        "What's up? My name's Lee. I'm currently the captain of Ship Orion. Welcome to Goldlake!",
        "I'm one of the commoners. I was born into a poor family.",
        "Me, Khan, Sophia and Pasha were growing up together on Goldlake's beach.",
        "Me, Khan, Sophia and Pasha were all the outcasts of the society, we were all poor.",
        "Pasha was my best friend, but sadly... He's not anymore.",
        "I introduced Pasha to lady Nikita and Sir Malik. I wanted him to have a stable job. He was their tour guide.",
        "Maybe it was the wrong thing to introduce Pasha to the heretics, but I don't regret it. ",
        "If I didn't introduce Pasha to the heretics he would still struggle on the streets.",
        "Since Pasha became the shadow priest, he's not himself anymore... but nevertheless, he's at least rich."
    )

    fun getLine(index: Int): String {

        return lines[index]
    }
}