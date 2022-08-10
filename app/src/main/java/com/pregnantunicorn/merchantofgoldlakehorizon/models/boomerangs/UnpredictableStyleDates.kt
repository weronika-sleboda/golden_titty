package com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import kotlin.random.Random

class UnpredictableStyleDates : BoomerangStyle() {

    private var hitPosition = when(Random.nextInt(4)) {

        0 -> 0
        1 -> 3
        2 -> 4
        else -> 7
    }

    private var boomerangPosition = Random.nextInt(rangeSize)

    override fun name() = "Date Palm"

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

            Merchant.dates().addAmount(hitAmount)

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

    override fun newRange(boomerangIcon: Int): Array<BoomerangTile> {

        return Array(rangeSize) { BoomerangTile() }.also {

            hitPosition = when(Random.nextInt(4)) {

                0 -> 0
                1 -> 3
                2 -> 4
                else -> 7
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