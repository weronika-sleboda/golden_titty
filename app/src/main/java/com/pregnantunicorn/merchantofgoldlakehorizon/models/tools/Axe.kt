package com.pregnantunicorn.merchantofgoldlakehorizon.models.tools

class Axe(
    private val name: String,
    private val icon: Int,
    private val hitAmount: Int,
    private val requiredWood: Int,
    private val requiredStone: Int,
    private val axeIndex: Int,
    private var owns: Boolean
) : Tool {

    override fun icon() = icon

    override fun name() = name

    override fun type() = "Amount per hit: $hitAmount"

    override fun info() = "Info: For Woodcutting"

    override fun equip() {

        CurrentAxe.changeAxe(axeIndex)
        CurrentHandState.changeHandState(HandState.AXE)
    }

    override fun owns() = owns

    override fun addToBackpack() {

        owns = true
    }

    override fun requiredWood(): Int = requiredWood
    override fun requiredStone(): Int = requiredStone

    override fun hitAmount() = hitAmount
}

