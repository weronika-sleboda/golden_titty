package com.pregnantunicorn.goldentitty.models.tools

interface Tool {

    fun icon(): Int
    fun name(): String
    fun type(): String
    fun info(): String
    fun equip()
    fun owns(): Boolean
    fun setOwns(owns: Boolean)
    fun addToBackpack()

    fun requiredWood(): Int
    fun requiredIron(): Int
    fun hitAmount(): Int
}