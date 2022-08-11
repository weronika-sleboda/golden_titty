package com.pregnantunicorn.merchantofgoldlakehorizon.models.university

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant

class University {

    val skills = arrayOf(

        UniversitySkill(
            "Health",
            R.drawable.health64,
            "Crucial for survival",
            { Merchant.health().maxValueReached() },
            { Merchant.health().addMaxAmount(1)}
        ),

        UniversitySkill(
            "Energy",
            R.drawable.energy64,
            "Throwing boomerang",
            { Merchant.energy().maxValueReached() },
            { Merchant.energy().addMaxAmount(1)}
        ),

        UniversitySkill(
            "Charisma",
            R.drawable.charisma64,
            "Performing stunts",
            { Merchant.faith().maxValueReached() },
            { Merchant.faith().addMaxAmount(1)}
        ),

        UniversitySkill(
            "Intelligence",
            R.drawable.intelligence64,
            "Sneaking, unlocking chests",
            { Merchant.intelligence().maxValueReached() },
            { Merchant.intelligence().addMaxAmount(1)}
        ),
    )
}