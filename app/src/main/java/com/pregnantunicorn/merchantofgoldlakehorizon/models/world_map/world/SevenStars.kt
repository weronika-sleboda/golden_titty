package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world

import com.pregnantunicorn.merchantofgoldlakehorizon.models.doors.CurrentDoor
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles.EmptyGrassTile
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles.HouseTile
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles.Tile

class SevenStars : Location(
    "Seven Stars", Array(36) { EmptyGrassTile() as Tile }.also {

        it[0] = HouseTile(
            doorIndex = CurrentDoor.METEORS_HOUSE,
            icon = {IconFactory().meteorsHouse64()}
        )

        it[1] = HouseTile()
        it[2] = HouseTile()
        it[3] = HouseTile()
        it[8] = HouseTile()
        it[9] = HouseTile()
        it[10] = HouseTile()
    }
)