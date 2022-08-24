package com.pregnantunicorn.goldentitty.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.excavation.CurrentExcavationSite
import com.pregnantunicorn.goldentitty.models.excavation.ExcavationNumber
import com.pregnantunicorn.goldentitty.models.graphics.BackgroundFactory
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.information.CurrentInformation
import com.pregnantunicorn.goldentitty.views.fragments.ExcavationFragment
import com.pregnantunicorn.goldentitty.views.fragments.FishingSpotFragment
import com.pregnantunicorn.goldentitty.views.fragments.InformationFragment

class ExcavationTile: Tile(true)
{
    override fun icon() = IconFactory().excavationSite64()

    override fun background() = BackgroundFactory().beach()

    override fun onClick(activity: FragmentActivity) {

        CurrentExcavationSite.changeExcavationNumber(ExcavationNumber.NR1)

        if(CurrentExcavationSite.excavation().hasBeenExcavated()) {

            CurrentInformation.changeInformation(CurrentInformation.EXCAVATION_SITE_WEST)

            activity.supportFragmentManager.commit {

                replace<InformationFragment>(R.id.world_container)
            }
        }

        else {

            activity.supportFragmentManager.commit {

                replace<ExcavationFragment>(R.id.world_container)
            }
        }
    }
}