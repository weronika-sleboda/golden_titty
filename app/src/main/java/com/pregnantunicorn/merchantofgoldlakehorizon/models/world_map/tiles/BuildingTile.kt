package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.CurrentDayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.DayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.doors.CurrentDoor
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.DoorFragment

class BuildingTile(
    val doorIndex: Int = CurrentDoor.METEORS_HOUSE,
    val icon: () -> Int = { IconFactory().npcHouse64() },
    val background: () -> Int = { BackgroundFactory().grass() }
) : Tile(true)
{
    override fun icon(): Int {

        return icon.invoke()
    }

    override fun background() = background.invoke()

    override fun onClick(activity: FragmentActivity) {

        CurrentDoor.changeDoor(doorIndex)

        activity.supportFragmentManager.commit {

            replace<DoorFragment>(R.id.world_container)
        }
    }
}