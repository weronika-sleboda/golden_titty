package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.AxeFragment

class WoodPalmTile: Tile(true)
{
    override fun icon() = IconFactory().woodPalm64()

    override fun background() = BackgroundFactory().beach()

    override fun onClick(activity: FragmentActivity) {

        activity.supportFragmentManager.commit {

            replace<AxeFragment>(R.id.world_container)
        }
    }
}