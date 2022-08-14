package com.pregnantunicorn.merchantofgoldlakehorizon.models.university

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.player.Player
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage

class University {

    val skills = arrayOf(

        UniversitySkill(
            "Health",
            R.drawable.health64,
            {
                CurrentMessage.changeMessage(
                    "Health",
                    R.drawable.health64,
                    "Health is crucial for survival. If it reaches value of 0, you die and the game ends."
                )
            },
            { Player.health().maxValueReached() },
            { Player.health().addMaxAmount(1)}
        ),

        UniversitySkill(
            "Accuracy",
            R.drawable.accuracy64,
            {
                CurrentMessage.changeMessage(
                    "Accuracy",
                    R.drawable.accuracy64,
                    "Accuracy allows you to throw boomerangs. The greater the value the more throws you can perform."
                )
            },
            { Player.accuracy().maxValueReached() },
            { Player.accuracy().addMaxAmount(1)}
        ),

        UniversitySkill(
            "Agility",
            R.drawable.agility64,
            {
                CurrentMessage.changeMessage(
                    "Agility",
                    R.drawable.agility64,
                    "Agility allows you to perform stunts. The greater the value the more attempts you can make."
                )
            },
            { Player.agility().maxValueReached() },
            { Player.agility().addMaxAmount(1)}
        ),

        UniversitySkill(
            "Stealth",
            R.drawable.stealth64,
            {
                CurrentMessage.changeMessage(
                    "Stealth",
                    R.drawable.stealth64,
                    "Stealth allow you to sneak into the temples and open the chest. The greater the value" +
                            " the more attempts you can make to sneak or unlock chests."
                )
            },
            { Player.stealth().maxValueReached() },
            { Player.stealth().addMaxAmount(1)}
        ),
    )
}