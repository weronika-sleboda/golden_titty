package com.pregnantunicorn.goldentitty.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.construction.Building
import com.pregnantunicorn.goldentitty.models.construction.CurrentBuilding
import com.pregnantunicorn.goldentitty.models.entrances.CurrentEntrance
import com.pregnantunicorn.goldentitty.models.graphics.BackgroundFactory
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.views.fragments.ConstructionFragment
import com.pregnantunicorn.goldentitty.views.fragments.EntranceFragment

class ConstructionTile(
    private val building: Building,
    private val entranceIndex: Int,
    private val background: () -> Int = { BackgroundFactory().beach() }
): Tile(true)
{
    override fun icon() : Int {

        return if(building.isBuild()) {

            building.smallIcon.invoke()
        }

        else {

            IconFactory().constructionSite64()
        }
    }

    override fun background() = background.invoke()

    override fun onClick(activity: FragmentActivity) {

        if(building.isBuild()) {

            CurrentEntrance.changeEntrance(entranceIndex)

            activity.supportFragmentManager.commit {

                replace<EntranceFragment>(R.id.world_container)
            }
        }

        else {

            CurrentBuilding.changeBuildingType(building.buildingType)

            activity.supportFragmentManager.commit {

                replace<ConstructionFragment>(R.id.world_container)
            }
        }
    }
}