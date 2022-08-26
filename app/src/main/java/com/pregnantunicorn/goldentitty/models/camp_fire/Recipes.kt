package com.pregnantunicorn.goldentitty.models.camp_fire

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.food.FoodType
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory

class Recipes {

    val recipes = arrayOf(

        Recipe(
            IconFactory().coconutWater64(),
            "Coconut Water",
            "Energy: + 3",
            R.drawable.knife64,
            R.drawable.coconut32,
            1,
            FoodType.COCONUT,
            FoodType.COCONUT_WATER
        ),

        Recipe(
            IconFactory().friedFish64(),
            "Fried Fish",
            "Health: + 3",
            R.drawable.fire64,
            R.drawable.fish32,
            1,
            FoodType.FISH,
            FoodType.FRIED_FISH
        )
    )
}