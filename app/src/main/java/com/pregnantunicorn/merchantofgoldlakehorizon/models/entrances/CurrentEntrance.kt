package com.pregnantunicorn.merchantofgoldlakehorizon.models.entrances

import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.temples.CurrentTemple
import com.pregnantunicorn.merchantofgoldlakehorizon.models.temples.TempleName
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.SleepingBagFragment
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.SneakFragment

object CurrentEntrance {

    const val TENT  = 0
    const val TEMPLE_OF_LATTER_DAY_VAGINA_RAPTURE = 1
    const val TEMPLE_OF_GRAND_BOOTY = 2
    const val TEMPLE_OF_TITTIES_AND_LEGS = 3
    const val TEMPLE_OF_HOLY_NIPPLE_REVIVAL = 4
    const val TEMPLE_OF_MONOTITTEISM = 5
    const val TEMPLE_OF_LAST_DAY_ATTENTION_SEEKING = 6
    const val TEMPLE_OF_MOST_TRUE_TRUTH = 7
    const val END_TIMES_TWERK = 8

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
            "Temple Of Last Day Vagina Rapture",
            { IconFactory().pearlTittyDoor128() },
            "This is the place where you can find one of the pearl titty artifacts hanging on the wall.",
            "Enter",
            { true },
            {

                CurrentTemple.changeTempleName(TempleName.LATTER_DAY_VAGINA_RAPTURE)

                it.supportFragmentManager.commit {

                    replace<SneakFragment>(R.id.world_container)
                }
            }
        ),

        Entrance(
            "Temple Of Grand Booty",
            { IconFactory().pearlTittyDoor128() },
            "This is the place where you can find one of the pearl titty artifacts hanging on the wall.",
            "Enter",
            { true },
            {

                CurrentTemple.changeTempleName(TempleName.GRAND_BOOTY)

                it.supportFragmentManager.commit {

                    replace<SneakFragment>(R.id.world_container)
                }
            }
        ),

        Entrance(
            "Temple Of Titties And Legs",
            { IconFactory().pearlTittyDoor128() },
            "This is the place where you can find one of the pearl titty artifacts hanging on the wall.",
            "Enter",
            { true },
            {

                CurrentTemple.changeTempleName(TempleName.TITTIES_AND_LEGS)

                it.supportFragmentManager.commit {

                    replace<SneakFragment>(R.id.world_container)
                }
            }
        ),

        Entrance(
            "Temple Of Holy Nipple Revival",
            { IconFactory().pearlTittyDoor128() },
            "This is the place where you can find one of the pearl titty artifacts hanging on the wall.",
            "Enter",
            { true },
            {

                CurrentTemple.changeTempleName(TempleName.HOLY_NIPPLE_REVIVAL)

                it.supportFragmentManager.commit {

                    replace<SneakFragment>(R.id.world_container)
                }
            }
        ),

        Entrance(
            "Temple Of Monotitteism",
            { IconFactory().pearlTittyDoor128() },
            "This is the place where you can find one of the pearl titty artifacts hanging on the wall.",
            "Enter",
            { true },
            {

                CurrentTemple.changeTempleName(TempleName.MONOTITTEISM)

                it.supportFragmentManager.commit {

                    replace<SneakFragment>(R.id.world_container)
                }
            }
        ),

        Entrance(
            "Temple Of Last Day Attention Seeking",
            { IconFactory().pearlTittyDoor128() },
            "This is the place where you can find one of the pearl titty artifacts hanging on the wall.",
            "Enter",
            { true },
            {

                CurrentTemple.changeTempleName(TempleName.LAST_DAY_ATTENTION_SEEKING)

                it.supportFragmentManager.commit {

                    replace<SneakFragment>(R.id.world_container)
                }
            }
        ),

        Entrance(
            "Temple Of Most True Truth",
            { IconFactory().pearlTittyDoor128() },
            "This is the place where you can find one of the pearl titty artifacts hanging on the wall.",
            "Enter",
            { true },
            {

                CurrentTemple.changeTempleName(TempleName.THE_MOST_TRUE_TRUTH)

                it.supportFragmentManager.commit {

                    replace<SneakFragment>(R.id.world_container)
                }
            }
        ),

        Entrance(
            "The Temple Of End Times Twerk",
            { IconFactory().pearlTittyDoor128() },
            "This is the place where you can find one of the pearl titty artifacts hanging on the wall.",
            "Enter",
            { true },
            {

                CurrentTemple.changeTempleName(TempleName.END_TIMES_TWERK)

                it.supportFragmentManager.commit {

                    replace<SneakFragment>(R.id.world_container)
                }
            }
        )
    )

    private var entrance = entrances[TENT]
    fun entrance() = entrance

    fun changeEntrance(entranceIndex: Int) {

        entrance = entrances[entranceIndex]
    }
}