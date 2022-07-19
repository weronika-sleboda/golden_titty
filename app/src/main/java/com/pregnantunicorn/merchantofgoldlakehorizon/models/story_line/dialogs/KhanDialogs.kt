package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.dialogs

class KhanDialogs {

    private val lines = arrayOf(

        "Who am I? And what da crap do ya care? That ain't yo' business, pal! And I don't give a crap about who ya is either.",
        "What is it? Any problem, pal?",
        "Yo' listen, I don't like people like ya - the cocky rich punks.",
        "Ya think ya are betta than us, commoners? Oh, ya don't? Oh, please, spare me that fake humility.",
        "Malik? He's a son of da cursed. [He spits on the ground]. Da son of Shadow Lord.",
        "Ya don't know who da Shadow Lord is? What? Ain't ya one of them?",
        "Yo' a liar! Ya one of those heretics. They always lie and they always hidin'",
        "Ya wanna know what happened at da bar on Ship Orion? Ya wanna know how much I can tell people, don't ya?",
        "Will ya try to kill me now, like you tried to kill Aaliyah? Now, that I know yo' bro is possessed?"
    )

    fun getLine(index: Int): String {

        return lines[index]
    }
}