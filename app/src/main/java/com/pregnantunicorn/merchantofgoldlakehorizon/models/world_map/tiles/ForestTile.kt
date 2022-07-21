package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.exploration.CurrentLocation
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.skill_upgrade.CurrentSkillManager
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.ExplorationFragment
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.SkillManagerFragment

class ForestTile(
) : Tile(true)
{
    override fun icon(): Int {

        return IconFactory().forest64()
    }

    override fun background() = BackgroundFactory().grass()

    override fun onClick(activity: FragmentActivity) {

        CurrentLocation.changeLocation(CurrentLocation.FOREST)

        activity.supportFragmentManager.commit {

            replace<ExplorationFragment>(R.id.world_container)
        }
    }
}