package com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import kotlin.random.Random

class SingleCircularStyleBird : BoomerangStyle() {

    companion object {

        private var boomerangPosition = 0
        //*** Position has to be stored in companion object so that the boomerang can move.
    }

    private var hitPosition = Random.nextInt(rangeSize)

    override fun range(): Array<BoomerangTile> {

        return Array(rangeSize){ BoomerangTile(background = { BackgroundFactory().water() }) }
    }

    override fun checkHitCondition(hitAmount: Int): Boolean {

        if(boomerangPosition == hitPosition) {

            Merchant.poultry().addAmount(hitAmount)

            CurrentMessage.changeMessage(
                "Target Hit!",
                R.drawable.chicken_leg64,
                "Bird has been acquired."
            )

            return true
        }

        return false
    }

    private val targetIcon = R.drawable.flying_monster64

    override fun newRange(boomerangIcon: Int): Array<BoomerangTile> {

        return Array(rangeSize) { BoomerangTile(background = { BackgroundFactory().water() }) }.also {

            boomerangPosition++

            if(boomerangPosition >= rangeSize) {

                boomerangPosition = 0
            }

            it[hitPosition] = BoomerangTile(
                background = { BackgroundFactory().water() },
                targetIsVisible = true,
                targetIcon = targetIcon,
            )

            if(boomerangPosition == hitPosition) {

                it[boomerangPosition] = BoomerangTile(
                    background = { BackgroundFactory().water() },
                    boomerangIcon = boomerangIcon,
                    boomerangIsVisible = true,
                    targetIsVisible = true,
                    targetIcon = targetIcon,
                )
            }

            else {

                it[boomerangPosition] = BoomerangTile(
                    background = { BackgroundFactory().water() },
                    boomerangIcon = boomerangIcon,
                    boomerangIsVisible = true,
                )
            }
        }
    }
}