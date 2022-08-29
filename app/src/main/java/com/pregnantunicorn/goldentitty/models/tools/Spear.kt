package com.pregnantunicorn.goldentitty.models.tools

class Spear(
    private val name: String,
    private val icon: Int,
    private val type: String,
    val speed: () -> Long,
    private val hitAmount: () -> Int,
    private val requiredWood: Int,
    private val requiredIron: Int,
    private val spearIndex: Int,
    private var owns: Boolean
): Tool {

    fun fishingSpot() = FishingSpot()

    override fun icon() = icon

    override fun name() = name

    override fun type() = type

    override fun info() = "Info: For fishing"

    override fun equip() {

        CurrentSpear.changeSpear(spearIndex)
        CurrentHandState.changeHandState(HandState.SPEAR)
    }

    override fun owns() = owns

    override fun load(owns: Boolean) {

        this.owns = owns
    }

    override fun reset() {

        this.owns = false
    }

    override fun addToBackpack() {

        owns = true
    }

    override fun requiredWood(): Int = requiredWood
    override fun requiredIron(): Int = requiredIron

    override fun hitAmount() = hitAmount.invoke()
}