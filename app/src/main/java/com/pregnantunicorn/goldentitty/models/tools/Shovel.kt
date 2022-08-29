package com.pregnantunicorn.goldentitty.models.tools

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory

class Shovel : Tool {

    private var owns = false

    override fun icon() = R.drawable.shovel64

    override fun name() = "Shovel"

    override fun type() = "Info: For excavating"

    override fun info() = ""

    override fun equip() {

        CurrentHandState.changeHandState(HandState.SHOVEL)
    }

    override fun owns() = owns

    override fun addToBackpack() {

        owns = true
    }

    override fun requiredWood(): Int = 10
    override fun requiredIron(): Int = 10

    override fun hitAmount() = 1

    override fun load(owns: Boolean) {

        this.owns = owns
    }

    override fun reset() {

        this.owns = false
    }
}
