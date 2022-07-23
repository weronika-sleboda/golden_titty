package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.dialogues

class JinDialogs {

    private val lines = arrayOf(

        "Welcome! I'm Jin - the great ruler of Goldlake. I run and guard this town.",
        "I was born in Goldlake, after the destruction of the old town.",
        "I was growing up watching my father rebuilding the town, he was a great ruler as well.",
        "This town is my whole life. I have the duty to protect its inhabitants.",
        "If someone ever tries to hurt the townspeople, I will wage war against him, even if he's Creator himself.",
        "According to Book Of Creation, Creator ordered to destroy Goldlake. Isn't that cruel?",
        "Brianna is a beautiful woman, don't you think?",
        "Me and Brianna? I didn't make any vows to Creator. She did. If Creator is against our love. I'm against him.",
        "I will rather be cursed or destroyed for eternity than live without Brianna."
    )

    fun getLine(index: Int): String {

        return lines[index]
    }

    companion object {

        private var counter = 0
    }

    fun welcomeLine(): String {

        return "This is what I'm currently looking for. Can you deliver that to me?"
    }

    fun thankYouLine(): String {

        counter++

        return when(counter) {

            1 -> "Great! Thanks for your delivery."

            else -> {

                counter = 0
                "You really made it. I'm impressed."
            }
        }
    }

    fun demandNotMetLine(): String {

        counter++

        return when(counter) {

            1 -> "No. You didn't meet my demand yet."

            else -> {

                counter = 0
                "I'm sorry, but you don't meet my demand."
            }
        }
    }

    fun noPersuasionLine(): String {

        counter++

        return when(counter) {

            1 -> "I'm sorry, Sonny. You need to be more persuasive."

            else -> {

                counter = 0
                "You don't have enough persuasion points to make me change my mind."
            }
        }
    }

    fun dealChangedLine(): String {

        counter++

        return when(counter) {

            1 -> "Alright then, what about this deal? Would you accept it?"

            else -> {

                counter = 0
                "This is my new deal. So? What do you say?"
            }
        }
    }
}