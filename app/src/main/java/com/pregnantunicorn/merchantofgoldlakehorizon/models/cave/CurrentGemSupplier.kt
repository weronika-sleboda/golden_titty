package com.pregnantunicorn.merchantofgoldlakehorizon.models.cave

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.GemUpdateType
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant

object CurrentGemSupplier {

    private fun emeraldSupplier(): GemSupplier {

        return GemSupplier(
            R.drawable.emerald_stone128,
            "Emerald",
            "Here you can acquire emerald.",
            GemUpdateType.EMERALD
        ) { Merchant.emerald().addAmount(1) }
    }

    private fun sapphireSupplier(): GemSupplier {

        return GemSupplier(
            R.drawable.sapphire_stone128,
            "Sapphire",
            "Here you can acquire sapphire.",
            GemUpdateType.SAPPHIRE
        ) { Merchant.sapphire().addAmount(1) }
    }

    private fun rubySupplier(): GemSupplier {

        return GemSupplier(
            R.drawable.ruby_stone128,
            "Ruby",
            "Here you can acquire ruby.",
            GemUpdateType.RUBY
        ) { Merchant.ruby().addAmount(1) }
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