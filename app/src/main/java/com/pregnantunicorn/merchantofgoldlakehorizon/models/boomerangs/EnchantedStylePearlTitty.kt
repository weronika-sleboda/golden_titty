package com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import kotlin.random.Random

class EnchantedStylePearlTitty : BoomerangStyle() {

    companion object {

        private var hitPosition = 1
    }

    private var boomerangPosition1 = Random.nextInt(rangeSize)
    private var boomerangPosition2 = Random.nextInt(rangeSize)

    override fun name() = "Pearl Titty Altar"

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

        if(boomerangPosition1 == hitPosition || boomerangPosition2 == hitPosition) {

            return true
        }

        return false
    }

    private val targetIcon = R.drawable.pearl_titty64

    override fun newRange(boomerangIcon: Int): Array<BoomerangTile> {

        return Array(rangeSize) {  BoomerangTile(background = {BackgroundFactory().divineFloor()}) }.also {

           hitPosition++

            if(hitPosition == 3) { hitPosition = 1 }

            it[hitPosition] = BoomerangTile(
                background = { BackgroundFactory().divineFloor()},
                targetIsVisible = true,
                targetIcon = targetIcon,
            )

            boomerangPosition1 = Random.nextInt(rangeSize)
            boomerangPosition2 = Random.nextInt(rangeSize)

            if(boomerangPosition1 == hitPosition) {

                it[boomerangPosition1] = BoomerangTile(
                    background = {BackgroundFactory().divineFloor()},
                    boomerangIcon = boomerangIcon,
                    boomerangIsVisible = true,
                    targetIsVisible = true,
                    targetIcon = targetIcon,
                )
            }

            else {

                it[boomerangPosition1] = BoomerangTile(
                    background = {BackgroundFactory().divineFloor()},
                    boomerangIcon = boomerangIcon,
                    boomerangIsVisible = true,
                )
            }

            if(boomerangPosition2 == hitPosition) {

                it[boomerangPosition2] = BoomerangTile(
                    background = {BackgroundFactory().divineFloor()},
                    boomerangIcon = boomerangIcon,
                    boomerangIsVisible = true,
                    targetIsVisible = true,
                    targetIcon = targetIcon,
                )
            }

            else {

                it[boomerangPosition2] = BoomerangTile(
                    background = {BackgroundFactory().divineFloor()},
                    boomerangIcon = boomerangIcon,
                    boomerangIsVisible = true,
                )
            }
        }
    }
}