package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.investigation.CurrentInvestigation
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.InvestigationFragment
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.MeteorsTableFragment

class CupboardTile(
    private val investigationIndex: Int,
    private val background: () -> Int
): Tile(true)
{
    override fun icon(): Int {

        return IconFactory().cupboard64()
    }

    override fun background() = background.invoke()

    override fun onClick(activity: FragmentActivity) {

        CurrentInvestigation.changeInvestigation(investigationIndex)

        activity.supportFragmentManager.commit {

            replace<InvestigationFragment>(R.id.world_container)
        }
    }
}