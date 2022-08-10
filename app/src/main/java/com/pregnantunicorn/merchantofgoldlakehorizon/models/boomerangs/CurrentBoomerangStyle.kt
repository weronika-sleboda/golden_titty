package com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs

object CurrentBoomerangStyle {

    fun boomerangStyle(boomerangStyleName: BoomerangStyleName): BoomerangStyle {

        return when(boomerangStyleName) {

            BoomerangStyleName.ZIGZAG -> EnchantedStyleSecretGate()
            BoomerangStyleName.UNPREDICTABLE -> EnchantedStylePeach()
        }
    }
}