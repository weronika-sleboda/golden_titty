package com.pregnantunicorn.goldentitty.models.tools

class Boomerang(
    private val name: String,
    private val icon: Int,
    private val type: String,
    val speed: () -> Long,
    private val hitAmount: () -> Int,
    private val requiredWood: Int,
    private val requiredIron: Int,
    private val boomerangIndex: Int,
    private var owns: Boolean
): Tool {

    fun palm() = CoconutPalm()

    override fun icon() = icon

    override fun name() = name

    override fun type() = type

    override fun info() = "Info: For fruit picking"

    override fun equip() {

        CurrentBoomerang.changeBoomerang(boomerangIndex)
        CurrentHandState.changeHandState(HandState.BOOMERANG)
    }

    override fun owns() = owns

    override fun addToBackpack() {

        owns = true
    }

    override fun requiredWood(): Int = requiredWood
    override fun requiredIron(): Int = requiredIron

    override fun hitAmount() = hitAmount.invoke()

    override fun load(owns: Boolean) {

        this.owns = owns
    }

    override fun reset() {

        this.owns = false
    }
}