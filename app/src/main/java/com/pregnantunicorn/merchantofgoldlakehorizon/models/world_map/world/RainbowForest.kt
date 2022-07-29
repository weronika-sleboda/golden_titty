package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles.*

class RainbowForest : Location(
    "Rainbow Forest", Array(16) { EmptyJungleTile() as Tile }.also {

        it[0] = TreeTile()
        it[1] = TreeTile()
        it[2] = TreeTile()
        it[3] = TreeTile()
        it[4] = CarriageTile()
        it[5] = EmptyWoodenTile()
        it[6] = EmptyWoodenTile()
        it[8] = TreeTile()
        it[9] = CaveTile()
        it[10] = TreeTile()
        it[11] = TreeTile()

        it[7] = GreeneriaExitTile(
            { IconFactory().roadSign64() },
            { BackgroundFactory().woodenFloor() }
        )
    }
)