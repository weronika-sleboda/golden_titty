package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.MeteorsTableFragment

class MeteorTableTile: Tile(true)
{
    override fun icon(): Int {

        return IconFactory().table64()
    }

    override fun background() = BackgroundFactory().woodenFloor()

    override fun onClick(activity: FragmentActivity) {

        activity.supportFragmentManager.commit {

            replace<MeteorsTableFragment>(R.id.world_container)
        }
    }
}