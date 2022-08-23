package com.pregnantunicorn.goldentitty.models.information

import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.entrances.CurrentEntrance
import com.pregnantunicorn.goldentitty.views.fragments.EntranceFragment

object CurrentInformation {

    const val CANDY_DRAGON = 0

    private val facts = arrayOf(

        Information(
            "Candy The Dragon",
            "[He is busy licking his tail]",
            R.drawable.daniel128,
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