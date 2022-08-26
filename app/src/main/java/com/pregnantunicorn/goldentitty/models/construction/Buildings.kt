package com.pregnantunicorn.goldentitty.models.construction

import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.npcs.LadySilvia

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
            5
        ) {},

        Building(
            "Workshop",
            "Building the workshop will allow you to make your own tools.",
            { IconFactory().workshop128() },
            { IconFactory().workshop64() },
            BuildingType.WORKSHOP,
            15,
            10
        ) {},

        Building(
            "Lady Silvia's Hut",
            "Building the hut for Lady Silvia will allow you to feed her with fried fish and ask her questions about key items.",
            { IconFactory().saphoneesHut128() },
            { IconFactory().saphoneesHut64() },
            BuildingType.LADY_SILVIAS_HUT,
            15,
            10
        ) { LadySilvia.ladySilvia().moveToHouse() },

        Building(
            "Pier",
            "Building the pier will allow you to acquire fish. The fish restores health which is crucial for survival.",
            { IconFactory().pier128() },
            { IconFactory().pier64() },
            BuildingType.PIER,
            15,
            10
        ) {},

        Building(
            "Excavation Site Nr1",
            "Building the excavation site will allow you to dig for key items which are crucial for story progress.",
            { IconFactory().excavationSite128() },
            { IconFactory().excavationSite64() },
            BuildingType.EXCAVATION_SITE_NR1,
            15,
            10
        ) {},

        Building(
            "Excavation Site Nr2",
            "Building the excavation site will allow you to dig for key items which are crucial for story progress.",
            { IconFactory().excavationSite128() },
            { IconFactory().excavationSite64() },
            BuildingType.EXCAVATION_SITE_NR2,
            15,
            10
        ) {},

        Building(
            "Excavation Site Nr3",
            "Building the excavation site will allow you to dig for key items which are crucial for story progress.",
            { IconFactory().excavationSite128() },
            { IconFactory().excavationSite64() },
            BuildingType.EXCAVATION_SITE_NR3,
            15,
            10
        ) {},

        Building(
            "Excavation Site Nr4",
            "Building the excavation site will allow you to dig for key items which are crucial for story progress.",
            { IconFactory().excavationSite128() },
            { IconFactory().excavationSite64() },
            BuildingType.EXCAVATION_SITE_NR4,
            15,
            10
        ) {},

        Building(
            "Excavation Site Nr5",
            "Building the excavation site will allow you to dig for key items which are crucial for story progress.",
            { IconFactory().excavationSite128() },
            { IconFactory().excavationSite64() },
            BuildingType.EXCAVATION_SITE_NR5,
            15,
            10
        ) {},

        Building(
            "Excavation Site Nr6",
            "Building the excavation site will allow you to dig for key items which are crucial for story progress.",
            { IconFactory().excavationSite128() },
            { IconFactory().excavationSite64() },
            BuildingType.EXCAVATION_SITE_NR6,
            15,
            10
        ) {},

        Building(
            "Excavation Site Nr7",
            "Building the excavation site will allow you to dig for key items which are crucial for story progress.",
            { IconFactory().excavationSite128() },
            { IconFactory().excavationSite64() },
            BuildingType.EXCAVATION_SITE_NR7,
            15,
            10
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
}