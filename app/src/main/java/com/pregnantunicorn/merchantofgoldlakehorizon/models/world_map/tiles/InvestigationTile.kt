package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.investigation.CurrentInvestigation
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.BoomerangFragment

class InvestigationTile(
    private val investigationIndex: Int,
    private val icon: () -> Int,
    private val background: () -> Int
): Tile(true)
{
    override fun icon() = icon.invoke()

    override fun background() = background.invoke()

    override fun onClick(activity: FragmentActivity) {

        CurrentInvestigation.changeInvestigation(investigationIndex)

        activity.supportFragmentManager.commit {

            replace<BoomerangFragment>(R.id.world_container)
        }
    }
}