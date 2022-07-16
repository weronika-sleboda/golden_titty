package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.CurrentDayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.DayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory

class EmptyGrassTile() : Tile(false)
{
    override fun icon(): Int {

        return R.drawable.energy32
    }

    override fun background() = BackgroundFactory().grass()

    override fun onClick(activity: FragmentActivity) {

        CurrentDayCycle.changeDayCycle()
    }
}