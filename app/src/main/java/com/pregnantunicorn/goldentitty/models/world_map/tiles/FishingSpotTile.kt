package com.pregnantunicorn.goldentitty.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.graphics.BackgroundFactory
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.views.fragments.FishingSpotFragment

class FishingSpotTile: Tile(true)
{
    override fun icon() = IconFactory().pier64()

    override fun background() = BackgroundFactory().water()

    override fun onClick(activity: FragmentActivity) {

        activity.supportFragmentManager.commit {

            replace<FishingSpotFragment>(R.id.world_container)
        }
    }
}