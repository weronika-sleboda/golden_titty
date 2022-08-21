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
    )

    private var entrance = entrances[TENT]
    fun entrance() = entrance

    fun changeEntrance(entranceIndex: Int) {

        entrance = entrances[entranceIndex]
    }
}