package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.CurrentDayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.DayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.doors.CurrentDoor
import com.pregnantunicorn.merchantofgoldlakehorizon.models.exploration.CurrentLocation
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.DoorFragment
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.ExplorationFragment

class TheatreTile(
) : Tile(true)
{
    override fun icon(): Int {

        return IconFactory().theatre64()
    }

    override fun background() = BackgroundFactory().water()

    override fun onClick(activity: FragmentActivity) {

        when(CurrentDayCycle.dayCycle()) {

            DayCycle.NIGHT -> {}

            else -> {

                CurrentDoor.changeDoor(CurrentDoor.THEATRE_DOOR)

                activity.supportFragmentManager.commit {

                    replace<DoorFragment>(R.id.world_container)
                }
            }
        }
    }
}