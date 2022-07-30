package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.cave.CurrentGemSupplier
import com.pregnantunicorn.merchantofgoldlakehorizon.models.cave.GemSupplierType
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.CurrentDayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.DayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.GemSupplierFragment

class GemStoneTile(
    private val gemSupplierType: GemSupplierType,
    private val icon: () -> Int
) : Tile(true)
{
    override fun icon(): Int {

        return icon.invoke()
    }

    override fun background() = BackgroundFactory().volcano()

    override fun onClick(activity: FragmentActivity) {

        CurrentGemSupplier.changeGemSupplier(gemSupplierType)

        activity.supportFragmentManager.commit {

            replace<GemSupplierFragment>(R.id.world_container)
        }

    }
}