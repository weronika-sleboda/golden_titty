package com.pregnantunicorn.merchantofgoldlakehorizon.models.doors

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.CarriageFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.Message
import com.pregnantunicorn.merchantofgoldlakehorizon.models.robes.CurrentRobe
import com.pregnantunicorn.merchantofgoldlakehorizon.models.robes.RobeType
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world.CurrentLocation
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world.LocationName
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.InfoDialogFragment
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
    const val GREEN_HOUSE = 9
    const val WHITE_PALACE = 10
    const val LIBRARY = 11
    const val UNIVERSITY = 12
    const val HERETIC_TEMPLE = 13
    const val DIVINE_TEMPLE = 14
    const val MERCHANT_HALL = 15
    const val TENT = 16
    const val BOAT = 17

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
                checkTheRobe(
                    it, RobeType.BLACK, "Jin", R.drawable.jin64,
                    "I don't see you wearing Black Dragon robe. " +
                            "This house is under investigation and only watchmen can enter it.",
                    LocationName.SONNYS_HOUSE
                )
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
        ),

        Door(
            "Green House",
            "This is the place where you can buy robes.",
            "Open All Day",
            {IconFactory().houseDoor128()},
            {
                CurrentLocation.changeLocation(LocationName.GREEN_HOUSE)
                it.supportFragmentManager.commit {

                    replace<LocationFragment>(R.id.world_container)
                }
            },
        ),

        Door(
            "White Palace",
            "This is the place where you can buy food.",
            "Open All Day",
            {IconFactory().houseDoor128()},
            {
                CurrentLocation.changeLocation(LocationName.WHITE_PALACE)
                it.supportFragmentManager.commit {

                    replace<LocationFragment>(R.id.world_container)
                }
            },
        ),

        Door(
            "Library",
            "This is the place where you can read books and gather information.",
            "Open All Day",
            {IconFactory().houseDoor128()},
            {
                CurrentLocation.changeLocation(LocationName.LIBRARY)
                it.supportFragmentManager.commit {

                    replace<LocationFragment>(R.id.world_container)
                }
            },
        ),

        Door(
            "University",
            "Here you can upgrade your charisma, energy, persuasion and intelligence.",
            "Open All Day",
            {IconFactory().houseDoor128()},
            {
                CurrentLocation.changeLocation(LocationName.UNIVERSITY)
                it.supportFragmentManager.commit {

                    replace<LocationFragment>(R.id.world_container)
                }
            },
        ),

        Door(
            "Temple of Shadow",
            "This is the place where the heretics meet to worship their god.",
            "Members Only",
            {IconFactory().houseDoor128()},
            {
                checkTheRobe(
                    it, RobeType.RED, "Pasha", R.drawable.pasha64,
                    "I don't see you wearing the shadow robe. " +
                            "Only the members are allowed to enter the temple.",
                    LocationName.HERETIC_TEMPLE
                )
            },
        ),

        Door(
            "Divine Temple",
            "This is Creator's temple.",
            "Open All Day",
            {IconFactory().houseDoor128()},
            {
                CurrentLocation.changeLocation(LocationName.DIVINE_TEMPLE)
                it.supportFragmentManager.commit {

                    replace<LocationFragment>(R.id.world_container)
                }
            },
        ),

        Door(
            "Merchant Hall",
            "Here you can buy items which can be useful when progressing the story.",
            "Open All Day",
            {IconFactory().houseDoor128()},
            {
                CurrentLocation.changeLocation(LocationName.MERCHANT_HALL)
                it.supportFragmentManager.commit {

                    replace<LocationFragment>(R.id.world_container)
                }
            },
        ),


        Door(
            "Tent",
            "???",
            "Appears At Night",
            {IconFactory().curtains128()},
            {
                CurrentLocation.changeLocation(LocationName.TENT)
                it.supportFragmentManager.commit {

                    replace<LocationFragment>(R.id.world_container)
                }
            },
            "Look Inside"
        ),

        Door(
            "Ship Orion",
            "???",
            "Appears At Night",
            {IconFactory().stairsUp128()},
            {
                CurrentLocation.changeLocation(LocationName.BOAT)
                it.supportFragmentManager.commit {

                    replace<LocationFragment>(R.id.world_container)
                }
            },
        )
    )

    private fun checkTheRobe(
        activity: FragmentActivity,
        robeType: RobeType,
        title: String,
        icon: Int,
        content: String,
        locationName: LocationName
    ) {

        if(CurrentRobe.robe() == robeType) {

            CurrentLocation.changeLocation(locationName)
            activity.supportFragmentManager.commit {

                replace<LocationFragment>(R.id.world_container)
            }
        }

        else {

            CurrentMessage.changeMessage(title, icon, content)

            InfoDialogFragment(CurrentMessage.message())
                .show(activity.supportFragmentManager, InfoDialogFragment.INFO_TAG)
        }
    }

    private var door: Door = doors[METEORS_HOUSE]
    fun door() = door

    fun changeDoor(doorIndex: Int) {

        door = doors[doorIndex]
    }
}