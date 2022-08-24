package com.pregnantunicorn.goldentitty.models.tools

class Sword(
    private val name: String,
    private val icon: Int,
    private val type: String,
    val speed: () -> Long,
    private val hitAmount: () -> Int,
    private val requiredWood: Int,
    private val requiredIron: Int,
    private val swordIndex: Int,
    private var owns: Boolean
): Tool {

    fun battleField() = BattleField()

    override fun icon() = icon

    override fun name() = name

    override fun type() = type

    override fun info() = "Info: For fighting"

    override fun equip() {

        CurrentSword.changeSword(swordIndex)
        CurrentHandState.changeHandState(HandState.SWORD)
    }

    override fun owns() = owns

    override fun addToBackpack() {

        owns = true
    }

    override fun requiredWood(): Int = requiredWood
    override fun requiredIron(): Int = requiredIron

    override fun hitAmount() = hitAmount.invoke()

    override fun setOwns(owns: Boolean) {

        this.owns = owns
    }
}