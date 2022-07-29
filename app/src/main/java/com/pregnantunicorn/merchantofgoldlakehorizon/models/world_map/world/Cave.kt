package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.investigation.CurrentInvestigation
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles.*

class Cave: Location(
    "Dragon Cave", Array(8) { EmptyCaveTile() as Tile }.also {

        it[0] = GemStoneTile { IconFactory().emeraldStone64() }
        it[4] = GemStoneTile { IconFactory().sapphireStone64() }
        it[3] = GemStoneTile { IconFactory().rubyStone64() }

        it[6] = RainbowForestExitTile (
            { IconFactory().stairsUp64() },
            { BackgroundFactory().volcano() }
        )
    }
)