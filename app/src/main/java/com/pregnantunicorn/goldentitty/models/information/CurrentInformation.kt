package com.pregnantunicorn.goldentitty.models.information

import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.excavation.CurrentExcavationSite
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.views.fragments.LocationFragment

object CurrentInformation {

    const val EXCAVATION_SITE = 0

    private val facts = arrayOf(

        Information(
            CurrentExcavationSite.excavation().name,
            "The site has been already excavated.",
            { IconFactory().excavationSite128() },
            "Leave"
        )
        {

            CurrentExcavationSite.excavation().leave()

            it.supportFragmentManager.commit {

                replace<LocationFragment>(R.id.world_container)
            }
        },
    )

    private var information = facts[EXCAVATION_SITE]
    fun information() = information

    fun changeInformation(infoIndex: Int) {

        information = facts[infoIndex]
    }

}