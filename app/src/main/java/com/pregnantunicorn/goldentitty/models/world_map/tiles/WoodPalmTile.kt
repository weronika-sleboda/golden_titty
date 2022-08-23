package com.pregnantunicorn.goldentitty.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.graphics.BackgroundFactory
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.views.fragments.AxeFragment

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