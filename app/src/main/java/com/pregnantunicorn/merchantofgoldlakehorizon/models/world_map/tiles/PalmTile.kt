package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.tools.CurrentPalm
import com.pregnantunicorn.merchantofgoldlakehorizon.models.tools.PalmType
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.PalmFragment

class PalmTile(
    private val icon: () -> Int,
    private val background: () -> Int,
    private val palmType: PalmType
) : Tile(true)
{
    override fun icon() = icon.invoke()

    override fun background() = background.invoke()

    override fun onClick(activity: FragmentActivity) {

        CurrentPalm.changePalm(palmType)

        activity.supportFragmentManager.commit {

            replace<PalmFragment>(R.id.world_container)
        }
    }
}