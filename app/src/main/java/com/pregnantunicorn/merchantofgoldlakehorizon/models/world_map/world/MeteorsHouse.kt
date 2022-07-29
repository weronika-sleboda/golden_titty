package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles.*

class MeteorsHouse: Location(
    "Meteor's House", Array(12) { EmptyWoodenTile() as Tile }.also {

        it[0] = MeteorsBedTile()
        it[1] = MeteorClosetTile()
        it[2] = MeteorsBookCaseTile()
        it[3] = MeteorsDeskTile()
        it[8] = MeteorTableTile()
        it[9] = MeteorsAltarTile()
        it[11] = MeteorsHarpTile()

        it[10] = GreeneriaExitTile (
            { IconFactory().houseDoor64() },
            { BackgroundFactory().woodenFloor() }
        )
    }
)