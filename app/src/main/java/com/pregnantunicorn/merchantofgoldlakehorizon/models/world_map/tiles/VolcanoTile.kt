package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.CurrentDayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.DayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.investigation.CurrentInvestigation
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.InvestigationFragment

class VolcanoTile(
) : Tile(true)
{
    override fun icon(): Int {

        return IconFactory().volcano64()
    }

    override fun background() = BackgroundFactory().volcano()

    override fun onClick(activity: FragmentActivity) {

        when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> CurrentInvestigation
                .changeInvestigation(CurrentInvestigation.VOLCANO_DAY)

            DayCycle.SUNSET ->  CurrentInvestigation
                .changeInvestigation(CurrentInvestigation.VOLCANO_SUNSET)

            DayCycle.NIGHT -> CurrentInvestigation
                .changeInvestigation(CurrentInvestigation.VOLCANO_NIGHT)
        }

        activity.supportFragmentManager.commit {

            replace<InvestigationFragment>(R.id.world_container)
        }
    }
}