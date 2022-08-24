package com.pregnantunicorn.goldentitty.models.tools

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.food.FoodType
import com.pregnantunicorn.goldentitty.models.food.Foods
import com.pregnantunicorn.goldentitty.models.graphics.BackgroundFactory
import com.pregnantunicorn.goldentitty.models.message.CurrentMessage
import kotlin.random.Random

class FishingSpot {

    private val rangeSize = 8
    private var hitPosition = Random.nextInt(4)
    private var spearPosition = Random.nextInt(rangeSize)

    fun name() = "Fishing Spot"

    fun range(): Array<ToolTile> {

        return Array(rangeSize) { ToolTile(background = { BackgroundFactory().water() }) }.also {

            it[hitPosition] = ToolTile(
                background = { BackgroundFactory().water() },
                targetIsVisible = true,
                targetIcon = targetIcon,
            )
        }
    }

    fun checkHitCondition(hitAmount: Int): Boolean {

        if(spearPosition == hitPosition) {

            Foods.food(FoodType.FISH).add(hitAmount)

            CurrentMessage.changeMessage(
                "Target Hit!",
                R.drawable.fish64,
                "Fish has been acquired."
            )

            return true
        }

        return false
    }

    private val targetIcon = R.drawable.fish64
    private val hitIcon = R.drawable.target64

    fun newRange(): Array<ToolTile> {

        return Array(rangeSize) {  ToolTile(background = { BackgroundFactory().water() }) }.also {

            it[hitPosition] = ToolTile(
                background = { BackgroundFactory().water() },
                targetIcon = targetIcon,
                targetIsVisible = true,
            )

            if(spearPosition == hitPosition) {

                it[spearPosition] = ToolTile(
                    background = { BackgroundFactory().water() },
                    hitIcon = hitIcon,
                    hitIconIsVisible = true,
                    targetIsVisible = true,
                    targetIcon = targetIcon,
                )
            }

            else {

                it[spearPosition] = ToolTile(
                    background = { BackgroundFactory().water() },
                    hitIcon = hitIcon,
                    hitIconIsVisible = true,
                )
            }
        }
    }
}