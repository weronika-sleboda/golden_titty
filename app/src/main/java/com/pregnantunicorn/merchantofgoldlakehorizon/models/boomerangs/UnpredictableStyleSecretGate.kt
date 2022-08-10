package com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import kotlin.random.Random

class UnpredictableStyleSecretGate : BoomerangStyle() {

    companion object {

        private var hitPosition = 1
    }

    private var boomerangPosition = Random.nextInt(rangeSize)

    override fun name() = "Secret Gate"

    override fun range(): Array<BoomerangTile> {

        return Array(rangeSize) { BoomerangTile(background = {BackgroundFactory().divineFloor()}) }.also {

            it[hitPosition] = BoomerangTile(
                background = {BackgroundFactory().divineFloor()},
                targetIsVisible = true,
                targetIcon = targetIcon,
            )
        }
    }

    override fun checkHitCondition(hitAmount: Int): Boolean {

        if(boomerangPosition == hitPosition) {

            return true
        }

        return false
    }

    private val targetIcon = R.drawable.emblem64

    override fun newRange(boomerangIcon: Int): Array<BoomerangTile> {

        return Array(rangeSize) { BoomerangTile(background = {BackgroundFactory().divineFloor()}) }.also {

            hitPosition++

            if(hitPosition == 3) { hitPosition = 1 }

            it[hitPosition] = BoomerangTile(
                background = {BackgroundFactory().divineFloor()},
                targetIsVisible = true,
                targetIcon = targetIcon,
            )

            if(boomerangPosition == hitPosition) {

                it[boomerangPosition] = BoomerangTile(
                    background = {BackgroundFactory().divineFloor()},
                    boomerangIcon = boomerangIcon,
                    boomerangIsVisible = true,
                    targetIsVisible = true,
                    targetIcon = targetIcon,
                )
            }

            else {

                it[boomerangPosition] = BoomerangTile(
                    background = {BackgroundFactory().divineFloor()},
                    boomerangIcon = boomerangIcon,
                    boomerangIsVisible = true,
                )
            }
        }
    }
}