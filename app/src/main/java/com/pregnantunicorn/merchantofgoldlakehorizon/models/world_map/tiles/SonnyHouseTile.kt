package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.CurrentDayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.DayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.doors.CurrentDoor
import com.pregnantunicorn.merchantofgoldlakehorizon.models.doors.CurrentInnDoor
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.DoorFragment

class SonnyHouseTile(
) : Tile(true)
{
    override fun icon(): Int {

        return IconFactory().woodenHouse64()
    }

    override fun background() = BackgroundFactory().grass()

    override fun onClick(activity: FragmentActivity) {

        CurrentDoor.changeDoor(CurrentDoor.SONNY_HOUSE)

        activity.supportFragmentManager.commit {

            replace<DoorFragment>(R.id.world_container)
        }
    }
}