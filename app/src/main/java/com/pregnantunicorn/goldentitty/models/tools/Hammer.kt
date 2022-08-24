package com.pregnantunicorn.goldentitty.models.tools

class Hammer(
    private val name: String,
    private val icon: Int,
    private val hitAmount: Int,
    private val requiredWood: Int,
    private val requiredIron: Int,
    private val hammerIndex: Int,
    private var owns: Boolean
) : Tool {

    override fun icon() = icon

    override fun name() = name

    override fun type() = "Amount per hit: $hitAmount"

    override fun info() = "Info: For mining"

    override fun equip() {

        CurrentHammer.changeHammer(hammerIndex)
        CurrentHandState.changeHandState(HandState.HAMMER)
    }

    override fun owns() = owns

    override fun addToBackpack() {

        owns = true
    }

    override fun requiredWood(): Int = requiredWood
    override fun requiredIron(): Int = requiredIron

    override fun hitAmount() = hitAmount

    override fun setOwns(owns: Boolean) {

        this.owns = owns
    }
}