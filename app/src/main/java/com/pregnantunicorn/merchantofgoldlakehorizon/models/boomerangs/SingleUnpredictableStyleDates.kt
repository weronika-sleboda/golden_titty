package com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import kotlin.random.Random

class SingleUnpredictableStyleDates : BoomerangStyle() {

    private var hitPosition1 = 5
    private var hitPosition2 = 3
    private var boomerangPosition = Random.nextInt(rangeSize)

    override fun range(): Array<BoomerangTile> {

        return Array(rangeSize) { BoomerangTile() }.also {

            it[hitPosition1] = BoomerangTile(
                targetIsVisible = true,
                targetIcon = targetIcon,
            )

            it[hitPosition2] = BoomerangTile(
                targetIsVisible = true,
                targetIcon = targetIcon,
            )
        }
    }

    override fun checkHitCondition(hitAmount: Int): Boolean {

        if(boomerangPosition == hitPosition1 || boomerangPosition == hitPosition2) {

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

            it[hitPosition1] = BoomerangTile(
                targetIsVisible = true,
                targetIcon = targetIcon,
            )

            it[hitPosition2] = BoomerangTile(
                targetIsVisible = true,
                targetIcon = targetIcon,
            )

            if(boomerangPosition == hitPosition1) {

                it[boomerangPosition] = BoomerangTile(
                    boomerangIcon = boomerangIcon,
                    boomerangIsVisible = true,
                    targetIsVisible = true,
                    targetIcon = targetIcon,
                )
            }

            else {

                if(boomerangPosition == hitPosition2) {

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
}