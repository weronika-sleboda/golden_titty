package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world

import com.pregnantunicorn.merchantofgoldlakehorizon.models.doors.CurrentDoor
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles.*

class PearlCoastDistrict : Location(
    "Pearl Coast District", Array(16) { EmptyBeachTile() as Tile }.also {

        it[0] = BuildingTile(

            icon = {IconFactory().library64()}
        )

        it[1] = BuildingTile(

            icon = {IconFactory().university64()}
        )

        it[2] = BuildingTile(

            icon = {IconFactory().merchantHall64()}
        )

        it[3] = BuildingTile(

            icon = {IconFactory().hereticTemple64()},
        )

        it[8] = BuildingTile(

            icon = {IconFactory().clothingShop64()}
        )

        it[9] = BuildingTile(

            icon = {IconFactory().tavern64()},
        )

        it[10] = BuildingTile(

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