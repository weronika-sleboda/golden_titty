package com.pregnantunicorn.goldentitty.models.npcs

import com.pregnantunicorn.goldentitty.models.player.Player

class SaphoneesGreetings {

    fun greeting(): String {

        return when(0) {

            0 -> "I won't sleep in the the same tent with two guys. I want a hut for myself. Until then I sleep outside."
            1 -> ""
            2 -> ""
            3 -> ""
            4 -> ""
            5 -> ""
            6 -> ""
            7 -> ""
            8 -> ""
            9 -> ""
            10 -> ""
            else -> ""
        }
    }

    companion object {

        private var counter = 0
    }

    fun afterMeal(): String {

        counter++

        return when(counter) {

            1 -> ""

            else -> {

                ""
            }
        }
    }

    fun isFedLine(): String {

        counter++

        return when(counter) {

            1 -> "No thanks. If I eat one more, I won't fit into my bikini."

            else -> {

                counter = 0
                "Meteor?! Are you even listening?! I'm on diet!"
            }
        }
    }
}