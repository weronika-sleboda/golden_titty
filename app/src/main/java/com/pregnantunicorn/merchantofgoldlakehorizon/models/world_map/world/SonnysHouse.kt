package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.investigation.CurrentInvestigation
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles.*

class SonnysHouse: Location(
    "Sonny's House", Array(12) { EmptyWoodenTile() as Tile }.also {

        it[3] = ClosetTile(
            CurrentInvestigation.SONNYS_CLOSET
        ) { BackgroundFactory().woodenFloor() }

        it[2] = BedTile(
            CurrentInvestigation.SONNYS_BED
        ) { BackgroundFactory().woodenFloor() }

        it[8] = CupboardTile(
            CurrentInvestigation.SONNYS_CUPBOARD
        ) { BackgroundFactory().woodenFloor() }

        it[0] = TableTile(
            CurrentInvestigation.SONNYS_TABLE
        ) { BackgroundFactory().woodenFloor() }

        it[10] = GreeneriaExitTile (
            { IconFactory().houseDoor64() },
            { BackgroundFactory().woodenFloor() }
        )
    }
)