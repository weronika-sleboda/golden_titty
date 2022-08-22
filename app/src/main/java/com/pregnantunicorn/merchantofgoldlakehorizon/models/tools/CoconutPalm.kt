package com.pregnantunicorn.merchantofgoldlakehorizon.models.tools

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.player.Player
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import kotlin.random.Random

class CoconutPalm : Palm() {

    private var hitPosition = Random.nextInt(4)
    private var boomerangPosition = Random.nextInt(rangeSize)

    override fun name() = "Coconut Palm"

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

    override fun newRange(boomerangIcon: Int): Array<PalmTile> {

        return Array(rangeSize) {  PalmTile() }.also {

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