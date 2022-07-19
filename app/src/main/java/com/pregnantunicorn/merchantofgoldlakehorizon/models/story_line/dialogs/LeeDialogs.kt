package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.dialogs

class LeeDialogs {

    private val lines = arrayOf(

        "What's up? My name's Lee. I'm currently the captain of Ship Orion. Welcome to Goldlake!",
        "What's up, Sonny? Come in onboard. Take a sit and relax. We have a great weather for sailing today.",
        "You want to see that famous column? I'm sorry, but I'm forced to sail around that area. There are still remnants of the old city underwater.",
        "I never have swam around Column Of Damnation. I'm not that good swimmer, but Sir Malik did.",
        "The Column Of Damnation is an important pilgrimage site for the heretics.",
        "The heretics believe that the old city was the place where Shadow Lord has been born.",
        "What? No, I don't know that much about the religion of the heretics. They tried to recruit me, but I'm just good with my own faith.",
        "I have a friend who became the priest of the heretic temple. He really believes in that stuff.",
        "Don't you know Pasha? Yeah, he's my friend. He claims he have met Shadow Lord. You know... all the priests claim that they've met their gods."
    )

    fun getLine(index: Int): String {

        return lines[index]
    }
}