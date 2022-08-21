package com.pregnantunicorn.merchantofgoldlakehorizon.models.tools

object CurrentPalm {

    private var palm = PalmType.COCONUT
    fun palm() = palm

    fun changePalm(palmType: PalmType) {

        palm = palmType
    }
}