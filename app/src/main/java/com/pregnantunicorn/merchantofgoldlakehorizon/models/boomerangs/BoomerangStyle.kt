package com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs

abstract class BoomerangStyle {

    protected val rangeSize = 8

    abstract fun range(): Array<BoomerangTile>
    abstract fun checkHitCondition(hitAmount: Int): Boolean
    abstract fun newRange(boomerangIcon: Int): Array<BoomerangTile>
}
