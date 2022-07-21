package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.CurrentDayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.DayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.doors.CurrentDoor
import com.pregnantunicorn.merchantofgoldlakehorizon.models.doors.CurrentInnDoor
import com.pregnantunicorn.merchantofgoldlakehorizon.models.doors.CurrentLockedDoor
import com.pregnantunicorn.merchantofgoldlakehorizon.models.exploration.CurrentLocation
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.npcs.CurrentNpc
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.*

class TentTile(
) : Tile(true)
{
    override fun icon(): Int {

        return IconFactory().tent64()
    }

    override fun background() = BackgroundFactory().beach()

    override fun onClick(activity: FragmentActivity) {

        when(CurrentDayCycle.dayCycle()) {

            DayCycle.NIGHT -> {

                CurrentInnDoor.changeToCampEntrance()

                activity.supportFragmentManager.commit {

                    replace<InnDoorFragment>(R.id.world_container)
                }
            }

            else -> {

                CurrentDoor.changeDoor(CurrentLockedDoor.CAMP_DOOR)

                activity.supportFragmentManager.commit {

                    replace<DoorFragment>(R.id.world_container)
                }
            }
        }
    }
}