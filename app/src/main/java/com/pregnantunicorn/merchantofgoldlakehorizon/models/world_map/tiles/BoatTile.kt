package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.doors.CurrentLockedDoor
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.LockedDoorFragment

class BoatTile(
) : Tile(true)
{
    override fun icon(): Int {

        return IconFactory().boat64()
    }

    override fun background() = BackgroundFactory().water()

    override fun onClick(activity: FragmentActivity) {

        CurrentLockedDoor.changeLockedDoor(CurrentLockedDoor.BOAT_DOOR)

        activity.supportFragmentManager.commit {

            replace<LockedDoorFragment>(R.id.world_container)
        }
    }
}