package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.investigation.CurrentInvestigation
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles.*

class EricasHouse: Location(
    "Erica's House", Array(12) { EmptyWoodenTile() as Tile }.also {

        it[3] = BedTile(
            CurrentInvestigation.ERICAS_BED
        ) { BackgroundFactory().woodenFloor() }

        it[0] = ClosetTile(
            CurrentInvestigation.ERICAS_CLOSET
        ) { BackgroundFactory().woodenFloor() }

        it[1] = CupboardTile(
            CurrentInvestigation.ERICAS_CUPBOARD
        ) { BackgroundFactory().woodenFloor() }

        it[8] = TableTile(
            CurrentInvestigation.ERICAS_TABLE
        ) { BackgroundFactory().woodenFloor() }

        it[10] = GreeneriaExitTile (
            { IconFactory().houseDoor64() },
            { BackgroundFactory().woodenFloor() }
        )
    }
)