package com.pregnantunicorn.merchantofgoldlakehorizon.models.tools

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory

class Hammer : Tool {

    override fun icon() = IconFactory().hammer64()

    override fun name() = "Hammer"

    override fun info() = "Used for mining"

    override fun equip() {

        CurrentHandState.changeHandState(HandState.HAMMER)
    }
}