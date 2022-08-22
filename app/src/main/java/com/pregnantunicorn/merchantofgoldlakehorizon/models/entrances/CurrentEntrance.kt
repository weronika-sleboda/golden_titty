package com.pregnantunicorn.merchantofgoldlakehorizon.models.entrances

import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.grab_objects.CurrentGrabObject
import com.pregnantunicorn.merchantofgoldlakehorizon.models.grab_objects.GrabObjectType
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.*

object CurrentEntrance {

    const val TENT  = 0
    const val CAVE = 1
    const val WORKSHOP = 2
    const val CAFETERIA = 3
    const val CAMP_FIRE = 4

    private val entrances = arrayOf(

        Entrance(
            "Tent",
            { IconFactory().curtains128() },
            "You can sleep here for free, but it will damage your health by 1 point.",
            "Go Inside",
            { true },
            {
                it.supportFragmentManager.commit {

                    replace<SleepingBagFragment>(R.id.world_container)
                }
            }
        ),

        Entrance(
            "Cave",
            { IconFactory().cave128() },
            "This is the place where you can acquire stone.",
            "Go Inside",
            { true },
            {
                it.supportFragmentManager.commit {

                    replace<HammerFragment>(R.id.world_container)
                }
            }
        ),

        Entrance(
            "Workshop",
            { IconFactory().houseDoor128() },
            "This is the place where you can make tools from resources.",
            "Enter",
            { true },
            {
                it.supportFragmentManager.commit {

                    replace<WorkshopFragment>(R.id.world_container)
                }
            }
        ),

        Entrance(
            "Cafeteria",
            { IconFactory().houseDoor128() },
            "This is the place where you can buy drinks.",
            "Enter",
            { true },
            {
                it.supportFragmentManager.commit {

                    replace<HammerFragment>(R.id.world_container)
                }
            }
        ),

        Entrance(
            "Camp Fire",
            { IconFactory().houseDoor128() },
            "Approach the camp fire to upgrade your skills.",
            "Approach",
            { true },
            {
                it.supportFragmentManager.commit {

                    replace<UniversityFragment>(R.id.world_container)
                }
            }
        ),
    )

    private var entrance = entrances[TENT]
    fun entrance() = entrance

    fun changeEntrance(entranceIndex: Int) {

        entrance = entrances[entranceIndex]
    }
}