package com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import kotlin.random.Random

class ZigZagStyleCoconut : BoomerangStyle() {

    companion object {

        private var boomerangPosition = 0
        //*** Position has to be stored in companion object so that the boomerang can move.

    }

    private var hitPosition = Random.nextInt(4)

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

            Merchant.coconuts().addAmount(hitAmount)

            CurrentMessage.changeMessage(
                "Target Hit!",
                R.drawable.coconut64,
                "Coconut has been acquired."
            )

            return true
        }

        return false
    }

    private var targetIcon = R.drawable.coconut64

    override fun newRange(boomerangIcon: Int): Array<BoomerangTile> {

        return Array(rangeSize) { BoomerangTile() }.also {

            it[hitPosition] = BoomerangTile(
                targetIcon = targetIcon,
                targetIsVisible = true,
            )

            boomerangPosition++

            if(boomerangPosition >= rangeSize) {

                boomerangPosition = 0
            }

            it[hitPosition] = BoomerangTile(
                targetIsVisible = true,
                targetIcon = targetIcon,
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