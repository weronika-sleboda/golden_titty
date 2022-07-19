package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.dialogs

class JinDialogs {

    private val lines = arrayOf(

        "Welcome! I'm Jin - The Great Ruler of Goldlake. I run and guard the city. You can find me at Arena.",
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
}