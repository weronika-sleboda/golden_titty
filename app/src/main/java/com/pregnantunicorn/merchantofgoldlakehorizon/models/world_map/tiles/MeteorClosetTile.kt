package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.CurrentDayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.DayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.MeteorsClosetFragment

class MeteorClosetTile: Tile(true)
{
    override fun icon(): Int {

        return IconFactory().closet64()
    }

    override fun background() = BackgroundFactory().woodenFloor()

    override fun onClick(activity: FragmentActivity) {

        activity.supportFragmentManager.commit {

            replace<MeteorsClosetFragment>(R.id.world_container)
        }
    }
}