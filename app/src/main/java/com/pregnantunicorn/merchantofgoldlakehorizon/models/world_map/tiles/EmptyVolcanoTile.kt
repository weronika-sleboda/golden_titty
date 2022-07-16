package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory

class EmptyVolcanoTile() : Tile(false)
{
    override fun icon(): Int {

        return R.drawable.energy32
    }

    override fun background() = BackgroundFactory().volcano()

    override fun onClick(activity: FragmentActivity) {

        //*** Do nothing
    }
}