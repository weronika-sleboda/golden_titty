package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world.CurrentLocation
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world.LocationName
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.LocationFragment

class CaveExitTile : Tile(true)
{
    override fun icon(): Int {

        return IconFactory().curtains64()
    }

    override fun background() = BackgroundFactory().woodenFloor()

    override fun onClick(activity: FragmentActivity) {

        CurrentLocation.changeLocation(LocationName.CAVE)

        activity.supportFragmentManager.commit {

            replace<LocationFragment>(R.id.world_container)
        }
    }
}