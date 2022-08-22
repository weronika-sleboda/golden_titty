package com.pregnantunicorn.merchantofgoldlakehorizon.models.tools

class Boomerang(
    private val name: String,
    private val icon: Int,
    private val type: String,
    val speed: () -> Long,
    private val hitAmount: () -> Int,
    private val requiredWood: Int,
    private val requiredStone: Int,
    private val boomerangIndex: Int,
    private var owns: Boolean
): Tool {

    fun palm(): Palm {

        return when(CurrentPalm.palm()) {

            PalmType.DATES -> DatesPalm()
            PalmType.COCONUT -> CoconutPalm()
            PalmType.PEACH -> PeachPalm()
        }
    }

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
    override fun requiredStone(): Int = requiredStone

    override fun hitAmount() = hitAmount.invoke()
}