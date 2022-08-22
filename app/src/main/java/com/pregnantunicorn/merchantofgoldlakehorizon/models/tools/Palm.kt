package com.pregnantunicorn.merchantofgoldlakehorizon.models.tools

abstract class Palm {

    protected val rangeSize = 8

    abstract fun name(): String
    abstract fun range(): Array<PalmTile>
    abstract fun checkHitCondition(hitAmount: Int): Boolean
    abstract fun newRange(boomerangIcon: Int): Array<PalmTile>
}
