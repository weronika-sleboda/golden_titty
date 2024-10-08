package com.pregnantunicorn.goldentitty.models.tools

import com.pregnantunicorn.goldentitty.R

class Knife : Tool {

    private var owns = false

    override fun icon() = R.drawable.knife64

    override fun name() = "Knife"

    override fun type() = "Info: For Cooking"

    override fun info() = ""

    override fun equip() {

        CurrentHandState.changeHandState(HandState.KNIFE)
    }

    override fun owns() = owns

    override fun addToBackpack() {

        owns = true
    }

    override fun requiredWood(): Int = 5
    override fun requiredIron(): Int = 2

    override fun hitAmount() = 1

    override fun load(owns: Boolean) {

        this.owns = owns
    }

    override fun reset() {

        this.owns = false
    }
}
