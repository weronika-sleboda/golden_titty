package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world

import com.pregnantunicorn.merchantofgoldlakehorizon.models.tools.PalmType
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.entrances.CurrentEntrance
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles.*

class SleazeholeIsland : Location(
    "Sleazehole Island", Array(16) { EmptyTile { BackgroundFactory().beach() } as Tile }

        .also {


            it[0] = PalmTile(
                {IconFactory().peachPalm64()},
                { BackgroundFactory().beach() },
                PalmType.DATES
            )

            it[1] = EntranceTile(
                CurrentEntrance.TENT,
                {IconFactory().tent64()},
                {BackgroundFactory().beach()}
            )


            it[2] = EntranceTile(
                CurrentEntrance.CAVE,
                { IconFactory().cave64() },
                {BackgroundFactory().beach() }
            )

            it[3] = PalmTile(
                { IconFactory().coconutPalm64() },
                { BackgroundFactory().beach() },
                PalmType.COCONUT
            )

            it[5] = EmptyTile { BackgroundFactory().beach() }
            it[6] = EmptyTile { BackgroundFactory().beach() }

            it[8] = PalmTile({IconFactory().datePalm64()},
                { BackgroundFactory().beach() },
                PalmType.PEACH,
            )

            it[11] = WoodPalmTile()

            it[12] = EmptyTile { BackgroundFactory().water()}
            it[13] = EmptyTile { BackgroundFactory().water()}
            it[14] = EmptyTile { BackgroundFactory().water()}
            it[15] = EmptyTile { BackgroundFactory().water()}
        }
)