package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs.BoomerangPlaceName
import com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs.CurrentBoomerangPlace
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.PearlTittyFragment

class PearlTittyAltarTile(
    private val boomerangPlaceName: BoomerangPlaceName
) : Tile(true)
{
    override fun icon(): Int {

        return IconFactory().column64()
    }

    override fun background() = BackgroundFactory().grass()

    override fun onClick(activity: FragmentActivity) {

        CurrentBoomerangPlace.changeBoomerangPlace(boomerangPlaceName)

        activity.supportFragmentManager.commit {

            replace<PearlTittyFragment>(R.id.world_container)
        }
    }
}