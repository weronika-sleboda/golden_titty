package com.pregnantunicorn.merchantofgoldlakehorizon.models.doors

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.models.robes.CurrentRobe
import com.pregnantunicorn.merchantofgoldlakehorizon.models.robes.RobeType
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world.CurrentLocation
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world.LocationName
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.InfoDialogFragment
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.LocationFragment


object CurrentDoor {

    const val DRAGON_INN_BEDROOM = 0
    const val DRAGON_INN_HALL = 1
    const val DRAGON_INN_KITCHEN = 2
    const val DRAGON_INN_BASEMENT = 3

    private val doors = arrayOf(

        Door(
            "Dragon Inn (Bedroom)",
            "This is the place where you can restore your status on expense of health points.",
            {IconFactory().houseDoor128()},
            {
                CurrentLocation.changeLocation(LocationName.DRAGON_INN_BEDROOM)

                it.supportFragmentManager.commit {

                    replace<LocationFragment>(R.id.world_container)
                }
            }
        ),
    )

    private fun checkTheRobe(
        activity: FragmentActivity,
        robeType: RobeType,
        title: String,
        icon: Int,
        content: String,
        locationName: LocationName
    ) {

        if(CurrentRobe.robe() == robeType) {

            CurrentLocation.changeLocation(locationName)
            activity.supportFragmentManager.commit {

                replace<LocationFragment>(R.id.world_container)
            }
        }

        else {

            CurrentMessage.changeMessage(title, icon, content)

            InfoDialogFragment(CurrentMessage.message())
                .show(activity.supportFragmentManager, InfoDialogFragment.INFO_TAG)
        }
    }

    private var door: Door = doors[DRAGON_INN_BEDROOM]
    fun door() = door

    fun changeDoor(doorIndex: Int) {

        door = doors[doorIndex]
    }
}