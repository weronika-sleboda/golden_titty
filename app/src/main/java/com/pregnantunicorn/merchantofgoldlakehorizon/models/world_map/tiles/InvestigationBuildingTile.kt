package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs.BoomerangPlaceName
import com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs.CurrentBoomerangPlace
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.PalmFragment
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.SneakFragment

class InvestigationBuildingTile: Tile(true)
{
    override fun icon() = IconFactory().goldenPalace64()

    override fun background() = BackgroundFactory().grass()

    override fun onClick(activity: FragmentActivity) {

        activity.supportFragmentManager.commit {

            replace<SneakFragment>(R.id.world_container)
        }
    }
}