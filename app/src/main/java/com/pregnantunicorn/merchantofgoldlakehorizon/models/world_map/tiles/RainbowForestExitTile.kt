package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world.CurrentLocation
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world.LocationName
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.LocationFragment

class RainbowForestExitTile(
    val icon: () -> Int,
    val background: () -> Int
) : Tile(true)
{
    override fun icon(): Int {

        return icon.invoke()
    }

    override fun background() = background.invoke()

    override fun onClick(activity: FragmentActivity) {

        CurrentLocation.changeLocation(LocationName.RAINBOW_JUNGLE)

        activity.supportFragmentManager.commit {

            replace<LocationFragment>(R.id.world_container)
        }
    }
}