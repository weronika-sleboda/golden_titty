package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.dialogues

class JinDialogs {

    private val lines = arrayOf(

        "Welcome! I'm Jin - The Great Ruler of Goldlake. I run and guard the city. You can always find me at Arena at night.",
        "Did you already try out the arena? We have nice and affordable trainings that can boost your max energy.",
        "[He has an absent look on his face] I'm sorry, I didn't notice you coming. How is it going?",
        "[He is busy with his sword training and seems like he's thinking very intensively] Me? Worried? Not at all, I'm just overworked. That's all.",
        "Investigation of the attempted murder, you wonder? Unfortunately, I don't have any leads yet.",
        "[He seems worried and tired like he didn't sleep last night. He didn't even notice you entered the building]",
        "My sword? Why do you want to see it? Wait... Are you assuming I tried to kill you? Why would I want to do it?",
        "I'm not the only one in Goldlake owning a sword. Your accusations make me very sad. I'm the protector of townspeople, not a killer of them.",
        "Do you want to see the evidence that I gathered in the case of your attempted murder? Sorry, but I can't do that. It's confidential."
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