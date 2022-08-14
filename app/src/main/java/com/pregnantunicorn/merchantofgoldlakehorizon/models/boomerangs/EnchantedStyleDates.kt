package com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.player.Player
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import kotlin.random.Random

class EnchantedStyleDates : BoomerangStyle() {

    private var boomerangPosition1 = Random.nextInt(rangeSize)
    private var boomerangPosition2 = Random.nextInt(rangeSize)

    private var hitPosition = when(Random.nextInt(4)) {

        0 -> 0
        1 -> 3
        2 -> 4
        else -> 7
    }

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

        if(boomerangPosition1 == hitPosition || boomerangPosition2 == hitPosition) {

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

    override fun newRange(boomerangIcon: Int): Array<BoomerangTile> {

        return Array(rangeSize) {  BoomerangTile() }.also {

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

            boomerangPosition1 = Random.nextInt(rangeSize)
            boomerangPosition2 = Random.nextInt(rangeSize)

            if(boomerangPosition1 == hitPosition) {

                it[boomerangPosition1] = BoomerangTile(
                    boomerangIcon = boomerangIcon,
                    boomerangIsVisible = true,
                    targetIsVisible = true,
                    targetIcon = targetIcon,
                )
            }

            else {

                it[boomerangPosition1] = BoomerangTile(
                    boomerangIcon = boomerangIcon,
                    boomerangIsVisible = true,
                )
            }

            if(boomerangPosition2 == hitPosition) {

                it[boomerangPosition2] = BoomerangTile(
                    boomerangIcon = boomerangIcon,
                    boomerangIsVisible = true,
                    targetIsVisible = true,
                    targetIcon = targetIcon,
                )
            }

            else {

                it[boomerangPosition2] = BoomerangTile(
                    boomerangIcon = boomerangIcon,
                    boomerangIsVisible = true,
                )
            }
        }
    }
}