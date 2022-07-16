package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.exploration.CurrentLocation
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.ExplorationFragment

class LocationTile(
    private val background: () -> Int,
    private val iconAlgorithm: () -> Int,
    private val locationIndex: Int
) : Tile(true)
{
    override fun icon(): Int {

        return iconAlgorithm.invoke()
    }

    override fun background() = background.invoke()

    override fun onClick(activity: FragmentActivity) {

        CurrentLocation.changeLocation(locationIndex)

        activity.supportFragmentManager.commit {

            replace<ExplorationFragment>(R.id.world_container)
        }
    }
}