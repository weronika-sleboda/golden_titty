package com.pregnantunicorn.merchantofgoldlakehorizon.models.doors

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.ClothingShopFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.clothing.CurrentRobeManager
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.CurrentDayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.DayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.skill_upgrade.CurrentSkillManager
import com.pregnantunicorn.merchantofgoldlakehorizon.models.skill_upgrade.SkillManager
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.*

class GoldenPalaceDoor : Door(
    "Golden Palace",
    "This is the place where you can restore you status at morning and sunset.",
    "Closed At Night"
)
{

    override fun open(activity: FragmentActivity) {

        activity.supportFragmentManager.commit {

            replace<BedFragment>(R.id.world_container)
        }
    }

    override fun icon(): Int {

        return IconFactory().goldenDoor128()
    }
}
