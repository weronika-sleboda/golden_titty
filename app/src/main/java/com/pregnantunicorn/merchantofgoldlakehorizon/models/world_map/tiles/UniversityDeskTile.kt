package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.skill_upgrade.CurrentSkillManager
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world.CurrentLocation
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world.LocationName
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.LocationFragment
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.SkillManagerFragment

class UniversityDeskTile(
    private val skillIndex: Int
) : Tile(true)
{
    override fun icon(): Int {

        return IconFactory().desk64()
    }

    override fun background() = BackgroundFactory().blueCarpet()

    override fun onClick(activity: FragmentActivity) {

        CurrentSkillManager.changeSkillManager(skillIndex)

        activity.supportFragmentManager.commit {

            replace<SkillManagerFragment>(R.id.world_container)
        }
    }
}