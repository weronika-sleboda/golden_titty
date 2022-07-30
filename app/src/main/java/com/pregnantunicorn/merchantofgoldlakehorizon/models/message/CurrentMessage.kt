package com.pregnantunicorn.merchantofgoldlakehorizon.models.message

object CurrentMessage {

    private lateinit var message: Message
    fun message() = message

    fun changeMessage(title: String, icon: Int, content: String) {

        message = Message(title, icon, content)
    }
}