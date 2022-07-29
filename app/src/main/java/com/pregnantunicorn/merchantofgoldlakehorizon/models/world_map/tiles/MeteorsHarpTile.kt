package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.MeteorsHarpFragment

class MeteorsHarpTile: Tile(true)
{
    override fun icon(): Int {

        return IconFactory().harp64()
    }

    override fun background() = BackgroundFactory().woodenFloor()

    override fun onClick(activity: FragmentActivity) {

        activity.supportFragmentManager.commit {

            replace<MeteorsHarpFragment>(R.id.world_container)
        }
    }
}