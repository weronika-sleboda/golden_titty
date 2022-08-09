package com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import kotlin.random.Random

class SingleUnpredictableStyleCoconut : BoomerangStyle() {

    companion object {

        private var hitPosition = Random.nextInt(4)
    }

    private var boomerangPosition = Random.nextInt(rangeSize)

    override fun range(): Array<BoomerangTile> {

        return Array(rangeSize) { BoomerangTile() }
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

    private val targetIcon = R.drawable.khan64

    override fun newRange(boomerangIcon: Int): Array<BoomerangTile> {

        return Array(rangeSize) {  BoomerangTile() }.also {

            hitPosition--

            if(hitPosition < 0) {

                hitPosition = 3
            }

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