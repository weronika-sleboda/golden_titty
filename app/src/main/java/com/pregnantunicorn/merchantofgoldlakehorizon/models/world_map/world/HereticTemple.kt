package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles.*

class HereticTemple : Location(
    "Temple Of Shadow", Array(12) { EmptyHereticTile() as Tile }.also {

        it[10] = PearlCoastExitTile(
            { IconFactory().houseDoor64() },
            { BackgroundFactory().hereticFloor() }
        )
    }
)