package com.pregnantunicorn.goldentitty.models.tools

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.food.FoodType
import com.pregnantunicorn.goldentitty.models.food.Foods
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.message.CurrentMessage
import com.pregnantunicorn.goldentitty.models.resources.Resources
import kotlin.random.Random

class CoconutPalm {

    companion object {

        private var boomerangPosition = 0
    }

    private val rangeSize = 8
    private var hitPosition = Random.nextInt(4)

    fun name() = "Coconut Palm"

    fun range(): Array<ToolTile> {

        return Array(rangeSize) { ToolTile() }.also {

            it[hitPosition] = ToolTile(
                targetIsVisible = true,
                targetIcon = targetIcon,
            )

        }
    }

    fun checkHitCondition(hitAmount: Int): Boolean {

        if(boomerangPosition == hitPosition) {

            Foods.food(FoodType.COCONUT).add(hitAmount)

            CurrentMessage.changeMessage(
                "Target Hit!",
                R.drawable.coconut64,
                "Coconut has been acquired."
            )

            if(Foods.food(FoodType.COCONUT).amountIsMaxed()) {

                CurrentMessage.changeMessage(
                    "Max Value Reached",
                    R.drawable.coconut64,
                    "Max value has been reached."
                )
            }

            return true
        }

        return false
    }

    private val targetIcon = R.drawable.coconut64

    fun newRange(boomerangIcon: Int): Array<ToolTile> {

        return Array(rangeSize) {  ToolTile() }.also {

            boomerangPosition++

            if(boomerangPosition >= rangeSize) {

                boomerangPosition = 0
            }

            it[hitPosition] = ToolTile(
                targetIcon = targetIcon,
                targetIsVisible = true,
            )

            if(boomerangPosition == hitPosition) {

                it[boomerangPosition] = ToolTile(
                    hitIcon = boomerangIcon,
                    hitIconIsVisible = true,
                    targetIsVisible = true,
                    targetIcon = targetIcon,
                )
            }

            else {

                it[boomerangPosition] = ToolTile(
                    hitIcon = boomerangIcon,
                    hitIconIsVisible = true,
                )
            }
        }
    }
}