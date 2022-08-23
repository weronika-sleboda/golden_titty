package com.pregnantunicorn.goldentitty.models.world_map.world

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.graphics.BackgroundFactory
import com.pregnantunicorn.goldentitty.models.npcs.CurrentNpc
import com.pregnantunicorn.goldentitty.models.world_map.tiles.*

class SleazeholeIslandEast: Location(
    "Sleazehole Island", Array(16) { EmptyTile { BackgroundFactory().beach() } as Tile }

        .also {

            it[4] = LocationTile(
                LocationName.SLEAZEHOLE_ISLAND_WEST
            ) { BackgroundFactory().beach() }

            it[5] = NpcTile(R.drawable.saphonee64, CurrentNpc.SAPHONEE)

            it[12] = EmptyTile { BackgroundFactory().water()}
            it[13] = EmptyTile { BackgroundFactory().water()}
            it[14] = EmptyTile { BackgroundFactory().water()}
            it[15] = EmptyTile { BackgroundFactory().water()}
        }
)