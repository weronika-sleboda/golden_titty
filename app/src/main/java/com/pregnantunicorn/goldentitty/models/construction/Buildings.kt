package com.pregnantunicorn.goldentitty.models.construction

import com.pregnantunicorn.goldentitty.models.graphics.IconFactory

object Buildings {

    private const val CAMP_FIRE = 0
    private const val WORKSHOP = 1
    private const val JINS_HUT = 2
    private const val SAPHONEES_HUT = 3
    private const val PIER = 4
    private const val EXCAVATION_SITE_NR1 = 5
    private const val EXCAVATION_SITE_NR2 = 6
    private const val EXCAVATION_SITE_NR3 = 7
    private const val EXCAVATION_SITE_NR4 = 8
    private const val EXCAVATION_SITE_NR5 = 9
    private const val EXCAVATION_SITE_NR6 = 10
    private const val EXCAVATION_SITE_NR7 = 11

    private val buildings = arrayOf(

        Building(
            "Camp Fire",
            "After building the camp fire, you will be able to cook.",
            { IconFactory().campFire128() },
            { IconFactory().campFire64() },
            BuildingType.CAMP_FIRE,
            10,
            5
        ),

        Building(
            "Workshop",
            "Building the workshop will allow you to make your own tools.",
            { IconFactory().workshop128() },
            { IconFactory().workshop64() },
            BuildingType.WORKSHOP,
            15,
            10
        ),

        Building(
            "Jin's Hut",
            "Building the hut for Jin will allow you to feed him with fried fish and ask him questions about key items.",
            { IconFactory().jinsHut128() },
            { IconFactory().jinsHut64() },
            BuildingType.JINS_HUT,
            15,
            10
        ),

        Building(
            "Saphonee's Hut",
            "Building the hut for Saphonee will allow you to feed her with fried fish and ask her questions about key items.",
            { IconFactory().jinsHut128() },
            { IconFactory().jinsHut64() },
            BuildingType.SAPHONEES_HUT,
            15,
            10
        ),

        Building(
            "Pier",
            "Building the pier will allow you to acquire fish. The fish restores health which is crucial for survival.",
            { IconFactory().pier128() },
            { IconFactory().pier64() },
            BuildingType.JINS_HUT,
            15,
            10
        ),

        Building(
            "Excavation Site Nr1",
            "Building the excavation site will allow you to dig for key items which are crucial for story progress.",
            { IconFactory().excavationSite128() },
            { IconFactory().excavationSite64() },
            BuildingType.EXCAVATION_SITE_NR1,
            15,
            10
        ),

        Building(
            "Excavation Site Nr2",
            "Building the excavation site will allow you to dig for key items which are crucial for story progress.",
            { IconFactory().excavationSite128() },
            { IconFactory().excavationSite64() },
            BuildingType.EXCAVATION_SITE_NR2,
            15,
            10
        ),

        Building(
            "Excavation Site Nr3",
            "Building the excavation site will allow you to dig for key items which are crucial for story progress.",
            { IconFactory().excavationSite128() },
            { IconFactory().excavationSite64() },
            BuildingType.EXCAVATION_SITE_NR3,
            15,
            10
        ),

        Building(
            "Excavation Site Nr4",
            "Building the excavation site will allow you to dig for key items which are crucial for story progress.",
            { IconFactory().excavationSite128() },
            { IconFactory().excavationSite64() },
            BuildingType.EXCAVATION_SITE_NR4,
            15,
            10
        ),

        Building(
            "Excavation Site Nr5",
            "Building the excavation site will allow you to dig for key items which are crucial for story progress.",
            { IconFactory().excavationSite128() },
            { IconFactory().excavationSite64() },
            BuildingType.EXCAVATION_SITE_NR5,
            15,
            10
        ),

        Building(
            "Excavation Site Nr6",
            "Building the excavation site will allow you to dig for key items which are crucial for story progress.",
            { IconFactory().excavationSite128() },
            { IconFactory().excavationSite64() },
            BuildingType.EXCAVATION_SITE_NR6,
            15,
            10
        ),

        Building(
            "Excavation Site Nr7",
            "Building the excavation site will allow you to dig for key items which are crucial for story progress.",
            { IconFactory().excavationSite128() },
            { IconFactory().excavationSite64() },
            BuildingType.EXCAVATION_SITE_NR7,
            15,
            10
        ),
    )

    fun building(buildingType: BuildingType): Building {

        return when(buildingType) {

            BuildingType.WORKSHOP -> buildings[WORKSHOP]
            BuildingType.CAMP_FIRE -> buildings[CAMP_FIRE]
            BuildingType.JINS_HUT -> buildings[JINS_HUT]
            BuildingType.SAPHONEES_HUT -> buildings[SAPHONEES_HUT]
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