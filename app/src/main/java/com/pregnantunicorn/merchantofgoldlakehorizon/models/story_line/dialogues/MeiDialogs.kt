package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.dialogs

class MeiDialogs {

    private val lines = arrayOf(

        "Welcome! Welcome lovely, potential customer! My name is Mei, I'm the owner of the best clothing shop ever open. ",
        "Yes! You came back! Please, take a look at my new robes, Sir. You will surely find one that suits your taste.",
        "Thank you for visiting me again, lovely customer [She fakes a smile] ",
        "[She's talking to herself not knowing you're standing behind her] Where is that walking bag of money, Sonny? Did he go to Aaliyah instead?",
        "Oh, Sonny, finally! You're here. Don't tell me that this serpent from Green House, deceived you with her crappy deals.",
        "Me? Glad you ask... My zodiac sign is virgo, I scored 100 on a math test, I make monthly donation for endangered species of Goldlake, I... ",
        "... I won Clay Roads Marathon two times in a row, my favorite color is pink, when I take a bath I like to sing...",
        "... My boyfriend's first name was Vincet, he was from a family of swordsmen, but never mind... Let's get back to me...",
        "...When Aaliyah got stabbed in the cave... What? Which part you want me to repeat? That about my boyfriend? Marathon? Me singing in the bath?"
    )

    fun getLine(index: Int): String {

        return lines[index]
    }
}