package com.pregnantunicorn.merchantofgoldlakehorizon.models.tools

interface Tool {

    fun icon(): Int
    fun name(): String
    fun type(): String
    fun info(): String
    fun equip()
    fun owns(): Boolean
    fun addToBackpack()

    fun requiredWood(): Int
    fun requiredStone(): Int
    fun hitAmount(): Int
}