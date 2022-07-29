package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.investigation.CurrentInvestigation
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles.*

class NikitasHouse: Location(
    "Nikita's House", Array(12) { EmptyRedTile() as Tile }.also {

        it[0] = BedTile(
            CurrentInvestigation.NIKITAS_BED
        ) { BackgroundFactory().redCarpet() }

        it[1] = TableTile(
            CurrentInvestigation.NIKITAS_TABLE
        ) { BackgroundFactory().redCarpet()}

        it[2] = ClosetTile(
            CurrentInvestigation.NIKITAS_CLOSET
        ) { BackgroundFactory().redCarpet() }

        it[11] = CupboardTile(
            CurrentInvestigation.NIKITAS_CUPBOARD
        ) { BackgroundFactory().redCarpet() }

        it[10] = GreeneriaExitTile (
            { IconFactory().houseDoor64() },
            { BackgroundFactory().redCarpet() }
        )
    }
)