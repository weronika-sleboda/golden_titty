package com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Player
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import kotlin.random.Random

class UnpredictableStyleCoconut : BoomerangStyle() {

    private var hitPosition = Random.nextInt(4)
    private var boomerangPosition = Random.nextInt(rangeSize)

    override fun name() = "Coconut Palm"

    override fun range(): Array<BoomerangTile> {

        return Array(rangeSize) { BoomerangTile() }.also {

            it[hitPosition] = BoomerangTile(
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

    override fun newRange(boomerangIcon: Int): Array<BoomerangTile> {

        return Array(rangeSize) {  BoomerangTile() }.also {

            it[hitPosition] = BoomerangTile(
                targetIcon = targetIcon,
                targetIsVisible = true,
            )

            if(boomerangPosition == hitPosition) {

                it[boomerangPosition] = BoomerangTile(
                    boomerangIcon = boomerangIcon,
                    boomerangIsVisible = true,
                    targetIsVisible = true,
                    targetIcon = targetIcon,
                )
            }

            else {

                it[boomerangPosition] = BoomerangTile(
                    boomerangIcon = boomerangIcon,
                    boomerangIsVisible = true,
                )
            }
        }
    }
}