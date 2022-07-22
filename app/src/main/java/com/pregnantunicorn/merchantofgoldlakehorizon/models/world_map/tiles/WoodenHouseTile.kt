package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory

class WoodenHouseTile(
) : Tile(true)
{
    override fun icon(): Int {

        return IconFactory().woodenHouse64()
    }

    override fun background() = BackgroundFactory().jungle()

    override fun onClick(activity: FragmentActivity) {


    }
}