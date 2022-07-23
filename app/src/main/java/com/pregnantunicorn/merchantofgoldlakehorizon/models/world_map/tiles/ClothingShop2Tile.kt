package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.CurrentDayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.DayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.doors.CurrentDoor
import com.pregnantunicorn.merchantofgoldlakehorizon.models.doors.CurrentLockedDoor
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.DoorFragment
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.LockedDoorFragment

class ClothingShop2Tile(
) : Tile(true)
{
    override fun icon(): Int {

        return IconFactory().secondClothingShop64()
    }

    override fun background() = BackgroundFactory().grass()

    override fun onClick(activity: FragmentActivity) {

        when(CurrentDayCycle.dayCycle()) {

            DayCycle.NIGHT -> {

                CurrentLockedDoor.changeLockedDoor(CurrentLockedDoor.GREEN_HOUSE_DOOR)

                activity.supportFragmentManager.commit {

                    replace<LockedDoorFragment>(R.id.world_container)
                }
            }

            else -> {

                CurrentDoor.changeDoor(CurrentDoor.GREEN_HOUSE_DOOR)

                activity.supportFragmentManager.commit {

                    replace<DoorFragment>(R.id.world_container)
                }
            }
        }
    }
}