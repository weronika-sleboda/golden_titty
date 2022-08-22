package com.pregnantunicorn.merchantofgoldlakehorizon.models.construction

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory

object Buildings {

    private const val CAMP_FIRE = 0
    private const val WORKSHOP = 1
    private const val CAFETERIA = 2

    private val buildings = arrayOf(

        Building(
            "Camp Fire",
            "Building the camp fire will allow you to upgrade your skills.",
            { IconFactory().campFire128() },
            { IconFactory().campFire64() },
            BuildingType.CAMP_FIRE,
            10,
            5
        ),

        Building(
            "Workshop",
            "Building the workshop will allow you to make your own tools.",
            { IconFactory().hut128Nr1() },
            { IconFactory().hut64Nr1() },
            BuildingType.WORKSHOP,
            10,
            10
        ),

        Building(
            "Cafeteria",
            "After building the cafeteria, you won't have to worry about Serenity's health and you will be able to buy drinks.",
            { IconFactory().hut128Nr2() },
            { IconFactory().hut64Nr2() },
            BuildingType.CAFETERIA,
            15,
            10
        ),
    )

    fun building(buildingType: BuildingType): Building {

        return when(buildingType) {

            BuildingType.WORKSHOP -> buildings[WORKSHOP]
            BuildingType.CAFETERIA -> buildings[CAFETERIA]
            BuildingType.CAMP_FIRE -> buildings[CAMP_FIRE]
        }
    }
}