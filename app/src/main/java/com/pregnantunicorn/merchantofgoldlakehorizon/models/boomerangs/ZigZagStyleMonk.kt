package com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import kotlin.random.Random

class ZigZagStyleMonk : BoomerangStyle() {

    companion object {

        private var hitPosition = 2
        private var boomerangPosition = 0
    }

    override fun name() = "Temple Of Latter Day Vagina Rapture"

    override fun range(): Array<BoomerangTile> {

        return Array(rangeSize){ BoomerangTile(background = {BackgroundFactory().divineFloor()}) }.also {

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

    private val targetIcon = when(Random.nextInt(3)) {

        0 -> R.drawable.enemy_monk64_black
        1 -> R.drawable.enemy_monk64_white
        else -> R.drawable.enemy_monk64_brown
    }


    override fun newRange(boomerangIcon: Int): Array<BoomerangTile> {

        return Array(rangeSize) { BoomerangTile(background = {BackgroundFactory().divineFloor()})}.also {


            hitPosition--

            if(hitPosition == 0) { hitPosition = 2 }

            it[hitPosition] = BoomerangTile(
                background = {BackgroundFactory().divineFloor()},
                targetIsVisible = true,
                targetIcon = targetIcon,
            )

            boomerangPosition++

            if(boomerangPosition >= rangeSize) {

                boomerangPosition = 0
            }

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