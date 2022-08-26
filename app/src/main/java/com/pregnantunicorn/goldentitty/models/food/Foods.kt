package com.pregnantunicorn.goldentitty.models.food

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.meteor.Meteor

object Foods {

    private const val COCONUT = 0
    private const val COCONUT_WATER = 1
    private const val FISH = 2
    private const val FRIED_FISH = 3

    private var foods = arrayOf(

        Food(
            "Coconut",
            R.drawable.coconut64,
            "Energy: +1",
            FoodType.COCONUT,
            { Meteor.energy().amountIsMaxed() },
            { Meteor.energy().addAmount(1) },
        ),


        Food(
            "Coconut Water",
            R.drawable.coconut_water64,
            "Energy: +3",
            FoodType.COCONUT_WATER,
            { Meteor.energy().amountIsMaxed() },
            { Meteor.energy().addAmount(3) },
        ),

        Food(
            "Fish",
            R.drawable.fish64,
            "Health: +1",
            FoodType.FISH,
            { Meteor.health().amountIsMaxed() },
            { Meteor.health().addAmount(1) },
        ),

        Food(
            "Fried Fish",
            R.drawable.fried_fish64,
            "Health: +3",
            FoodType.FRIED_FISH,
            { Meteor.health().amountIsMaxed() },
            { Meteor.health().addAmount(3) },
        )
    )

    fun foods() = foods

    fun food(foodType: FoodType): Food {

        return when(foodType) {

            FoodType.COCONUT -> foods[COCONUT]
            FoodType.COCONUT_WATER -> foods[COCONUT_WATER]
            FoodType.FISH -> foods[FISH]
            FoodType.FRIED_FISH -> foods[FRIED_FISH]
        }
    }

    fun setFood(foods: IntArray) {

        for(index in this.foods.indices) {

            this.foods[index].setAmount(foods[index])
        }
    }

    fun foodAmounts(): IntArray {

        val amounts = IntArray(foods.size)

        for(index in this.foods.indices) {

            amounts[index] = foods[index].amount()
        }

        return amounts
    }

    fun reset() {

        foods = arrayOf(

            Food(
                "Coconut",
                IconFactory().coconut64(),
                "Energy: +1",
                FoodType.COCONUT,
                { Meteor.energy().amountIsMaxed() },
                { Meteor.energy().addAmount(1) },
            ),


            Food(
                "Coconut Water",
                IconFactory().coconutWater64(),
                "Energy: +3",
                FoodType.COCONUT_WATER,
                { Meteor.energy().amountIsMaxed() },
                { Meteor.energy().addAmount(3) },
            ),

            Food(
                "Fish",
                IconFactory().fish64(),
                "Health: +1",
                FoodType.FISH,
                { Meteor.health().amountIsMaxed() },
                { Meteor.health().addAmount(1) },
            ),

            Food(
                "Fried Fish",
                IconFactory().friedFish64(),
                "Health: +3",
                FoodType.FRIED_FISH,
                { Meteor.health().amountIsMaxed() },
                { Meteor.health().addAmount(3) },
            )
        )
    }
}