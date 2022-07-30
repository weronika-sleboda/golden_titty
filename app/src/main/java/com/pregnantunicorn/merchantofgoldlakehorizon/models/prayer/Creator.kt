package com.pregnantunicorn.merchantofgoldlakehorizon.models.prayer

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.Message

class Creator {

    private var info = "Contact me if you need the details on your mission. I can also end the game if you don't have money to pay the rent and are unable to restore your status."
    private var buttonText = "Tell me about my mission."

    fun buttonText() = buttonText
    fun info() = info

    private var counter = 0

    fun giveMeDetails() {

        counter++

        when(counter) {

            1 -> {

                info = "The fallen divinity Horizon is disguising himself as one of the inhabitants of Goldlake."
                buttonText = "What should I do?"
            }

            2 -> {

                info = "Bring him back to me."
                buttonText = "But how?"
            }

            3 -> {

                info = "Befriending all the townspeople will unlock the \"Reveal yourself\"-button. Then you will reveal yourself to the person you suspect to be Horizon in disguise."
                buttonText = "What if I miss?"
            }

            4 -> {

                info = "You are not allowed to interact with wordly creatures in your divine form. That's why I will be forced to take you back to heaven and you'll fail the mission."
                buttonText = "How can I be sure?"
            }

            5 -> {

                info = "Befriend the townspeople and you will get to know them. You can also gather information about them by investigating the locations."
                buttonText = "How do I befriend people?"
            }

            6 -> {

                info = "You befriend people by either trading with them or inviting them to the events. The second one though costs money and you have to be rich."
                buttonText = "Where's the friend icon?"
            }

            7 -> {

                info = "Friend icon is displayed in your status bar, right above the golden coin icon. It indicates how many of 12 townspeople you already have befriended."
                buttonText = "Now I know everything."
            }

            else -> {

                info = "Contact me if you need the details on your mission. I can also end the game if you don't have money to pay the rent and are unable to restore your status."
                buttonText = "Tell me about my mission."
                counter = 0
            }
        }
    }

    fun areYouSureMessage(): Message {

        return Message(
            "Are you sure?",
            R.drawable.eye64,
            "If you give up on your mission the game will end and you will be " +
                    "redirected to the main menu. Are you sure you want to do it?"
        )
    }

    private var hasGivenUp = false
    fun hasGivenUp() = hasGivenUp

    fun giveUp() {

        hasGivenUp = true
    }

    fun reset() {

        hasGivenUp = false
        counter = 0
    }
}