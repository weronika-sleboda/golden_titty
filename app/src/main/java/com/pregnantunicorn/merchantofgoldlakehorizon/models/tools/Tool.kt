package com.pregnantunicorn.merchantofgoldlakehorizon.models.tools

interface Tool {

    fun icon(): Int
    fun name(): String
    fun info(): String
    fun equip()
}