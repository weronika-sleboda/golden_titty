package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.investigation.CurrentInvestigation
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles.*

class KhansHouse: Location(
    "Khan's House", Array(12) { EmptyWoodenTile() as Tile }.also {

        it[1] = BedTile(
            CurrentInvestigation.KHANS_BED
        ) { BackgroundFactory().woodenFloor() }

        it[11] = ClosetTile(
            CurrentInvestigation.KHANS_CLOSET
        ) { BackgroundFactory().woodenFloor() }

        it[2] = CupboardTile(
            CurrentInvestigation.KHANS_CUPBOARD
        ) { BackgroundFactory().woodenFloor() }

        it[8] = TableTile(
            CurrentInvestigation.KHANS_TABLE
        ) { BackgroundFactory().woodenFloor() }

        it[10] = GreeneriaExitTile (
            { IconFactory().houseDoor64() },
            { BackgroundFactory().woodenFloor() }
        )
    }
)