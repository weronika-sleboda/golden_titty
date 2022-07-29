package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.investigation.CurrentInvestigation
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles.*

class JinsHouse: Location(
    "Jin's House", Array(12) { EmptyWoodenTile() as Tile }.also {

        it[11] = BedTile(
            CurrentInvestigation.JINS_BED
        ) { BackgroundFactory().woodenFloor() }

        it[8] = ClosetTile(
            CurrentInvestigation.JINS_CLOSET
        ) { BackgroundFactory().woodenFloor() }

        it[3] = CupboardTile(
            CurrentInvestigation.JINS_CUPBOARD
        ) { BackgroundFactory().woodenFloor() }

        it[1] = TableTile(
            CurrentInvestigation.JINS_TABLE
        ) { BackgroundFactory().woodenFloor() }

        it[10] = GreeneriaExitTile (
            { IconFactory().houseDoor64() },
            { BackgroundFactory().woodenFloor() }
        )
    }
)