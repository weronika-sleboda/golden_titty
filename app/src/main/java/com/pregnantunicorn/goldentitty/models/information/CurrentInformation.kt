package com.pregnantunicorn.goldentitty.models.information

import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.entrances.CurrentEntrance
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.world_map.world.CurrentLocation
import com.pregnantunicorn.goldentitty.models.world_map.world.LocationName
import com.pregnantunicorn.goldentitty.views.fragments.EntranceFragment
import com.pregnantunicorn.goldentitty.views.fragments.LocationFragment

object CurrentInformation {

    const val EXCAVATION_SITE_WEST = 0
    const val EXCAVATION_SITE_EAST = 1
    const val SECRET_GATE = 2

    private val facts = arrayOf(

        Information(
            "Excavation Site",
            "The site has been already excavated.",
            { IconFactory().excavationSite128() },
            "Leave"
        )
        {

            CurrentLocation.changeLocation(LocationName.SLEAZEHOLE_ISLAND_WEST)

            it.supportFragmentManager.commit {

                replace<LocationFragment>(R.id.world_container)
            }
        },
    )

    private var information = facts[EXCAVATION_SITE_WEST]
    fun information() = information

    fun changeInformation(infoIndex: Int) {

        information = facts[infoIndex]
    }

}