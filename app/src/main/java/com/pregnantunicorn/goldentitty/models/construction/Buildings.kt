package com.pregnantunicorn.goldentitty.models.construction

import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.npcs.LadySilvia
import com.pregnantunicorn.goldentitty.models.story_line.EventTitle
import com.pregnantunicorn.goldentitty.models.story_line.events.*
import com.pregnantunicorn.goldentitty.models.world_map.world.LocationName

object Buildings {

    private const val CAMP_FIRE = 0
    private const val WORKSHOP = 1
    private const val LADY_SILVIAS_HUT = 2
    private const val PIER = 3
    private const val EXCAVATION_SITE_NR1 = 4
    private const val EXCAVATION_SITE_NR2 = 5
    private const val EXCAVATION_SITE_NR3 = 6
    private const val EXCAVATION_SITE_NR4 = 7
    private const val EXCAVATION_SITE_NR5 = 8
    private const val EXCAVATION_SITE_NR6 = 9
    private const val EXCAVATION_SITE_NR7 = 10

    private val buildings = arrayOf(

        Building(
            "Camp Fire",
            "After building the camp fire, you will be able to cook.",
            { IconFactory().campFire128() },
            { IconFactory().campFire64() },
            BuildingType.CAMP_FIRE,
            10,
            5,
            EventTitle.CAMP_FIRE_EVENT,
            CampFireEvent.event,
            LocationName.TICKY_TACKA_WEST,
        )
        {},

        Building(
            "Workshop",
            "Building the workshop will allow you to make your own tools.",
            { IconFactory().workshop128() },
            { IconFactory().workshop64() },
            BuildingType.WORKSHOP,
            15,
            10,
            EventTitle.WORKSHOP_EVENT,
            WorkshopEvent.event,
            LocationName.TICKY_TACKA_WEST,
        ) {},

        Building(
            "Lady Silvia's Hut",
            "Building the hut for Lady Silvia will allow you to feed her with fried fish and ask her questions about key items.",
            { IconFactory().ladySilviasHut128() },
            { IconFactory().ladySilviasHut64() },
            BuildingType.LADY_SILVIAS_HUT,
            15,
            10,
            EventTitle.LADY_SILVIAS_HUT_EVENT,
            LadySilviasHutEvent.event,
            LocationName.TICKY_TACKA_WEST,
        ) { LadySilvia.ladySilvia().moveToHouse() },

        Building(
            "Pier",
            "Building the pier will allow you to acquire fish. The fish restores health which is crucial for survival.",
            { IconFactory().pier128() },
            { IconFactory().pier64() },
            BuildingType.PIER,
            15,
            10,
            EventTitle.PIER_EVENT,
            PierEvent.event,
            LocationName.TICKY_TACKA_WEST,
        ) {},

        Building(
            "Excavation Site Nr1",
            "Building the excavation site will allow you to dig for key items which are crucial for story progress.",
            { IconFactory().excavationSite128() },
            { IconFactory().excavationSite64() },
            BuildingType.EXCAVATION_SITE_NR1,
            15,
            10,
            EventTitle.EXCAVATION_SITE_EVENT,
            ExcavationSiteEvent.event,
            LocationName.TICKY_TACKA_WEST,
        ) {},

        Building(
            "Excavation Site Nr2",
            "Building the excavation site will allow you to dig for key items which are crucial for story progress.",
            { IconFactory().excavationSite128() },
            { IconFactory().excavationSite64() },
            BuildingType.EXCAVATION_SITE_NR2,
            15,
            10,
            EventTitle.EXCAVATION_SITE_EVENT,
            ExcavationSiteEvent.event,
            LocationName.TICKY_TACKA_EAST,
        ) {},

        Building(
            "Excavation Site Nr3",
            "Building the excavation site will allow you to dig for key items which are crucial for story progress.",
            { IconFactory().excavationSite128() },
            { IconFactory().excavationSite64() },
            BuildingType.EXCAVATION_SITE_NR3,
            15,
            10,
            EventTitle.EXCAVATION_SITE_EVENT,
            ExcavationSiteEvent.event,
            LocationName.TICKY_TACKA_EAST,
        ) {},

        Building(
            "Excavation Site Nr4",
            "Building the excavation site will allow you to dig for key items which are crucial for story progress.",
            { IconFactory().excavationSite128() },
            { IconFactory().excavationSite64() },
            BuildingType.EXCAVATION_SITE_NR4,
            15,
            10,
            EventTitle.EXCAVATION_SITE_EVENT,
            ExcavationSiteEvent.event,
            LocationName.TICKY_TACKA_EAST,
        ) {},

        Building(
            "Excavation Site Nr5",
            "Building the excavation site will allow you to dig for key items which are crucial for story progress.",
            { IconFactory().excavationSite128() },
            { IconFactory().excavationSite64() },
            BuildingType.EXCAVATION_SITE_NR5,
            15,
            10,
            EventTitle.EXCAVATION_SITE_EVENT,
            ExcavationSiteEvent.event,
            LocationName.TICKY_TACKA_EAST,
        ) {},

        Building(
            "Excavation Site Nr6",
            "Building the excavation site will allow you to dig for key items which are crucial for story progress.",
            { IconFactory().excavationSite128() },
            { IconFactory().excavationSite64() },
            BuildingType.EXCAVATION_SITE_NR6,
            15,
            10,
            EventTitle.EXCAVATION_SITE_EVENT,
            ExcavationSiteEvent.event,
            LocationName.TICKY_TACKA_EAST,
        ) {},

        Building(
            "Excavation Site Nr7",
            "Building the excavation site will allow you to dig for key items which are crucial for story progress.",
            { IconFactory().excavationSite128() },
            { IconFactory().excavationSite64() },
            BuildingType.EXCAVATION_SITE_NR7,
            15,
            10,
            EventTitle.EXCAVATION_SITE_EVENT,
            ExcavationSiteEvent.event,
            LocationName.TICKY_TACKA_EAST,
        ) {},
    )

