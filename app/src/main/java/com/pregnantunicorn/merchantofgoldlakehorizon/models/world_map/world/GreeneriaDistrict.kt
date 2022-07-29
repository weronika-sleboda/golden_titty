package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world

import com.pregnantunicorn.merchantofgoldlakehorizon.models.doors.CurrentDoor
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles.*

class GreeneriaDistrict : Location(
    "Greeneria District", Array(16) { EmptyWoodenTile() as Tile }.also {

        it[0] = BuildingTile(
            doorIndex = CurrentDoor.METEORS_HOUSE,
            icon = {IconFactory().meteorsHouse64()}
        )

        it[1] = BuildingTile(doorIndex = CurrentDoor.KHANS_HOUSE)
        it[2] = BuildingTile(doorIndex = CurrentDoor.PASHAS_HOUSE)
        it[3] = BuildingTile(doorIndex = CurrentDoor.ERICAS_HOUSE)

        it[4] = RainbowForestExitTile(
            { IconFactory().roadSign64() },
            { BackgroundFactory().woodenFloor() }
        )

        it[7] = PearlCoastExitTile(
            { IconFactory().roadSign64() },
            { BackgroundFactory().woodenFloor() }
        )

        it[8] = BuildingTile(doorIndex = CurrentDoor.JORDANS_HOUSE)
        it[9] = BuildingTile(doorIndex = CurrentDoor.JINS_HOUSE)
        it[10] = BuildingTile(doorIndex = CurrentDoor.NIKITAS_HOUSE)
        it[11] = BuildingTile(doorIndex = CurrentDoor.SONNYS_HOUSE)
    }
)