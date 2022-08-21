package com.pregnantunicorn.merchantofgoldlakehorizon.models.tools

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory

class Axe : Tool {

    override fun icon() = IconFactory().axe64()

    override fun name() = "Axe"

    override fun info() = "Used for woodcutting"

    override fun equip() {

        CurrentHandState.changeHandState(HandState.AXE)
    }
}