package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles.*

class FoodShop : Location(
    "White Palace Tavern", Array(12) { EmptyWhiteTile() as Tile }.also {

        it[1] = WhitePalaceTable()

        it[10] = PearlCoastExitTile(
            { IconFactory().houseDoor64() },
            { BackgroundFactory().whiteFloor() }
        )
    }
)