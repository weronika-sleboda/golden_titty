package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.dialogues

class SophiaDialogs {

    private val lines = arrayOf(

        "Let me tell you something. I don't care about you and your story or your business in this town.",
        "Stop bothering me.",
        "What is it? Are you stalking me or something?",
        "You are one of those heretics aren't you? You're not? Thanks Creator. ",
        "I have a dear friend who started to hang out with the heretics. He was such a sweet guy, but now...",
        "Pasha became very violent, very... I don't know... He's just not himself anymore.",
        "I love Pasha so much. I don't even know what he is doing in the Shadow Temple. He doesn't let me in.",
        "I once saw heretics in the volcano area at some strange ceremony. There were at least four of them.",
        "Who were on that heretic ceremony, you ask? I don't know. All of them were wearing hoods."
    )

    fun getLine(index: Int): String {

        return lines[index]
    }

    companion object {

        private var counter = 0
    }

    fun welcomeLine(): String {

        return "I have a deal offer for you. Could you bring that to me?"
    }

    fun thankYouLine(): String {

        counter++

        return when(counter) {

            1 -> "Thanks, I really need this."

            else -> {

                counter = 0
                "Wow, you found what I was looking for."
            }
        }
    }

    fun demandNotMetLine(): String {

        counter++

        return when(counter) {

            1 -> "This is not what I'm looking for."

            else -> {

                counter = 0
                "Please, read below again. This is not what I demanded."
            }
        }
    }

    fun noPersuasionLine(): String {

        counter++

        return when(counter) {

            1 -> "Try harder. You don't have enough persuasion points to convince me."

            else -> {

                counter = 0
                "My answer is no. I like the deal as it is."
            }
        }
    }

    fun dealChangedLine(): String {

        counter++

        return when(counter) {

            1 -> "In that case, do you have any of these?"

            else -> {

                counter = 0
                "What about this deal? Are you in?"
            }
        }
    }
}