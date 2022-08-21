package com.pregnantunicorn.merchantofgoldlakehorizon.models.tools

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory

class Boomerang: Tool {

    val speed: Long = 200

    fun palm(): Palm {

        return when(CurrentPalm.palm()) {

            PalmType.DATES -> DatesPalm()
            PalmType.COCONUT -> CoconutPalm()
            PalmType.PEACH -> PeachPalm()
        }
    }

    override fun icon() = IconFactory().boomerang64()

    override fun name() = "Boomerang"

    override fun info() = "Used for fruit picking"

    override fun equip() {

        CurrentHandState.changeHandState(HandState.BOOMERANG)
    }
}