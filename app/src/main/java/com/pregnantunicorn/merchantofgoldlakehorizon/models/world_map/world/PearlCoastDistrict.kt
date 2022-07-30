package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world

import com.pregnantunicorn.merchantofgoldlakehorizon.models.doors.CurrentDoor
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles.*

class PearlCoastDistrict : Location(
    "Pearl Coast District", Array(16) { EmptyBeachTile() as Tile }.also {

        it[0] = BuildingTile(

            doorIndex = CurrentDoor.LIBRARY,
            icon = {IconFactory().library64()}
        )

        it[1] = BuildingTile(

            doorIndex = CurrentDoor.UNIVERSITY,
            icon = {IconFactory().university64()}
        )

        it[2] = BuildingTile(

            doorIndex = CurrentDoor.MERCHANT_HALL,
            icon = {IconFactory().merchantHall64()}
        )

        it[3] = BuildingTile(

            doorIndex = CurrentDoor.HERETIC_TEMPLE,
            icon = {IconFactory().hereticTemple64()},
        )

        it[8] = BuildingTile(

            doorIndex = CurrentDoor.GREEN_HOUSE,
            icon = {IconFactory().clothingShop64()}
        )

        it[9] = BuildingTile(

            doorIndex = CurrentDoor.WHITE_PALACE,
            icon = {IconFactory().tavern64()},
        )

        it[10] = BuildingTile(

            doorIndex = CurrentDoor.DIVINE_TEMPLE,
            icon = {IconFactory().divineTemple64()},
        )

        it[4] = GreeneriaExitTile(
            { IconFactory().roadSign64() },
            { BackgroundFactory().beach() }
        )

        it[7] = PearlCoastBeachExitTile(
            { IconFactory().roadSign64() },
            { BackgroundFactory().beach() }
        )
    }
)