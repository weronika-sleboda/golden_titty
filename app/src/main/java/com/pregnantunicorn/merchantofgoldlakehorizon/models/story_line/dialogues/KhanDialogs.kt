package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.dialogues

class KhanDialogs {

    private val lines = arrayOf(

        "Who am I? And what da crap do ya care?",
        "Imma bandit. A man's got to do what he's got to do. ",
        "I was born poor. I ain't had the same opportunities as those rich punks.",
        "Da world is run by Shadow Lord. He makes people rich.",
        "Malik? He's a son of da cursed one. [He spits on the ground]. Da son of Shadow Lord.",
        "Ya don't know who da Shadow Lord is? What? Ain't ya one of them heretics?",
        "Me? Imma believer in Creator. One day, he gon' save me from that hell on earth Imma livin' in.",
        "You really ain't one of them heretics? I hope I can trust ya. Those punks always lie.",
        "They are around us, pal. Da heretics. Only da recruiters live in da open, but da worst of them are hidin'."
    )

    fun getLine(index: Int): String {

        return lines[index]
    }

    companion object {

        private var counter = 0
    }

    fun welcomeLine(): String {

        return "Hey yo! Do ya have anything of these?"
    }

    fun thankYouLine(): String {

        counter++

        return when(counter) {

            1 -> "Here's yo' money, pal."

            else -> {

                counter = 0
                "You didn't disappoint. Here. Take yo' reward."
            }
        }
    }

    fun demandNotMetLine(): String {

        counter++

        return when(counter) {

            1 -> "Ya think Imma clown? Does it look to ya like da thing Imma lookin' for?"

            else -> {

                counter = 0
                "This is ain't what da deal was about, loser! "
            }
        }
    }

    fun noPersuasionLine(): String {

        counter++

        return when(counter) {

            1 -> "Ya ain't persuasive enough. ."

            else -> {

                counter = 0
                "Ya lack persuasion points, loser. I ain't changin' that deal."
            }
        }
    }

    fun dealChangedLine(): String {

        counter++

        return when(counter) {

            1 -> "Okay, pal. Let us try this one."

            else -> {

                counter = 0
                "[Spits on the ground] Here's da new deal. So what ya say?"
            }
        }
    }
}