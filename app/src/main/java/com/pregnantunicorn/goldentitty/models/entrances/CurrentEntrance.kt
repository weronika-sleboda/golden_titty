package com.pregnantunicorn.goldentitty.models.entrances

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.excavation.CurrentExcavationSite
import com.pregnantunicorn.goldentitty.models.excavation.ExcavationNumber
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.information.CurrentInformation
import com.pregnantunicorn.goldentitty.models.key_items.CurrentKeyItem
import com.pregnantunicorn.goldentitty.models.key_items.KeyItemType
import com.pregnantunicorn.goldentitty.models.message.CurrentMessage
import com.pregnantunicorn.goldentitty.models.npcs.LadySilvia
import com.pregnantunicorn.goldentitty.models.tools.CurrentHandState
import com.pregnantunicorn.goldentitty.models.tools.HandState
import com.pregnantunicorn.goldentitty.models.world_map.world.CurrentLocation
import com.pregnantunicorn.goldentitty.models.world_map.world.LocationName
import com.pregnantunicorn.goldentitty.views.dialog_fragments.InfoDialogFragment
import com.pregnantunicorn.goldentitty.views.fragments.*

object CurrentEntrance {

    const val TENT  = 0
    const val LADY_SILVIAS_HUT = 1
    const val CAVE = 2
    const val WOOD_PALM = 3
    const val COCONUT_PALM = 4
    const val PIER = 5
    const val WORKSHOP = 6
    const val CAMP_FIRE = 7
    const val EXCAVATION_SITE_NR1 = 8
    const val EXCAVATION_SITE_NR2 = 9
    const val EXCAVATION_SITE_NR3 = 10
    const val EXCAVATION_SITE_NR4 = 11
    const val EXCAVATION_SITE_NR5 = 12
    const val EXCAVATION_SITE_NR6 = 13
    const val EXCAVATION_SITE_NR7 = 14
    const val TEMPLE_RUINS = 15
    const val WESTERN_GATE = 16
    const val EASTERN_GATE = 17
    const val CHIDINMAS_STATUE = 18

