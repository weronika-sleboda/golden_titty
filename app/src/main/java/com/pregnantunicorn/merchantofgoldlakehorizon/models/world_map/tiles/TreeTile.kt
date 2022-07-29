package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.CurrentDayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.DayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory

class TreeTile : Tile(true)
{
    override fun icon(): Int {

        return IconFactory().forest64()
    }

    override fun background() = BackgroundFactory().jungle()

    override fun onClick(activity: FragmentActivity) {

        CurrentDayCycle.changeDayCycle()
    }
}