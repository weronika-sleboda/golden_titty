package com.pregnantunicorn.merchantofgoldlakehorizon.models.information

import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.entrances.CurrentEntrance
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world.CurrentLocation
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world.LocationName
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.EntranceFragment
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.LocationFragment

object CurrentInformation {

    const val CANDY_DRAGON = 0

    private val facts = arrayOf(

        Information(
            "Candy The Dragon",
            "[He is busy licking his tail]",
            R.drawable.aaliyah64,
            "Leave"
        )
        {

            CurrentEntrance.changeEntrance(CurrentEntrance.CAVE)

            it.supportFragmentManager.commit {

                replace<EntranceFragment>(R.id.world_container)
            }
        }
    )

    private var information = facts[CANDY_DRAGON]
    fun information() = information

}