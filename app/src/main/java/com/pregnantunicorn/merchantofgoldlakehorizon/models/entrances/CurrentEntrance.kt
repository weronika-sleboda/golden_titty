package com.pregnantunicorn.merchantofgoldlakehorizon.models.entrances

import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.temple_floors.CurrentTempleFloor
import com.pregnantunicorn.merchantofgoldlakehorizon.models.temple_floors.TempleFloorName
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.*

object CurrentEntrance {

    const val TENT  = 0
    const val TEMPLE_OF_LATTER_DAY_VAGINA_RAPTURE = 1
    const val BOOMERANG_SHOP = 2
    const val CAFETERIA = 3
    const val UNIVERSITY = 4
    const val CARRIAGE = 5
    const val CAVE = 6
    const val HUT = 7
    const val CITY_COUNCIL = 8
    const val BUNGALOW = 9
    const val MAUSOLEUM = 10
    const val LIBRARY = 11

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
            "This is the place where the pearl titty artifacts are located. Enter each floor and destroy them.",
            "Enter",
            { true },
            {

                it.supportFragmentManager.commit {

                    replace<TempleFragment>(R.id.world_container)
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
        ),

        Entrance(
            "Cave",
            { IconFactory().cave128() },
            "It looks like the bandits are residing here.",
            "Enter",
            { true },
            {

                CurrentTempleFloor.changeFloor(TempleFloorName.FIRST_FLOOR)
                it.supportFragmentManager.commit {

                    replace<SneakFragment>(R.id.world_container)
                }
            }
        ),

        Entrance(
            "Hut",
            { IconFactory().houseDoor128() },
            "There are some people living here.",
            "Enter",
            { true },
            {


                CurrentTempleFloor.changeFloor(TempleFloorName.SECOND_FLOOR)
                it.supportFragmentManager.commit {

                    replace<SneakFragment>(R.id.world_container)
                }
            }
        ),

        Entrance(
            "City Council",
            { IconFactory().houseDoor128() },
            "The town is managed from this building.",
            "Enter",
            { true },
            {


                CurrentTempleFloor.changeFloor(TempleFloorName.THIRD_FLOOR)
                it.supportFragmentManager.commit {

                    replace<SneakFragment>(R.id.world_container)
                }
            }
        ),

        Entrance(
            "Bungalow",
            { IconFactory().houseDoor128() },
            "There are some people living here.",
            "Enter",
            { true },
            {


                CurrentTempleFloor.changeFloor(TempleFloorName.FOURTH_FLOOR)
                it.supportFragmentManager.commit {

                    replace<SneakFragment>(R.id.world_container)
                }
            }
        ),

        Entrance(
            "Mausoleum",
            { IconFactory().houseDoor128() },
            "The tombs of the saints of the pearl titty worshippers are located here.",
            "Enter",
            { true },
            {


                CurrentTempleFloor.changeFloor(TempleFloorName.FIFTH_FLOOR)
                it.supportFragmentManager.commit {

                    replace<SneakFragment>(R.id.world_container)
                }
            }
        ),

        Entrance(
            "Library",
            { IconFactory().houseDoor128() },
            "This is the place where you can read books.",
            "Enter",
            { true },
            {


                CurrentTempleFloor.changeFloor(TempleFloorName.SIXTH_FLOOR)
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