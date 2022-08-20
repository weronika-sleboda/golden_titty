package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world

import com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs.BoomerangPlaceName
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.entrances.CurrentEntrance
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles.*

class RainbowForest : Location(
    "Rainbow Forest", Array(16) { EmptyTile { BackgroundFactory().grass() } as Tile }

        .also {


            it[0] = PalmTile(
                {IconFactory().peachPalm64()},
                { BackgroundFactory().grass() },
                BoomerangPlaceName.DATE_PALM
            )

            it[1] = EntranceTile(
                CurrentEntrance.TENT,
                {IconFactory().tent64()},
                {BackgroundFactory().grass()}
            )

            it[2] = EntranceTile(
                CurrentEntrance.UNIVERSITY,
                { IconFactory().campFire64() },
                {BackgroundFactory().grass()}
            )

            it[3] = PalmTile(
                { IconFactory().coconutPalm64() },
                { BackgroundFactory().grass() },
                BoomerangPlaceName.COCONUT_PALM
            )

            it[4] = EntranceTile(
                CurrentEntrance.CARRIAGE,
                {IconFactory().carriage64()},
                {BackgroundFactory().woodenFloor()}
            )

            it[5] = EmptyTile { BackgroundFactory().woodenFloor()}
            it[6] = EmptyTile { BackgroundFactory().woodenFloor()}

            it[7] = LocationTile(
                LocationName.PEARL_COAST
            ) { BackgroundFactory().woodenFloor() }

            it[8] = PalmTile({IconFactory().datePalm64()},
                { BackgroundFactory().grass() },
                BoomerangPlaceName.PEACH_PALM,
            )

            it[9] = EntranceTile(
                CurrentEntrance.CAFETERIA,
                { IconFactory().hut64() },
                {BackgroundFactory().grass()}
            )

            it[10] = EntranceTile(
                CurrentEntrance.BOOMERANG_SHOP,
                { IconFactory().bigHut64() },
                {BackgroundFactory().grass()}
            )


            it[11] = EntranceTile(
                CurrentEntrance.CAVE,
                { IconFactory().cave64() },
                {BackgroundFactory().grass()}
            )

            it[12] = EmptyTile { BackgroundFactory().water()}
            it[13] = EmptyTile { BackgroundFactory().water()}
            it[14] = EmptyTile { BackgroundFactory().water()}
            it[15] = EmptyTile { BackgroundFactory().water()}
        }
)