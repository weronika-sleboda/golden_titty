package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.CarriageFragment
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.EasyChestFragment

class ChestTile: Tile(true)
{
    override fun icon() = IconFactory().library64()

    override fun background() = BackgroundFactory().grass()

    override fun onClick(activity: FragmentActivity) {

        activity.supportFragmentManager.commit {

            replace<EasyChestFragment>(R.id.world_container)
        }
    }
}