    fun building(buildingType: BuildingType): Building {

        return when(buildingType) {

            BuildingType.WORKSHOP -> buildings[WORKSHOP]
            BuildingType.CAMP_FIRE -> buildings[CAMP_FIRE]
            BuildingType.LADY_SILVIAS_HUT -> buildings[LADY_SILVIAS_HUT]
            BuildingType.PIER -> buildings[PIER]
            BuildingType.EXCAVATION_SITE_NR1 -> buildings[EXCAVATION_SITE_NR1]
            BuildingType.EXCAVATION_SITE_NR2 -> buildings[EXCAVATION_SITE_NR2]
            BuildingType.EXCAVATION_SITE_NR3 -> buildings[EXCAVATION_SITE_NR3]
            BuildingType.EXCAVATION_SITE_NR4 -> buildings[EXCAVATION_SITE_NR4]
            BuildingType.EXCAVATION_SITE_NR5 -> buildings[EXCAVATION_SITE_NR5]
            BuildingType.EXCAVATION_SITE_NR6 -> buildings[EXCAVATION_SITE_NR6]
            BuildingType.EXCAVATION_SITE_NR7 -> buildings[EXCAVATION_SITE_NR7]
        }
    }

    fun reset() {

        for(building in buildings) {

            building.reset()
        }
    }

    fun buildingsBuilt(): BooleanArray {

        val buildingsBuilt = BooleanArray(buildings.size)

        for(index in buildings.indices) {

            buildingsBuilt[index] = buildings[index].isBuild()
        }

        return buildingsBuilt
    }

    fun load(buildingsBuilt: BooleanArray) {

        for(index in buildings.indices) {

            buildings[index].setIsBuild(buildingsBuilt[index])
        }
    }
}