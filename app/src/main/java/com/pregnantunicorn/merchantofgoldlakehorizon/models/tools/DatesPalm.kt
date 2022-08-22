package com.pregnantunicorn.merchantofgoldlakehorizon.models.tools

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.player.Player
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import kotlin.random.Random

class DatesPalm : Palm() {

    private var hitPosition = when(Random.nextInt(4)) {

        0 -> 0
        1 -> 3
        2 -> 4
        else -> 7
    }

    private var boomerangPosition = Random.nextInt(rangeSize)

    override fun name() = "Date Palm"

    override fun range(): Array<PalmTile> {

        return Array(rangeSize) { PalmTile() }.also {

            it[hitPosition] = PalmTile(
                targetIsVisible = true,
                targetIcon = targetIcon,
            )
        }
    }

    override fun checkHitCondition(hitAmount: Int): Boolean {

        if(boomerangPosition == hitPosition) {

            Player.dates().addAmount(hitAmount)

            CurrentMessage.changeMessage(
                "Target Hit!",
                R.drawable.dates64,
                "Dates have been acquired."
            )

            return true
        }

        return false
    }

    private val targetIcon = R.drawable.dates64

    override fun newRange(boomerangIcon: Int): Array<PalmTile> {

        return Array(rangeSize) { PalmTile() }.also {

            hitPosition = when(Random.nextInt(4)) {

                0 -> 0
                1 -> 3
                2 -> 4
                else -> 7
            }

            it[hitPosition] = PalmTile(
                targetIsVisible = true,
                targetIcon = targetIcon,
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