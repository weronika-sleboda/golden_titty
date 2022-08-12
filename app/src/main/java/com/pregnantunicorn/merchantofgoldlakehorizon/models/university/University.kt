package com.pregnantunicorn.merchantofgoldlakehorizon.models.university

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Player

class University {

    val skills = arrayOf(

        UniversitySkill(
            "Health",
            R.drawable.health64,
            "Crucial for survival",
            { Player.health().maxValueReached() },
            { Player.health().addMaxAmount(1)}
        ),

        UniversitySkill(
            "Accuracy",
            R.drawable.accuracy64,
            "Throwing boomerang, collecting herbs",
            { Player.accuracy().maxValueReached() },
            { Player.accuracy().addMaxAmount(1)}
        ),

        UniversitySkill(
            "Agility",
            R.drawable.agility64,
            "Performing stunts, shamanism",
            { Player.agility().maxValueReached() },
            { Player.agility().addMaxAmount(1)}
        ),

        UniversitySkill(
            "Stealth",
            R.drawable.stealth64,
            "Sneaking, unlocking chests",
            { Player.stealth().maxValueReached() },
            { Player.stealth().addMaxAmount(1)}
        ),
    )
}