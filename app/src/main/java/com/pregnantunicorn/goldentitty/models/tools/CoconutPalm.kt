package com.pregnantunicorn.goldentitty.models.tools

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.player.Player
import com.pregnantunicorn.goldentitty.models.message.CurrentMessage
import kotlin.random.Random

class CoconutPalm {

    companion object {

        private var boomerangPosition = 0
    }

    private val rangeSize = 8
    private var hitPosition = Random.nextInt(4)

    fun name() = "Coconut Palm"

    fun range(): Array<PalmTile> {

        return Array(rangeSize) { PalmTile() }.also {

            it[hitPosition] = PalmTile(
                targetIsVisible = true,
                targetIcon = targetIcon,
            )

        }
    }

    fun checkHitCondition(hitAmount: Int): Boolean {

        if(boomerangPosition == hitPosition) {

            Player.coconuts().addAmount(hitAmount)

            CurrentMessage.changeMessage(
                "Target Hit!",
                R.drawable.coconut64,
                "Coconut has been acquired."
            )

            return true
        }

        return false
    }

    private val targetIcon = R.drawable.coconut64

    fun newRange(boomerangIcon: Int): Array<PalmTile> {

        return Array(rangeSize) {  PalmTile() }.also {

            boomerangPosition++

            if(boomerangPosition >= rangeSize) {

                boomerangPosition = 0
            }

            it[hitPosition] = PalmTile(
                targetIcon = targetIcon,
                targetIsVisible = true,
            )

            if(boomerangPosition == hitPosition) {

                it[boomerangPosition] = PalmTile(
                    boomerangIcon = boomerangIcon,
                    boomerangIsVisible = true,
                    targetIsVisible = true,
                    targetIcon = targetIcon,
                )
            }

            else {

                it[boomerangPosition] = PalmTile(
                    boomerangIcon = boomerangIcon,
                    boomerangIsVisible = true,
                )
            }
        }
    }
}