    private val entrances = arrayOf(

        Entrance(
            "Tent",
            { IconFactory().curtains128() },
            "You can restore your energy here. Sleeping in this hut will only cost you 1 health point.",
            "Go Inside",
            { true },
            {
                it.supportFragmentManager.commit {

                    replace<SleepingBagFragment>(R.id.world_container)
                }
            }
        ),

        Entrance(
            "Lady Silvia's Hut",
            { IconFactory().curtains128() },
            "This is the place where Lady Silvia sleeps.",
            "Go Inside",
            { true },
            {

                it.supportFragmentManager.commit {

                    replace<NpcFragment>(R.id.world_container)
                }
            }
        ),

        Entrance(
            "Cave",
            { IconFactory().cave128() },
            "This is the place where you can acquire iron.",
            "Go Inside",
            { true },
            {

                it.supportFragmentManager.commit {

                    replace<HammerFragment>(R.id.world_container)
                }
            }
        ),

        Entrance(
            "Palm",
            { IconFactory().woodPalm128() },
            "This is the place where you can acquire wood.",
            "Approach",
            { true },
            {
                it.supportFragmentManager.commit {

                    replace<AxeFragment>(R.id.world_container)
                }
            }
        ),

        Entrance(
            "Coconut Palm",
            { IconFactory().coconutPalm128() },
            "This is the place where you can acquire coconuts.",
            "Approach",
            { true },
            {
                it.supportFragmentManager.commit {

                    replace<CoconutPalmFragment>(R.id.world_container)
                }
            }
        ),

        Entrance(
            "Pier",
            { IconFactory().pier128() },
            "This is the place where you can acquire fish.",
            "Approach",
            { true },
            {
                it.supportFragmentManager.commit {

                    replace<FishingSpotFragment>(R.id.world_container)
                }
            }
        ),

        Entrance(
            "Workshop",
            { IconFactory().woodenDoor128() },
            "This is the place where you can make new tools.",
            "Enter",
            { true },
            {
                it.supportFragmentManager.commit {

                    replace<WorkshopFragment>(R.id.world_container)
                }
            }
        ),

        Entrance(
            "Camp Fire",
            { IconFactory().campFire128() },
            "This is the place where you can cook.",
            "Approach",
            { true },
            {
                it.supportFragmentManager.commit {

                    replace<CampFireFragment>(R.id.world_container)
                }
            }
        ),

        Entrance(
            "Excavation Site Nr 1",
            { IconFactory().ladder128() },
            "This is the place where you dig for key items.",
            "Climb",
            { true },
            {

                CurrentExcavationSite.changeExcavationNumber(ExcavationNumber.NR1)

                if(CurrentExcavationSite.excavation().hasBeenExcavated()) {

                    CurrentInformation.changeInformation(CurrentInformation.EXCAVATION_SITE)

                    it.supportFragmentManager.commit {

                        replace<InformationFragment>(R.id.world_container)
                    }
                }

                else {

                    it.supportFragmentManager.commit {

                        replace<ExcavationFragment>(R.id.world_container)
                    }
                }
            }
        ),

        Entrance(
            "Excavation Site Nr 2",
            { IconFactory().ladder128() },
            "This is the place where you dig for key items.",
            "Climb",
            { true },
            {

                CurrentExcavationSite.changeExcavationNumber(ExcavationNumber.NR2)

                if(CurrentExcavationSite.excavation().hasBeenExcavated()) {

                    CurrentInformation.changeInformation(CurrentInformation.EXCAVATION_SITE)

                    it.supportFragmentManager.commit {

                        replace<InformationFragment>(R.id.world_container)
                    }
                }

                else {

                    it.supportFragmentManager.commit {

                        replace<ExcavationFragment>(R.id.world_container)
                    }
                }
            }
        ),

        Entrance(
            "Excavation Site Nr 3",
            { IconFactory().ladder128() },
            "This is the place where you dig for key items.",
            "Climb",
            { true },
            {

                CurrentExcavationSite.changeExcavationNumber(ExcavationNumber.NR3)

                if(CurrentExcavationSite.excavation().hasBeenExcavated()) {

                    CurrentInformation.changeInformation(CurrentInformation.EXCAVATION_SITE)

                    it.supportFragmentManager.commit {

                        replace<InformationFragment>(R.id.world_container)
                    }
                }

                else {

                    it.supportFragmentManager.commit {

                        replace<ExcavationFragment>(R.id.world_container)
                    }
                }
            }
        ),

        Entrance(
            "Excavation Site Nr 4",
            { IconFactory().ladder128() },
            "This is the place where you dig for key items.",
            "Climb",
            { true },
            {

                CurrentExcavationSite.changeExcavationNumber(ExcavationNumber.NR4)

                if(CurrentExcavationSite.excavation().hasBeenExcavated()) {

                    CurrentInformation.changeInformation(CurrentInformation.EXCAVATION_SITE)

                    it.supportFragmentManager.commit {

                        replace<InformationFragment>(R.id.world_container)
                    }
                }

                else {

                    it.supportFragmentManager.commit {

                        replace<ExcavationFragment>(R.id.world_container)
                    }
                }
            }
        ),

        Entrance(
            "Excavation Site Nr 5",
            { IconFactory().ladder128() },
            "This is the place where you dig for key items.",
            "Climb",
            { true },
            {

                CurrentExcavationSite.changeExcavationNumber(ExcavationNumber.NR5)

                if(CurrentExcavationSite.excavation().hasBeenExcavated()) {

                    CurrentInformation.changeInformation(CurrentInformation.EXCAVATION_SITE)

                    it.supportFragmentManager.commit {

                        replace<InformationFragment>(R.id.world_container)
                    }
                }

                else {

                    it.supportFragmentManager.commit {

                        replace<ExcavationFragment>(R.id.world_container)
                    }
                }
            }
        ),

        Entrance(
            "Excavation Site Nr 6",
            { IconFactory().ladder128() },
            "This is the place where you dig for key items.",
            "Climb",
            { true },
            {

                CurrentExcavationSite.changeExcavationNumber(ExcavationNumber.NR6)

                if(CurrentExcavationSite.excavation().hasBeenExcavated()) {

                    CurrentInformation.changeInformation(CurrentInformation.EXCAVATION_SITE)

                    it.supportFragmentManager.commit {

                        replace<InformationFragment>(R.id.world_container)
                    }
                }

                else {

                    it.supportFragmentManager.commit {

                        replace<ExcavationFragment>(R.id.world_container)
                    }
                }
            }
        ),

        Entrance(
            "Excavation Site Nr 7",
            { IconFactory().ladder128() },
            "This is the place where you dig for key items.",
            "Climb",
            { true },
            {

                CurrentExcavationSite.changeExcavationNumber(ExcavationNumber.NR7)

                if(CurrentExcavationSite.excavation().hasBeenExcavated()) {

                    CurrentInformation.changeInformation(CurrentInformation.EXCAVATION_SITE)

                    it.supportFragmentManager.commit {

                        replace<InformationFragment>(R.id.world_container)
                    }
                }

                else {

                    it.supportFragmentManager.commit {

                        replace<ExcavationFragment>(R.id.world_container)
                    }
                }
            }
        ),

        Entrance(
            "Temple Ruins",
            { IconFactory().templeDoor128() },
            "This is the place where the villains reside. They surely know where the Golden Titty is hidden.",
            "Enter",
            { true },
            {

                if(CurrentKeyItem.keyItemType() == KeyItemType.TEMPLE_KEY) {

                    it.supportFragmentManager.commit {

                        replace<TempleFragment>(R.id.world_container)
                    }
                }

                else {

                    CurrentMessage.changeMessage(
                        "Locked",
                        R.drawable.padlock64,
                        "The door is locked. You need to have a key."
                    )

                    showMessage(it)
                }
            }
        ),

        Entrance(
            "Western Gate",
            { IconFactory().secretGate128() },
            "???",
            "Enter",
            { true },
            {

                if(CurrentHandState.handState() == HandState.KEY_ITEM &&
                    CurrentKeyItem.keyItemType() == KeyItemType.SHAMANIC_NECKLACE) {

                    CurrentLocation.changeLocation(LocationName.TICKY_TACKA_EAST)

                    it.supportFragmentManager.commit {

                        replace<LocationFragment>(R.id.world_container)
                    }
                }

                else {

                    CurrentMessage.changeMessage(
                        "Meteor",
                        R.drawable.meteor64,
                        "It looks like the gate is protected by the invisible magical barrier."
                    )

                    showMessage(it)
                }
            }
        ),

        Entrance(
            "Eastern Gate",
            { IconFactory().secretGate128() },
            "???",
            "Enter",
            { true },
            {

                CurrentLocation.changeLocation(LocationName.TICKY_TACKA_WEST)

                it.supportFragmentManager.commit {

                    replace<LocationFragment>(R.id.world_container)
                }
            }
        ),

        Entrance(
            "Statue Of Goddess Chidinma",
            { IconFactory().chidinmaStatue128() },
            "???",
            "Approach",
            { true },
            {

                it.supportFragmentManager.commit {

                    replace<ChidinmaStatueFragment>(R.id.world_container)
                }
            }
        ),
    )

    private fun showMessage(activity: FragmentActivity) {

        InfoDialogFragment(CurrentMessage.message())
            .show(activity.supportFragmentManager, InfoDialogFragment.INFO_TAG)
    }

    private var entrance = entrances[TENT]
    fun entrance() = entrance

    fun changeEntrance(entranceIndex: Int) {

        entrance = entrances[entranceIndex]
    }
}