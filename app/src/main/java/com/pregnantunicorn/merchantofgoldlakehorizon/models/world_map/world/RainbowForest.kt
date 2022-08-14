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

class RainbowForest : Location(
    "Rainbow Forest", Array(12) { EmptyTile { BackgroundFactory().grass() } as Tile }

        .also {


            it[0] = PalmTile(BoomerangPlaceName.DATE_PALM)
            it[1] = PalmTile(BoomerangPlaceName.COCONUT_PALM)
            it[2] = PalmTile(BoomerangPlaceName.PEACH_PALM)

            it[3] = EntranceTile(
                CurrentEntrance.CAFETERIA,
                {IconFactory().npcHouse64()},
                {BackgroundFactory().grass()}
            )

            it[4] = EmptyTile { BackgroundFactory().woodenFloor()}
            it[5] = EmptyTile { BackgroundFactory().woodenFloor()}
            it[6] = EmptyTile { BackgroundFactory().woodenFloor()}

            it[7] = LocationTile(
                LocationName.PEARL_COAST
            ) { BackgroundFactory().woodenFloor() }

            it[8] = EntranceTile(
                CurrentEntrance.TENT,
                {IconFactory().tent64()},
                {BackgroundFactory().grass()}
            )

            it[9] = EntranceTile(
                CurrentEntrance.CARRIAGE,
                {IconFactory().carriage64()},
                {BackgroundFactory().grass()}
            )

            it[10] = EntranceTile(
                CurrentEntrance.UNIVERSITY,
                {IconFactory().npcHouse64()},
                {BackgroundFactory().grass()}
            )

            it[11] = EntranceTile(
                CurrentEntrance.BOOMERANG_SHOP,
                {IconFactory().npcHouse64()},
                {BackgroundFactory().grass()}
            )

        }
)