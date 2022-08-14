package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world

import com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs.BoomerangPlaceName
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.entrances.CurrentEntrance
import com.pregnantunicorn.merchantofgoldlakehorizon.models.shops.Cafeteria
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles.*
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.BoomerangShopFragment
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.PearlTittyFragment
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.SleepingBagFragment

class PearlCoast : Location(
    "Pearl Coast", Array(12) { EmptyTile { BackgroundFactory().grass() } as Tile }

        .also {


            it[0] = EntranceTile(
                CurrentEntrance.TEMPLE_OF_LATTER_DAY_VAGINA_RAPTURE,
                {IconFactory().pearlTittyTemple64()},
                {BackgroundFactory().beach()}
            )

            it[1] = EntranceTile(
                CurrentEntrance.TEMPLE_OF_GRAND_BOOTY,
                {IconFactory().pearlTittyTemple64()},
                {BackgroundFactory().beach()}
            )

            it[2] = EntranceTile(
                CurrentEntrance.TEMPLE_OF_MONOTITTEISM,
                {IconFactory().pearlTittyTemple64()},
                {BackgroundFactory().beach()}
            )

            it[3] = EntranceTile(
                CurrentEntrance.TEMPLE_OF_END_TIMES_TWERK,
                {IconFactory().pearlTittyTemple64()},
                {BackgroundFactory().beach()}
            )

            it[4] = LocationTile(
                LocationName.RAINBOW_FOREST
            ) { BackgroundFactory().woodenFloor() }

            it[5] = EmptyTile { BackgroundFactory().woodenFloor()}
            it[6] = EmptyTile { BackgroundFactory().woodenFloor()}
            it[7] =  EmptyTile { BackgroundFactory().woodenFloor()}

            it[8] = EntranceTile(
                CurrentEntrance.TEMPLE_OF_PUSSYCAT_PROPHET,
                {IconFactory().pearlTittyTemple64()},
                {BackgroundFactory().beach()}
            )

            it[9] = EntranceTile(
                CurrentEntrance.TEMPLE_OF_HOLY_NIPPLE_REVIVAL,
                {IconFactory().pearlTittyTemple64()},
                {BackgroundFactory().beach()}
            )

            it[10] = EntranceTile(
                CurrentEntrance.TEMPLE_OF_TITTIES_AND_LEGS,
                {IconFactory().pearlTittyTemple64()},
                {BackgroundFactory().beach()}
            )

        }
)