package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory

class BoatTile(
) : Tile(true)
{
    override fun icon(): Int {

        return IconFactory().boat64()
    }

    override fun background() = BackgroundFactory().water()

    override fun onClick(activity: FragmentActivity) {


    }
}