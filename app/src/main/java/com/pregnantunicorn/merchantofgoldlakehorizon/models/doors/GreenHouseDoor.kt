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
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.ClothingShopFragment
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.NpcFragment

class GreenHouseDoor : Door(
    "Green House",
    "This is the place where you can buy new robes. Different robes affect " +
            "how easily you can enter the buildings. Open at morning and sunset.",
    "Closed At Night"
)
{

    override fun open(activity: FragmentActivity) {

        when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> CurrentRobeManager.changeRobe(
                CurrentRobeManager.COMMONER_ROBE)

            else -> {

                CurrentRobeManager.changeRobe(
                    CurrentRobeManager.ARMY_ROBE
                )
            }
        }

        activity.supportFragmentManager.commit {

            replace<ClothingShopFragment>(R.id.world_container)
        }
    }

    override fun icon(): Int {

        return IconFactory().secondClothingDoor128()
    }
}

