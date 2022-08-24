package com.pregnantunicorn.goldentitty.models.camp_fire

import com.pregnantunicorn.goldentitty.models.food.FoodType
import com.pregnantunicorn.goldentitty.models.food.Foods
import com.pregnantunicorn.goldentitty.models.message.CurrentMessage

class Recipe(
    val icon: Int,
    val name: String,
    val info: String,
    val buttonIcon: Int,
    val ingredientIcon: Int,
    private val ingredientAmount: Int,
    private val requiredFood: FoodType,
    private val dish: FoodType
)
{

    fun ingredientAmountToString() = "$ingredientAmount"

    fun make(): Boolean {

        if(Foods.food(requiredFood).hasAmount(ingredientAmount)) {

            Foods.food(requiredFood).removeAmount(ingredientAmount)
            Foods.food(dish).add(1)

            CurrentMessage.changeMessage(
                "$name Made",
                icon,
                "$name has been added to your backpack."
            )

            return true
        }

        CurrentMessage.changeMessage(
            "No ${Foods.food(requiredFood).name}",
            Foods.food(requiredFood).icon,
            "You don't have any of these."
        )

        return false
    }
}