package com.pregnantunicorn.merchantofgoldlakehorizon.models.robes

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.items.ItemType
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant

object CurrentRobe {

    private var robe = RobeType.WHITE
    fun robe() = robe

    fun changeRobe(robeType: RobeType) {

        robe = robeType

        when(robe) {

            RobeType.WHITE -> RobeCloset.robes[RobeCloset.WHITE_ROBE].algorithm.invoke()
            RobeType.BLACK -> RobeCloset.robes[RobeCloset.BLACK_ROBE].algorithm.invoke()
            RobeType.BLUE -> RobeCloset.robes[RobeCloset.BLUE_ROBE].algorithm.invoke()
            RobeType.RED -> RobeCloset.robes[RobeCloset.RED_ROBE].algorithm.invoke()
            RobeType.GREEN -> RobeCloset.robes[RobeCloset.GREEN_ROBE].algorithm.invoke()
            RobeType.BROWN -> RobeCloset.robes[RobeCloset.BROWN_ROBE].algorithm.invoke()
            RobeType.PURPLE -> RobeCloset.robes[RobeCloset.PURPLE_ROBE].algorithm.invoke()
            RobeType.PINK -> RobeCloset.robes[RobeCloset.PINK_ROBE].algorithm.invoke()
            RobeType.SILVER -> RobeCloset.robes[RobeCloset.SILVER_ROBE].algorithm.invoke()
            RobeType.GOLDEN -> RobeCloset.robes[RobeCloset.GOLDEN_ROBE].algorithm.invoke()
        }
    }
}