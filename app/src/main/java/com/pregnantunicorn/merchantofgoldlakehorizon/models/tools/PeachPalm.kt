package com.pregnantunicorn.merchantofgoldlakehorizon.models.tools

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.player.Player
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import kotlin.random.Random

class PeachPalm : Palm() {

    private var boomerangPosition = Random.nextInt(rangeSize)
    private var hitPosition = Random.nextInt(rangeSize)

    override fun name() = "Peach Palm"

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

            Player.peaches().addAmount(hitAmount)

            CurrentMessage.changeMessage(
                "Target Hit!",
                R.drawable.peach64,
                "Peach has been acquired."
            )

            return true
        }

        return false
    }

    private val targetIcon = R.drawable.peach64

    override fun newRange(boomerangIcon: Int): Array<PalmTile> {

        return Array(rangeSize) {  PalmTile() }.also {

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