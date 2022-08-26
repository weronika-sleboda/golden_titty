package com.pregnantunicorn.goldentitty.models.npcs

class LadySilviaGreetings {

    fun greeting(): String {

        return when(0) {

            0 -> "Come, let us gather some wood and stone. We need to build a workshop so that we can make better tools."
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

            1 -> "Thanks, I'm starving."

            else -> {

                "Yeah, finally time for a meal."
            }
        }
    }

    fun isFedLine(): String {

        counter++

        return when(counter) {

            1 -> "Thanks, but I'm already full."

            else -> {

                counter = 0
                "Please, no more. I'm going to explode."
            }
        }
    }


}