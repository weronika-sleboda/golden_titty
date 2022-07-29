package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.CurrentDayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.DayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory

class GemStoneTile(
    private val icon: () -> Int
) : Tile(true)
{
    override fun icon(): Int {

        return icon.invoke()
    }

    override fun background() = BackgroundFactory().volcano()

    override fun onClick(activity: FragmentActivity) {


    }
}