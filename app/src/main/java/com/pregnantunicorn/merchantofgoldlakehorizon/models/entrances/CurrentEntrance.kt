package com.pregnantunicorn.merchantofgoldlakehorizon.models.entrances

import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.temples.CurrentTemple
import com.pregnantunicorn.merchantofgoldlakehorizon.models.temples.TempleName
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.*

object CurrentEntrance {

    const val TENT  = 0
    const val TEMPLE_OF_LATTER_DAY_VAGINA_RAPTURE = 1
    const val TEMPLE_OF_GRAND_BOOTY = 2
    const val TEMPLE_OF_TITTIES_AND_LEGS = 3
    const val TEMPLE_OF_HOLY_NIPPLE_REVIVAL = 4
    const val TEMPLE_OF_MONOTITTEISM = 5
    const val TEMPLE_OF_END_TIMES_TWERK = 6
    const val TEMPLE_OF_PUSSYCAT_PROPHET = 7
    const val BOOMERANG_SHOP = 8
    const val CAFETERIA = 9
    const val UNIVERSITY = 10
    const val CARRIAGE = 11

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
            "Temple Of Latter Day Vagina Rapture",
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
            "Temple Of End Times Twerk",
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
        ),

        Entrance(
            "Temple Of Pussycat Prophet",
            { IconFactory().pearlTittyDoor128() },
            "This is the place where you can find one of the pearl titty artifacts hanging on the wall.",
            "Enter",
            { true },
            {

                CurrentTemple.changeTempleName(TempleName.PUSSYCAT_PROPHET)

                it.supportFragmentManager.commit {

                    replace<SneakFragment>(R.id.world_container)
                }
            }
        ),

        Entrance(
            "Boomerang Shop",
            { IconFactory().houseDoor128() },
            "This is the place where you can buy boomerangs.",
            "Enter",
            { true },
            {

                it.supportFragmentManager.commit {

                    replace<BoomerangShopFragment>(R.id.world_container)
                }
            }
        ),

        Entrance(
            "Cafeteria",
            { IconFactory().houseDoor128() },
            "This is the place where you can buy drinks which restore your accuracy, agility or stealth.",
            "Enter",
            { true },
            {

                it.supportFragmentManager.commit {

                    replace<CafeteriaFragment>(R.id.world_container)
                }
            }
        ),


        Entrance(
            "University",
            { IconFactory().houseDoor128() },
            "This is the place where you can upgrade your health, accuracy, agility and stealth.",
            "Enter",
            { true },
            {

                it.supportFragmentManager.commit {

                    replace<UniversityFragment>(R.id.world_container)
                }
            }
        ),


        Entrance(
            "Carriage",
            { IconFactory().carriage128() },
            "Here you can sell fruits that you pick up from the palms.",
            "Look Inside",
            { true },
            {

                it.supportFragmentManager.commit {

                    replace<CarriageFragment>(R.id.world_container)
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