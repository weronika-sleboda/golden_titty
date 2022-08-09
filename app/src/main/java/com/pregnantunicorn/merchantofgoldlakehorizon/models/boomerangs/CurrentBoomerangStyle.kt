package com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs

object CurrentBoomerangStyle {

    fun boomerangStyle(boomerangStyleName: BoomerangStyleName): BoomerangStyle {

        return when(boomerangStyleName) {

            BoomerangStyleName.SINGLE_CIRCULAR -> SingleCircularStyleCoconut()
            BoomerangStyleName.SINGLE_UNPREDICTABLE -> SingleUnpredictableStyleCoconut()
        }
    }
}