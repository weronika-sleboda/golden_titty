package com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Player
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import kotlin.random.Random

class EnchantedStyleCoconut : BoomerangStyle() {

    private var boomerangPosition1 = Random.nextInt(rangeSize)
    private var boomerangPosition2 = Random.nextInt(rangeSize)

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

        if(boomerangPosition1 == hitPosition || boomerangPosition2 == hitPosition) {

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