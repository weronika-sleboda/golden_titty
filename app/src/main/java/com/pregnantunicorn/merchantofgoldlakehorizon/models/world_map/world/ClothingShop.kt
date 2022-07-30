package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles.*

class ClothingShop : Location(
    "Green House", Array(12) { EmptyJungleTile() as Tile }.also {

        it[1] = GreenHouseClosetTile()

        it[11] = PearlCoastExitTile(
            { IconFactory().houseDoor64() },
            { BackgroundFactory().jungle() }
        )
    }
)