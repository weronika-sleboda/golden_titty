package com.pregnantunicorn.goldentitty.models.tools

interface Tool {

    fun icon(): Int
    fun name(): String
    fun type(): String
    fun info(): String
    fun equip()
    fun owns(): Boolean
    fun load(owns: Boolean)
    fun reset()
    fun addToBackpack()

    fun requiredWood(): Int
    fun requiredIron(): Int
    fun hitAmount(): Int
}