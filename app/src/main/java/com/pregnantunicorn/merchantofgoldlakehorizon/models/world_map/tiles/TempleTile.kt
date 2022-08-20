package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs.BoomerangPlaceName
import com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs.CurrentBoomerangPlace
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.MonkFragment

class TempleTile(
    private val icon: () -> Int,
    private val background: () -> Int,
    private val boomerangPlaceName: BoomerangPlaceName
) : Tile(true)
{
    override fun icon() = icon.invoke()

    override fun background() = background.invoke()

    override fun onClick(activity: FragmentActivity) {

        CurrentBoomerangPlace.changeBoomerangPlace(boomerangPlaceName)

        activity.supportFragmentManager.commit {

            replace<MonkFragment>(R.id.world_container)
        }
    }
}