package com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.player.Player
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import kotlin.random.Random

class EnchantedStylePeach : BoomerangStyle() {

    private var boomerangPosition1 = Random.nextInt(rangeSize)
    private var boomerangPosition2 = Random.nextInt(rangeSize)

    private var hitPosition = Random.nextInt(rangeSize)

    override fun name() = "Peach Palm"

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

    override fun newRange(boomerangIcon: Int): Array<BoomerangTile> {

        return Array(rangeSize) {  BoomerangTile() }.also {

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