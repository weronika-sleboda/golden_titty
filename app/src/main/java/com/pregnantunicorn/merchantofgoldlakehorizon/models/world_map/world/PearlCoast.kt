package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.entrances.CurrentEntrance
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles.*

class PearlCoast : Location(
    "Pearl Coast", Array(16) { EmptyTile { BackgroundFactory().grass() } as Tile }

        .also {


            it[0] = EntranceTile(
                CurrentEntrance.HUT,
                {IconFactory().bungalow64()},
                {BackgroundFactory().beach()}
            )

            it[1] = EntranceTile(
                CurrentEntrance.TEMPLE_OF_LATTER_DAY_VAGINA_RAPTURE,
                {IconFactory().pearlTittyTemple64()},
                {BackgroundFactory().beach()}
            )

            it[2] = EntranceTile(
                CurrentEntrance.CITY_COUNCIL,
                {IconFactory().house64()},
                {BackgroundFactory().beach()}
            )

            it[3] = EntranceTile(
                CurrentEntrance.BUNGALOW,
                {IconFactory().bigBungalow64()},
                {BackgroundFactory().beach()}
            )

            it[4] = LocationTile(
                LocationName.RAINBOW_FOREST
            ) { BackgroundFactory().woodenFloor() }

            it[5] = EmptyTile { BackgroundFactory().woodenFloor() }
            it[6] = EmptyTile { BackgroundFactory().woodenFloor() }
            it[7] = EmptyTile { BackgroundFactory().woodenFloor() }

            it[8] = EntranceTile(
                CurrentEntrance.MAUSOLEUM,
                {IconFactory().mausoleum64()},
                {BackgroundFactory().beach()}
            )

            it[9] = EntranceTile(
                CurrentEntrance.LIBRARY,
                {IconFactory().library64()},
                {BackgroundFactory().beach()}
            )

            it[10] = EntranceTile(
                CurrentEntrance.BOOMERANG_SHOP,
                { IconFactory().palace64() },
                {BackgroundFactory().beach()}
            )

            it[11] = EntranceTile(
                CurrentEntrance.BOOMERANG_SHOP,
                { IconFactory().statue64() },
                {BackgroundFactory().beach()}
            )

            it[12] = EmptyTile { BackgroundFactory().water() }
            it[13] = EmptyTile { BackgroundFactory().water() }
            it[14] = EmptyTile { BackgroundFactory().water() }
            it[15] = EmptyTile { BackgroundFactory().water() }
        }
)