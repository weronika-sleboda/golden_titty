package com.pregnantunicorn.goldentitty.models.tools

import com.pregnantunicorn.goldentitty.models.graphics.BackgroundFactory
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.message.CurrentMessage
import com.pregnantunicorn.goldentitty.models.player.Player
import kotlin.random.Random

class BattleField {

    companion object {

        private var hitPosition = 1
    }

    private val rangeSize = 8
    private var swordPosition = Random.nextInt(rangeSize)

    fun name() = ""

    fun range(targetIcon: Int): Array<ToolTile> {

        return Array(rangeSize) { ToolTile(background = { BackgroundFactory().templeFloor() }) }.also {

            it[hitPosition] = ToolTile(
                background = { BackgroundFactory().templeFloor() },
                targetIsVisible = true,
                targetIcon = targetIcon,
            )
        }
    }

    fun checkHitCondition(enemyAlgorithm: () -> Unit, enemyAttack: Int): Boolean {

        if(swordPosition == hitPosition) {

            enemyAlgorithm.invoke()
            return true
        }

        CurrentMessage.changeMessage(
            "Damage",
            IconFactory().health64(),
            "You have been hit by the enemy."
        )

        Player.health().loseAmount(enemyAttack)

        return false
    }

    private var targetIcon = IconFactory().target64()

    fun newRange(enemyIcon: Int): Array<ToolTile> {

        return Array(rangeSize) {  ToolTile(background = { BackgroundFactory().templeFloor() }) }.also {

            hitPosition++

            if(hitPosition > 2) {

                hitPosition = 1
            }

            it[hitPosition] = ToolTile(
                background = { BackgroundFactory().templeFloor() },
                targetIcon = enemyIcon,
                targetIsVisible = true,
            )

            if(swordPosition == hitPosition) {

                it[swordPosition] = ToolTile(
                    background = { BackgroundFactory().templeFloor() },
                    hitIcon = targetIcon,
                    hitIconIsVisible = true,
                    targetIsVisible = true,
                    targetIcon = enemyIcon,
                )
            }

            else {

                it[swordPosition] = ToolTile(
                    background = { BackgroundFactory().templeFloor() },
                    hitIcon = targetIcon,
                    hitIconIsVisible = true,
                )
            }
        }
    }
}