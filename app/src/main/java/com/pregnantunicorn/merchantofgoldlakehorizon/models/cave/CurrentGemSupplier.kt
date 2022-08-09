package com.pregnantunicorn.merchantofgoldlakehorizon.models.cave

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.ResourceUpdateType
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant

object CurrentGemSupplier {

    private fun emeraldSupplier(): GemSupplier {

        return GemSupplier(
            R.drawable.emerald_stone128,
            "Emerald",
            "Here you can acquire emerald.",
            ResourceUpdateType.DATES
        ) { Merchant.dates().addAmount(1) }
    }

    private fun sapphireSupplier(): GemSupplier {

        return GemSupplier(
            R.drawable.emerald_stone128,
            "Emerald",
            "Here you can acquire emerald.",
            ResourceUpdateType.DATES
        ) { Merchant.dates().addAmount(1) }
    }

    private fun rubySupplier(): GemSupplier {

        return GemSupplier(
            R.drawable.emerald_stone128,
            "Emerald",
            "Here you can acquire emerald.",
            ResourceUpdateType.DATES
        ) { Merchant.dates().addAmount(1) }
    }

    private var gemSupplier = emeraldSupplier()
    fun gemSupplier() = gemSupplier

    fun changeGemSupplier(supplier: GemSupplierType) {

        gemSupplier = when(supplier) {

            GemSupplierType.EMERALD -> emeraldSupplier()
            GemSupplierType.RUBY -> rubySupplier()
            GemSupplierType.SAPPHIRE -> sapphireSupplier()
        }
    }
}