package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.construction.Building
import com.pregnantunicorn.merchantofgoldlakehorizon.models.construction.BuildingType
import com.pregnantunicorn.merchantofgoldlakehorizon.models.construction.Buildings
import com.pregnantunicorn.merchantofgoldlakehorizon.models.construction.CurrentBuilding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.entrances.CurrentEntrance
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.ConstructionFragment
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.EntranceFragment

class ConstructionTile(
    private val building: Building,
    private val entranceIndex: Int,
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

    override fun background() = BackgroundFactory().beach()

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