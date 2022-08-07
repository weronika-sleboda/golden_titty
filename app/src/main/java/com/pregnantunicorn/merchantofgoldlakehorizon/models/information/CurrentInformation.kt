package com.pregnantunicorn.merchantofgoldlakehorizon.models.information

import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world.CurrentLocation
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world.LocationName
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.BedFragment
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.LocationFragment

object CurrentInformation {

    const val OPENING_INFO = 0

    private val facts = arrayOf(

        Information(
            "Jin",
            "Sir? You seem distant. This is your new house. I will collect the money for the rent each 7th day cycle.",
            R.drawable.jin128,
            "Sure, bye!"
        )
        {

            CurrentLocation.changeLocation(LocationName.DRAGON_INN_BEDROOM)

            it.supportFragmentManager.commit {

                replace<LocationFragment>(R.id.world_container)
            }
        }
    )

    private var information = facts[OPENING_INFO]
    fun information() = information

}