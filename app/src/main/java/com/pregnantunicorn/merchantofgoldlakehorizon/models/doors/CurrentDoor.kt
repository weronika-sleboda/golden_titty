package com.pregnantunicorn.merchantofgoldlakehorizon.models.doors

import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.CarriageFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world.CurrentLocation
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world.LocationName
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.CarriageFragment
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.LocationFragment


object CurrentDoor {

    const val METEORS_HOUSE = 0
    const val PASHAS_HOUSE = 1
    const val JORDANS_HOUSE = 2
    const val ERICAS_HOUSE = 3
    const val KHANS_HOUSE = 4
    const val JINS_HOUSE = 5
    const val NIKITAS_HOUSE = 6
    const val SONNYS_HOUSE = 7
    const val CARRIAGE = 8

    private val doors = arrayOf(

        Door(
            "Meteor's House",
            "You can restore your status here. Each 7th day cycle you have to pay 20G in rent.",
            "Open All Day",
            {IconFactory().houseDoor128()},
            {
                CurrentLocation.changeLocation(LocationName.METEORS_HOUSE)

                it.supportFragmentManager.commit {

                    replace<LocationFragment>(R.id.world_container)
                }
            }
        ),

        Door(
            "Pasha's House",
            "This is the house of Pasha.",
            "Closed: Night",
            {IconFactory().houseDoor128()},
            {
                CurrentLocation.changeLocation(LocationName.PASHAS_HOUSE)

                it.supportFragmentManager.commit {

                    replace<LocationFragment>(R.id.world_container)
                }
            }
        ),

        Door(
            "Jordan's House",
            "This is the house of Jordan and Henry.",
            "Closed: Night",
            {IconFactory().houseDoor128()},
            {
                CurrentLocation.changeLocation(LocationName.JORDANS_HOUSE)

                it.supportFragmentManager.commit {

                    replace<LocationFragment>(R.id.world_container)
                }
            }
        ),

        Door(
            "Erica's House",
            "This is the house of Erica.",
            "Closed: Night",
            {IconFactory().houseDoor128()},
            {
                CurrentLocation.changeLocation(LocationName.ERICAS_HOUSE)

                it.supportFragmentManager.commit {

                    replace<LocationFragment>(R.id.world_container)
                }
            }
        ),

        Door(
            "Khan's House",
            "This is the house of Khan.",
            "Closed: Night",
            {IconFactory().houseDoor128()},
            {
                CurrentLocation.changeLocation(LocationName.KHANS_HOUSE)

                it.supportFragmentManager.commit {

                    replace<LocationFragment>(R.id.world_container)
                }
            }
        ),

        Door(
            "Jin's House",
            "This is the house of Jin.",
            "Closed: Night",
            {IconFactory().houseDoor128()},
            {
                CurrentLocation.changeLocation(LocationName.JINS_HOUSE)

                it.supportFragmentManager.commit {

                    replace<LocationFragment>(R.id.world_container)
                }
            }
        ),

        Door(
            "Nikita's House",
            "This is the house of Nikita.",
            "Closed: Night",
            {IconFactory().houseDoor128()},
            {
                CurrentLocation.changeLocation(LocationName.NIKITAS_HOUSE)

                it.supportFragmentManager.commit {

                    replace<LocationFragment>(R.id.world_container)
                }
            }
        ),

        Door(
            "Sonny's House",
            "This is the house where you used to live before you took your own life.",
            "Closed All Day",
            {IconFactory().houseDoor128()},
            {
                CurrentLocation.changeLocation(LocationName.SONNYS_HOUSE)

                it.supportFragmentManager.commit {

                    replace<LocationFragment>(R.id.world_container)
                }
            }
        ),

        Door(
            "Carriage",
            "Here you can sell gems that you gather from the cave.",
            "Open All Day",
            {IconFactory().carriage128()},
            {
                it.supportFragmentManager.commit {

                    replace<CarriageFragment>(R.id.world_container)
                }
            },
            "Look Inside"
        )
    )

    private var door: Door = doors[METEORS_HOUSE]
    fun door() = door

    fun changeDoor(doorIndex: Int) {

        door = doors[doorIndex]
    }
}