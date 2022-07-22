package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory

class HereticTempleTile(
) : Tile(true)
{
    override fun icon(): Int {

        return IconFactory().hereticTemple64()
    }

    override fun background() = BackgroundFactory().volcano()

    override fun onClick(activity: FragmentActivity) {


    }
}