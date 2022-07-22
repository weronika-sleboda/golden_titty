package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory

class CampFireTile(
) : Tile(true)
{
    override fun icon(): Int {

        return IconFactory().campFire64()
    }

    override fun background() = BackgroundFactory().beach()

    override fun onClick(activity: FragmentActivity) {


    }
}